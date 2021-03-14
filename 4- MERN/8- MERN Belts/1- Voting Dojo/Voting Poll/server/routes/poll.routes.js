// const PollController = require('../controllers/poll.controller');

// module.exports = (app) => {
//     app.post('/api/polls', PollController.createPoll);
//     app.get('/api/polls', PollController.findAllPoll);
//     app.get('/api/polls/:id', PollController.findOnePoll);
//     app.put('/api/polls/:id/vote', PollController.updatePoll);
//     app.delete('/api/polls/:id', PollController.deletePoll);
// };
const PollController = require('../controllers/poll.controller.js')

module.exports = function (app) {
    console.log('Setting up routes...');
    app.get('/api', (request, response, next) => {
        return response.json({
            "status": "ok"
        });
    });
    app.get('/api/polls', PollController.getPolls);
    app.post('/api/polls', PollController.addPoll);
    app.get('/api/poll/:pollId', PollController.getPollById);
    app.post('/api/poll/:pollId/vote', PollController.vote);
}