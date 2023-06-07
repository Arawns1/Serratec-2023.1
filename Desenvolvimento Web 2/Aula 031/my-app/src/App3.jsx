import React from 'react';
import Card from "./components/Card";
import './App3.css'

class App3 extends React.Component{
    state = {
        users: []
      }
    
      async componentDidMount() {
        const newUsers = await fetch("https://api.github.com/users");
        const usersJson = await newUsers.json();
        this.setState({users : usersJson})
      }
      
      render() {
        return (
          <div className='container'>
            {
                this.state.users.map(user => {
                    return(
                        <Card key={user.id} name={user.login} imgURL={user.avatar_url} />
                    )
                })
            }
            
          </div>
        );
      }
    }

export default App3