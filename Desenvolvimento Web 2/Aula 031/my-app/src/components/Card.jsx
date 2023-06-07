import React from 'react';
import "./style.css"

 class Card extends React.Component{
    render(){
        return(
            <div>
                <div className='cardContainer'>
                    <img src={this.props.imgURL} alt={"foto de perfil de " + this.props.name} />
                    <h3>{this.props.name}</h3>
                </div>
            </div>
        )
    }
 }
 export default Card