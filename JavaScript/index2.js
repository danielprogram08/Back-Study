//Declarando uma funcão;
//OBS: Primeiro, declare a função, insira o produto que a função irá retornar, por fim, chame-a após declarar uma variável;
function soma(valor, valor2) {
    return valor + valor2;
}

let resultado = soma(5, 5);
console.log(resultado);

//Objetos em JavaScript;
const carro = {
    marca: "Ford",
    modelo: "Mustang",
    ano: 2018,
    cor: "Branco",

    //método;
    buzina: function () { alert("bii bii") },

    //Retornando o Objeto;
    completo: function () {
    return console.log ("A marca é " + this.marca + " o Modelo é: " + this.modelo)   
    }
};

//Chamando o Objeto;
console.log(carro.marca);
console.log(carro.modelo);

//Chamando o Método;
carro.buzina();
carro.completo();