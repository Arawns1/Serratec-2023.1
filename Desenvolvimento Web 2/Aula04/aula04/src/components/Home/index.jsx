import {useState} from 'react';
import './style.css'

function Home(){

    //let numbers = [1,2,3,4,5,6,7]
    //let [a, b] = numbers -> 1,2
    // a = 1
    // b = 2

    const [count, setCount] = useState(0)

    return(
        <div >
            <h1> Contador </h1>
            <h2>{count}</h2>
            <button onClick={() => setCount(count + 1)}> Aumentar </button>
        </div>
    )
}

export default Home