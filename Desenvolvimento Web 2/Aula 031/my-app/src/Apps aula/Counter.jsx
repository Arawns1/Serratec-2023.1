import React from "react";

class Counter extends React.Component{

    state = {
        counter : 0
    }

    handleIncrement = () =>{
        this.setState({counter : this.state.counter + 1}) //Aqui tá 6
        //console.log(this.state.counter) //aqui ainda tá 5
    }

    showCounter = () =>{
        console.log(this.state.counter)
    }
    //Agora aqui o counter vira 6

    render(){
        return(
            <>
            {/* */}
            <h1>{this.state.counter}</h1>
            <button onClick={this.handleIncrement}>Incrementar valor</button>
            <button onClick={this.showCounter}>Mostrar valor</button>
            </>
        )
    }
}

export default Counter