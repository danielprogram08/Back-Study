// Ao iniciar um projeto, use o comando 'npm init' para preencher todos os valores padrões e inicializar o projeto node, caso desejar que tudo seja padrão, use o comando 'npm init -y';


//biblioteca de entrada e saída de dados;
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

//inserção de dados;
rl.question(`Informe o seu nome: `, (nome) => {
    console.log(`olá ${nome}, seja bem-vindo!`)
})