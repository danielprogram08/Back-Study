const connection = require('../connection.js');

const getAllUsers = async () => {
    const users = await connection.execute('SELECT * FROM Users');
    return users;
};

const createUser = async (task) => {
    const { name, email, password } = task;
    const query = 'INSERT INTO Users (name, email, password) VALUES (?, ?, ?)'
    const createdUser = await connection.execute(query, [name, email, password]);
    return createdUser;
};

module.exports = { getAllUsers, createUser };