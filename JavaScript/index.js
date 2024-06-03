//Tipos de Saída;
document.getElementById("teste").innerHTML = "Hello World!";
console.log("Hello World!");
alert("Hello World!");

//Tipos de Variáveis: Var, Let, Const(Constante);
//OBS: "Const" não mudará seu valor, sempre se manterá constante; 
const idade = 19;
console.log("Minha idade: " + idade);

//OBS: "Let" só poderá ser declarado uma vez;
let sobrenome = "Silva";
console.log("Meu sobrenome: " + sobrenome);

//Declarando Variáveis (Var);
//OBS: O "Var" sempre muda de acordo com o que for definido;
var nome = "Daniel";
console.log("Meu nome: " + nome);

var a = 1, b = 2, c = 3;
var soma;
soma = (a + b + c);
console.log(soma);