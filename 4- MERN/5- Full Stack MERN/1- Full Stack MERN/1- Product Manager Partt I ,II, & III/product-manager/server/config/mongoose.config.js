const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/product_db', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
    .then(() => console.log("Database connection established!"))
    .catch((err) => console.log("Error occurred when attempting to connect to DB: ", err))