const mongoose = require('mongoose');
const Vote = require('./vote.model.js')
const uniqueValidator = require('mongoose-unique-validator');

function arrayLimit(val) {
    return val.length >= 2;
}

const PollSchema = new mongoose.Schema({
    question : { type: String, required: [true, "You Must add a question!"], minlength: [10, "The" +
        " question must be at least 10 characters or longer!"] },
    options: { type: [String], validate: [arrayLimit, 'There should be at least 2 options'],unique:true  },
    votes: { type: [Vote.schema], required: true },
    number_of_votes: { type: Number, required: true },
    status : { type: String, required: false }
}, {
    timestamps: true
});

const Poll = mongoose.model("Poll", PollSchema);
PollSchema.plugin(uniqueValidator, { message: `This question is already in the database` });


module.exports = Poll;