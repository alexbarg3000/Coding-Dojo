const { Project } = require('../models/project.model')


module.exports.createProject = (request, response) => {

    const { name } = request.body;
    Project.create({
        name
    })
        .then(project => response.json(project))
        .catch((err) => response.status(400).json(err));
}

module.exports.getAllProject = (request, response) => {
    Project.find({})
        .then((project) => response.json(project))
        .catch((err) => response.status(400).json(err));
};

module.exports.getProject = (request, response) => {
    Project.findOne({ _id: request.params.id })
        .then((project) => response.json(project))
        .catch((err) => response.status(400).json(err));
}

module.exports.updateProject = (request, response) => {
    Project.findOneAndUpdate({ _id: request.params.project_id }, request.body, {
        new: true,
        runValidators: true, context: 'query'
    })
        .then((updatedProject) => response.json(updatedProject))
        .catch((err) => response.status(400).json(err));
}

module.exports.deleteProject = (request, response) => {
    Project.deleteOne({ _id: request.params.id })
        .then((deleteConfirmation) => response.json(deleteConfirmation))
        .catch((err) => response.status(400).json(err));
}