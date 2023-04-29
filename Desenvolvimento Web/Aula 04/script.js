
function testaPalindromo(nome){
  let reversedString = nome.split('').reverse().join().replaceAll(',','')
  console.log(reversedString)
  
  if(nome.toUpperCase() == reversedString.toUpperCase()){
    console.log("É palindromo")
  }
  else{
    console.log("Não é palindromo")
  }
}
testaPalindromo("aRaRa")