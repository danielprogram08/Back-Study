const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question(`Insira um valor: `, (valor) => {
    if (valor % 2 == 0) {
        console.log("O valor informado é par!");
    } else {
        console.log("O valor informado é impar!");
    }
})