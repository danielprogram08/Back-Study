const readline = require ('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

let variable;

rl.question(`Insira um valor (Número ou Nome): `, (value) => {
    variable = value;
    if (typeof(variable) == "string") {
        console.log("Esta variável é do tipo String!")
    } else {
        console.log("Esta variável não é do tipo String!")
    }
});