const mongoose =require ('mongoose');
const bcrypt = require('bcrypt');
const uniqueValidator = require('mongoose-unique-validator');


const UserSchema = new mongoose.Schema({
    firstName:{
        type: String,
        required: [true, "First name is required!"],
        minlength:[
            2,
            'First must be at least 2 characters!'
        ]
    },

    lastName:{
        type:String,
        required: [true, "Last name is required!"],
        minlength:[
            2,
            'Last must be at least 2 characters!'
        ]
    },

    email:{
        type:String,
        unique:true,
        required: [
            true,
            "Email is required!"
        ],
        validate:{
            validator: val => /^([\w-\.]+@([\w-]+\.)+[\w-]+)?$/.test(val),
            message: "Please enter a valid email!"
        }
    },

    password:{
        type:String,
        required: [true, "Password is required!"],
        minlength:[
            8,
            'Password must be 8 characters or longer!'
        ]
    }

},{
    timestamps:true
});

UserSchema.virtual('confirmPassword')
    .get( () => this._confirmPassword )
    .set( value => this._confirmPassword = value );



UserSchema.pre('validate', function(next) {
    if (this.password !== this.confirmPassword) {
        this.invalidate('confirmPassword', 'Password must match confirm password');
    }
    next();
});


UserSchema.pre('save', function(next) {
    bcrypt.hash(this.password, 10)
        .then(hash => {
            this.password = hash;
            next();
        });
});

UserSchema.plugin(uniqueValidator, { message: `This user is already in the database` });


module.exports = mongoose.model("User",UserSchema);