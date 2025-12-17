const connection = require('../connection.js');

const getAll = async () => {
    const users = await connection.execute('SELECT * FROM Users');
    return users;
};

module.exports = { getAll };