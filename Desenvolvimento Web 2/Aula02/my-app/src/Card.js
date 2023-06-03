import { Button } from "./Button"

import {useState, useEffect} from "react";


export function Card(){

    const [usuarios, setUsuarios] = useState([])

    const nomes = ["Arawns1","JoaoMarcoPiccoliCardoso","S4nt1ag", "artoda", "boubeejul","Anuuxy"]

    useEffect(() => {
        async function fetchData(){
            var usersArray = []
            for await(var nome of nomes){
                const data = await fetch(`https://api.github.com/users/${nome}`);
                const user = await data.json();
                usersArray.push({nome : user.name, 
                                fotoURL: user.avatar_url, 
                                login: user.login,
                                bio: user.bio} );
            }
            setUsuarios(usersArray)
        }
            fetchData()
         }, [])

    return(
        <>
            {usuarios.map(usuario => {
                 return(
                    <div className="card-container">
                     <img src={usuario.fotoURL} alt= {'Foto de perfil de ' + usuario.login} />
                     <h1>{usuario.nome}</h1>
                     <h2>{usuario.bio}</h2>
                     <Button/>
                    </div>
                )
             }
            )}
        </>
    )
}