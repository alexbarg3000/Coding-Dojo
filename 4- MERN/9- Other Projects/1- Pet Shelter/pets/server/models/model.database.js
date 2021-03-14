const mongoose = require('mongoose');
const uniqueValidator = require('mongoose-unique-validator');



const PetSchema = new mongoose.Schema({
    name: {
        type: String,
        unique: [true, "This pet already exists in our system!"],
        required: [true, "Pet must have a name!"],
        minlength: [3, "Name must be at least 3 characters"],
        maxlength: [50, "Name must be less than 50 characters"],
        trim: true
    },
    type: {
        type: String,
        required: [true, "Pet must have a type"],
        minlength: [3, "Type must be at least 3 characters"],
        maxlength: [50, "Type must be less than 50 characters"],
        trim: true
    },
    desc: {
        type: String,
        required: [true, "Pet must have a description!"],
        minlength: [3, "Description must be at least 3 characters"],
        maxlength: [50, "Description must be less than 50 characters"],
        trim: true
    },
    skill1: {
        type: String
    },
    skill2: {
        type: String
    },
    skill3: {
        type: String
    },
    like: {
        type: Number,
        default: 0
    }

}, {timestamps: true})

PetSchema.plugin(uniqueValidator, { message: `Pet is already in the database` });

// PetSchema.plugin(uniqueValidator, { message: '{PATH} is already in the database' });


const Pet = mongoose.model("Pet", PetSchema);

module.exports = Pet;