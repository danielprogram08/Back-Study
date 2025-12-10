const app = require('./app.js');

// iniciando o servidor na porta 3000;
app.listen('3000', () => {
    console.log('O servidor está rodando na porta 3000');
});