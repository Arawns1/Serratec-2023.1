import { useEffect, useState } from 'react';
import pokemonData from "../../data.json";
import {Container,
        TitleContainer,
        ContentContainer,
        PokeCard
    } from './style'
function Home(){

    const [pokemons, setPokemons] = useState([]);
    const[isHidden, setisHidden] = useState(true);


    useEffect(() => {
        function fetchData() {
            setTimeout(() => {
                var pkmnFormatted = pokemonData.map(pokemon => {
                    var str = "" + pokemon.id
                    var pad = "000"
                    var newId = pad.substring(0, pad.length - str.length) + str

                    return {...pokemon, newId: newId}
                });

                setPokemons(pkmnFormatted)
            }, 2000)
        }

        fetchData();
    }, [])

    return(
        <Container>
            <TitleContainer>
                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Pok%C3%A9_Ball_icon.svg/1200px-Pok%C3%A9_Ball_icon.svg.png" alt="Pokeball" />
                <h1>Pokedex</h1>
                <button onClick={() => setisHidden(!isHidden)}>{isHidden ? 'Unhide Pokedex' : 'Hide Pokedex'}</button>
            </TitleContainer>
            <ContentContainer>
                {
                    isHidden? (
                        null
                    ) : (
                        pokemons.map(pokemon => {
                            return(
                                <>
                                <PokeCard key={pokemon.id} pokemonType={pokemon.type[0]} >
                                    <img src={`https://assets.pokemon.com/assets/cms2/img/pokedex/full/${pokemon.newId}.png`} alt={pokemon.name.english} />
                                    <h3>{pokemon.name.english}</h3>
                                    <span>{pokemon.type[0] + ' | ' + pokemon.type[1]}</span>
                                </PokeCard>
                                </>
                            )
                        })
                    )
                }
            </ContentContainer>
        </Container>
    )
}

export default Home