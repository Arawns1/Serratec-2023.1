//Lista de Exercícios – Funções em JavaScript
//Escreva uma função em JavaScript que mostre na tela a mensagem “Bom dia, Mundo!!!”.

function oiMundo(){
    return console.log("olá mundo")
}
oiMundo()


//Escreva uma função que retorne o cubo de um número fornecido pelo usuário.

const cubo = number => Math.pow(number,3)

console.log(cubo(3))


//Escreva uma função em JavaScript que realize a conversão de uma temperatura fornecida em graus Fahrenheit (F) para Celsius (C).
//Dica: para converter uma temperatura em F para C, subtraia 32 da temperatura e multiplique o resultado por 0,5556 (ou 5/9).

function toCelsius(tempF){
    return ((tempF - 32) * 5/9).toFixed(2) + "º C"
}

console.log(toCelsius(32))

//Escreva uma função que retorne a área de um triângulo, a partir dos valores de base e altura fornecidos.

const trianguleArea = (base, altura) => (base*altura)/2;
console.log(trianguleArea(2,2))

//Escreva uma função que calcule e retorne o fatorial de um número inteiro fornecido pelo usuário.

function fatorial(number){
    let temp = 1;
    for(let i = number; i >= 1; i--){
        temp *= i;
    }
    return temp;
}

console.log(fatorial(10))


//Escreva uma função em JavaScript que conte quantas vezes um caractere aparece em uma string. 
//Obs.: Tanto o caractere quanto a string devem ser fornecidos pelo usuário.

function charCounter(string, char){
   let arrStr = string.toUpperCase().split('');
   return `Existem ${(arrStr.filter(character => character == char.toUpperCase())).length} '${char}' na palavra ${string}`;
}

console.log(charCounter("Batata", 'b'))

//Escreva uma função que verifica se um número fornecido pelo usuário em um prompt é primo ou não.

function isPrimo(number){
    if (number < 2) {
        return false;
      }
    
      for (let i = 2; i < number; i++) {
        if (number % i === 0) {
          return false;
        }
      }
    
      return true;
}

console.log(isPrimo(1))

//Escreva uma função que mostre na tela um número fornecido pelo usuário, porém invertido. Por exemplo, o usuário fornece o número 921 e a função mostra na tela o número 129.

function reverseNumbers(number){
    let reveredArr = number.toString()
                           .split('')
                           .reverse()
                           .join()
                           .replaceAll(',','');
    return reveredArr;
}
console.log(reverseNumbers(12312))