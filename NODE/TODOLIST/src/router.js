const express = require('express');
const router = express.Router();

// teste de requisição;
router.get('/test', (req, res) => {
    res.status(200).send('Servidor rodando com Express!');
});

module.exports = router;