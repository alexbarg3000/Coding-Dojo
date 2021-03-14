const User = require("../models/User.model")
const jwt = require("jsonwebtoken")
const bcrypt = require('bcrypt')

module.exports = {
    register: (req, res) => {
        User.create(req.body)
            .then((user) => {

                const userToken = jwt.sign({ id: user._id }, process.env.MY_SECRET)

                res.cookie("mycookie", userToken, { httpOnly: true }).json({
                    message: "This response has a cookie",
                    user,
                })

            })
            .catch((err) => res.status(400).json(err))
    },
    login: async (req, res) => {
        const user = await User.findOne({ email: req.body.email })

        if (!req.body.email) {
            console.log(user)

            return res.status(400).json({errors:{message:"Not all fields have been entered"}})
        }

        if (user === null) {
            console.log(user)

            return res.status(400).json({errors:{message:"No account with this email has been registered"}})
        }




        const correctPassword = await bcrypt.compare(
            req.body.password,
            user.password
        )

        if (!correctPassword) {
            return res.status(400).json({errors:{message:"Password is not correct"}})
        }


        const userToken = jwt.sign(
            {
                id: user._id,
            },
            process.env.MY_SECRET
        )


        res
            .cookie("mycookie", userToken, process.env.MY_SECRET, {
                httpOnly: true,
            })
            .json({ msg: "success!", user })
    },
    getOne: (req, res) => {
        User.findOne({ _id: req.params.id })
            .then((user) => res.json(user))
            .catch((err) => res.status(400).json(err));
            // .then((users) => {
            //     console.log(users)
            //     res.json({ users })
            // })
            // .catch((err) => res.status(400).json(err))
    },
    logout: (req, res) => {
        res.clearCookie("mycookie")
        res.sendStatus(200)
    },

    updateUser : (request, response) => {
        User.findOneAndUpdate({ _id: request.params.user_id}, request.body, {
            new: true,
        })
            .then((updatedUser) => response.json(updatedUser))
            .catch((err) => response.status(400).json(err));
    }
}