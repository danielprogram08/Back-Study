const express = require('express');
const router = express.Router();
const tasksController = require('./Models/Controller/UserController.js')

// teste de requisição;
router.get('/test', (req, res) => {
    res.status(200).send('Servidor rodando com Express!');
});

// Retornando todos os usuários;
router.get('/users', tasksController.getAll)

module.exports = router;