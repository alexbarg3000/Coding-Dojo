const ProductModel = require("../models/product.models");

module.exports = {
    findAll: (req, res) => {
        ProductModel.find()
            .then(products => res.json({ products: products }))
            .catch(err => res.json({ error: err }));
    },

    findOne: (req, res) => {
        ProductModel.findById(req.params._id)
            .then(product => res.json({ product: product }))
            .catch(err => res.json({ error: err }));
    },

    create: (req, res) => {
        ProductModel.create(req.body)
            .then(result => res.json({ result: result }))
            .catch(err => res.json({ error: err }));
    },

    update: (req, res) => {
        ProductModel.findByIdAndUpdate(req.params._id, req.body, { new: true })
            .then(result => res.json({ result: result }))
            .catch(err => res.json({ error: err }));
    },

    delete: (req, res) => {
        ProductModel.findByIdAndRemove(req.params._id)
            .then(result => res.json({ result: result }))
            .catch(err => res.json({ error: err }));
    },
};