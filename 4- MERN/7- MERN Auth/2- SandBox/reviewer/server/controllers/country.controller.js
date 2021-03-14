const { Country } = require('../models/country.model')


module.exports.createCountry = (request, response) => {

    const { name } = request.body;
    Country.create({
        name
    })
        .then(country => response.json(country))
        .catch((err) => response.status(400).json(err));
}

module.exports.getAllCountry = (request, response) => {
    Country.find({})
        .then((country) => response.json(country))
        .catch((err) => response.status(400).json(err));
};

module.exports.getCountry = (request, response) => {
    Country.findOne({ _id: request.params.id })
        .then((country) => response.json(country))
        .catch((err) => response.status(400).json(err));
}

module.exports.updateCountry = (request, response) => {
    Country.findOneAndUpdate({ _id: request.params.country_id }, request.body, {
        new: true,
        runValidators: true, context: 'query'
    })
        .then((updatedCountry) => response.json(updatedCountry))
        .catch((err) => response.status(400).json(err));
}

module.exports.deleteCountry = (request, response) => {
    Country.deleteOne({ _id: request.params.id })
        .then((deleteConfirmation) => response.json(deleteConfirmation))
        .catch((err) => response.status(400).json(err));
}