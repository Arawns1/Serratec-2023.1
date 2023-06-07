import { useState } from "react";

export function App2(){
    const[counter, setCounter] = useState(0);

    const handleIncrement = () => {
        setCounter(counter + 1) //quando aqui virar 1
        console.log(counter)//Aqui ainda vai ser 0
        //Quando finalizar essa função o counter irá para um
      }

    return(
        <div>
        <h1>ISSO É UM COMPONENTE DE Função</h1>
        <h2>{counter}</h2>
        <button onClick={handleIncrement}>Incrementar</button>
      </div>
    )
}