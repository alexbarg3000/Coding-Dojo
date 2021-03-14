const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/users',{
    useNewUrlParser:true,
    useUnifiedTopology:true,
    useFindAndModify:true,
    useCreateIndex:true
})
    .then(() => console.log("Successfully connected to the db"))
    .catch((err) => console.error("Something went wrong! when connecting to the database\n", err))