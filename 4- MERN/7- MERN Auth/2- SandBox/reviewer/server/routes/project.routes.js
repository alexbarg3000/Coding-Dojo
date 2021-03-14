
const ProjectController = require('../controllers/project.controller');
const Users = require('../controllers/user.controller');
const Countries = require('../controllers/country.controller');
const { authenticate } = require('../config/jwt.config');

module.exports = function(app) {
    app.post("/api/register", Users.register);
    app.post("/api/login", Users.login);
    app.get("/api/logout", Users.logout);
    app.get("/api/user/:id", Users.getOne);
    app.put("/api/user/edit/:user_id", Users.updateUser)
    app.post('/api/new', ProjectController.createProject);
    app.get('/api/project', ProjectController.getAllProject);
    app.get('/api/project/:id', ProjectController.getProject);
    app.put("/api/project/:project_id/edit", ProjectController.updateProject)
    app.delete("/api/project/:id", ProjectController.deleteProject)
    app.post("/api/country", Countries.createCountry);
    app.get("/api/country", Countries.getAllCountry);
    app.delete("/api/country/:id", Countries.deleteCountry)

}