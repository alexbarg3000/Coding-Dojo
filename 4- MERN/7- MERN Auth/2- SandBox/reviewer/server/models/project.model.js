const mongoose = require('mongoose');
var uniqueValidator = require('mongoose-unique-validator');


const ProjectSchema = new mongoose.Schema({
    name: {
        type: String,

    }
}, { timestamps: true })

ProjectSchema.plugin(uniqueValidator, { message: `This book already exists in the system!` });


module.exports.Project = mongoose.model('Project', ProjectSchema);