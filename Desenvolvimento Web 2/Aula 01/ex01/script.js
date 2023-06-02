function modoNormal(){
    let pessoas = [
        {
        "nome" : "Gabriel",
        "imagem" : "https://avatars.githubusercontent.com/u/62900084?v=4"
        },
        {
        "nome" : "Gabriel",
        "imagem" : "https://avatars.githubusercontent.com/u/62900084?v=4"
        }
    ]
    
    
    pessoas.map(pessoa => document
                        .querySelector(".people-container")
                        .innerHTML += `<h1>${pessoa.nome}</h1>
                                       <img src= ${pessoa.imagem} />`)
    

}

function comApi(){
    let perfis = ["Arawns1","S4nt1ag", "artoda", "boubeejul","Anuuxy","JoaoMarcoPiccoliCardoso"]
    window.onload = async function(){
        for await(var perfil of perfis){
            const data = await fetch(`https://api.github.com/users/${perfil}`);
            const json = await data.json();
            document.querySelector(".content-container")
                    .innerHTML += ` <div class="people-container">
                                    <img src=${json.avatar_url}/>
                                    <h1>${json.login}</h1>
                                    <h2>${json.bio}</h2>
                                    <a class="button" href=${json.html_url} target="_blank">Link do Perfil</a>
                                    </div>
                                    `
        }
    }
}

comApi()

