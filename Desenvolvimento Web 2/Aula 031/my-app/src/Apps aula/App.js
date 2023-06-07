import './App.css';
import React from "react"

class App extends React.Component{
  
  counter = 0
  name = "Gabriel Damico"
  time = new Date()

  state = {
    counter : 0,
  }
  handleIncrement = () => {
    this.setState({counter : this.state.counter + 1})
    console.log(this.state.counter)
  }

  handleNameChange = () => {
    this.name = "Carlos"
    console.log(this.name)
  }

  render () {
    return(
      <div>
        <h1>ISSO É UM COMPONENTE DE CLASSE</h1>
        <h2> Bem vindo, {this.name} </h2>
        <h2>{this.state.counter}</h2>
        <button onClick={this.handleNameChange}>Mudar nome</button>
        <button onClick={(e = this.time) => {this.handleNameChange(e)}}></button>
        <button onClick={this.handleIncrement}>Incrementar</button>
      </div>
    )
  }
}

export default App;
