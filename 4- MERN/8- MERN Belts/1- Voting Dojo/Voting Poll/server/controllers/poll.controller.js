// const {Poll} = require('../models/poll.model');

// module.exports.createPoll = (req, res) => {
//     const {question, options, votes, number_of_votes, status} = req.body;
//     Poll.create({
//         question, 
//         options,
//         status,
//         votes, 
//         number_of_votes
//     })
//     .then(poll => res.json(poll))
//     .catch(err => res.status(500).json(err))
// };

// module.exports.findAllPoll = (req, res) => {
//     Poll.find({})
//     .then(allPoll => res.json(allPoll))
//     .catch(err => res.status(500).json(err));
// };

// module.exports.findOnePoll = (req, res) => {
//     Poll.findOne({_id: req.params.id})
//     .then(poll => res.json(poll))
//     .catch(err => res.status(500).json(err));
// };

// module.exports.deletePoll = (req, res) => {
//     Poll.deleteOne({_id:req.params.id})
//     .then(deleteConfirmation => res.json(deleteConfirmation))
//     .catch(err => res.json(err));
// };

// module.exports.updatePoll = (req, res) => {
//     Poll.updateOne({_id:req.params.id}, req.body, {new:true})
//     .then(updatedPoll => {
//         res.json(updatedPoll)
//     })
//     .catch(err => res.status(500).json(err))
// };

var utils = require('../utils/writer.js');
var Poll = require('../service/poll.service.js');

module.exports.addPoll = function addPoll (req, res, next) {
    const body = req.body;
    Poll.addPoll(body)
        .then(function (response) {
        utils.writeJson(res, response);
        })
        .catch(function (response) {
        utils.writeJson(res, response);
        });
    };

module.exports.getPollById = function getPollById (req, res, next) {
    const pollId = req.params.pollId;
    Poll.getPollById(pollId)
        .then(function (response) {
        utils.writeJson(res, response);
        })
        .catch(function (response) {
        utils.writeJson(res, response);
        });
    };

module.exports.getPolls = function getPolls (req, res, next) {
    const status = req.query.status;
    Poll.getPolls(status)
        .then(function (response) {
        utils.writeJson(res, response);
        })
        .catch(function (response) {
        utils.writeJson(res, response);
        });
};

module.exports.vote = function vote (req, res, next) {
    const pollId = req.params.pollId;
    const body = req.body;
    Poll.vote(body, pollId)
        .then(function (response) {
        utils.writeJson(res, response);
        })
        .catch(function (response) {
        utils.writeJson(res, response);
        });
    };