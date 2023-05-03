var textHeader = ["Futuro Desenvolvedor FullStack","Residente Serratec 2023.1","Cursando Ciência da Computação"]
  
var j = 0;
  var counter = 0;
  var i = setInterval(function(){
  var textoh3 = document.getElementById("title-text");
  textoh3.innerHTML = `<h3 id="title-text"> ${textHeader[j]}</h3>`;
      counter++;
      if(counter === 900) {
          clearInterval(i);
      }
      j++;
      if(j === 3){
        j=0
      }
  }, 3000);


  let myHashMap = new Map([
    [1,"Gabriel"],
    [2, "Pedro"],
    [3, "Henrique"]
  ]);

  console.log(myHashMap.get(1))