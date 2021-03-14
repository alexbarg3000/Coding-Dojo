const mongoose = require("mongoose");

mongoose.connect("mongodb://localhost/productManager", {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    useFindAndModify: false
})
    .then((res) => console.log("Established connection to the database"))
    .catch((err) => console.log(`There was an error when connecting to the database. Error: ${err}`));