const ProductController = require("../controllers/product.controller");

module.exports = app => {
    app.get("/api/products", ProductController.findAll);
    app.get("/api/products/:_id", ProductController.findOne);
    app.put("/api/products/:_id/update", ProductController.update);
    app.post("/api/products/create", ProductController.create);
    app.delete("/api/products/:_id/delete/", ProductController.delete);
};