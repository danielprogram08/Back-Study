//Entrada e saída de dados;
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question(`Insira um valor: `, (valor) => {
    rl.question(`Agora, insira outro valor: `, (valor2) => {
        if (valor > valor2) {
            console.log("O maior valor é: " + valor);
        } else if (valor2 > valor) {
            console.log("O maior valor é: " + valor2)
        }
    })
})