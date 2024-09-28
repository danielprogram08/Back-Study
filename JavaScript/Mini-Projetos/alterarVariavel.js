//entrada e saída de dados;
const readline = require ('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

//alteração de variável;
let systemcolor = 'blue';

rl.question(`insira a cor que deseja colocar: `, (color) => {
    function newColor() {
        systemcolor = color;
    } newColor();

    console.log(`A nova cor do sistema é: ${systemcolor}!`);
});