const usersRepository = require('../Repository/usersRepository.js');

const getAll = async (req, res) => {
    const tasks = await usersRepository.getAll();
    return res.status(200).json(tasks);
};

module.exports = {
    getAll
};