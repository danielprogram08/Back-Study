const usersRepository = require('../Models/Repository/usersRepository.js');

const getAll = async (req, res) => {
    const [tasks] = await usersRepository.getAllUsers();
    return res.status(200).json(tasks);
};

const createdUser = async (req, res) => {
    const createduser = await usersRepository.createUser(req.body);
    return res.status(201).json(createduser);
};

module.exports = {
    getAll, createdUser
};