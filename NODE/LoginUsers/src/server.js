const app = require('./app.js');
require('dotenv').config();
const port = process.env.PORT || 3000;

// iniciando o servidor na porta 3000;
app.listen(port, () => {
    console.log('O servidor está rodando na porta 3000');
});