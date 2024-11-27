const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

let nota1, nota2, nota3;

rl.question(`Informe sua nota1: `, (value) => {
    nota1 = value

    rl.question(`Informe sua nota2: `, (value2) => {
        nota2 = value2;

        rl.question(`Informe sua nota3: `, (value3) => {
            nota3 = value3;

            calc = (nota1 + nota2 + nota3 / 4)
            if (calc >= 6) {
                console.log("Você foi aprovado!");
            } else {
                console.log("Você foi reprovado!");
            }
        })
    })
});