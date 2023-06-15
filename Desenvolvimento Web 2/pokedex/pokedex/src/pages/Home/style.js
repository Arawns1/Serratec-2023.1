import styled from 'styled-components'

export const Container = styled.div`  
display: flex;
place-items: center;
flex-direction: column;`

export const TitleContainer = styled.header`
  display: flex;
  align-items: center;
  gap: 10px;

  img   {
    width: 80px;
  }

`
export const ContentContainer = styled.div`
  padding-top: 20px;
  width: 95%;
  gap: 40px;
  display: flex;
  flex-wrap: wrap;
  max-height: 500px;
  overflow-y: auto;
`
export const PokeCard = styled.div`
 background-color: ${props => {
        let color;

        switch (props.pokemonType) {
            case 'Normal':
                color = '#A8A77A';
                break;
            case 'Fire':
                color = '#EE8130';
                break;
            case 'Water':
                color = '#6390F0';
                break;
            case 'Electric':
                color = '#F7D02C';
                break;
            case 'Grass':
                color = '#7AC74C';
                break;
            case 'Ice':
                color = '#96D9D6';
                break;
            case 'Fighting':
                color = '#C22E28';
                break;
            case 'Poison':
                color = '#A33EA1';
                break;
            case 'Ground':
                color = '#E2BF65';
                break;
            case 'Flying':
                color = '#A98FF3';
                break;
            case 'Psychic':
                color = '#F95587';
                break;
            case 'Bug':
                color = '#A6B91A';
                break;
            case 'Rock':
                color = '#B6A136';
                break;
            case 'Ghost':
                color = '#735797';
                break;
            case 'Dragon':
                color = '#6F35FC';
                break;
            case 'Dark':
                color = '#705746';
                break;
            case 'Steel':
                color = '#B7B7CE';
                break;
            case 'Fairy':
                color = '#D685AD';
                break;
            default : 
                color = '#ffffff';
                break
        }
        return color;
    }};
  padding: 20px;
  border-radius: 7px;
  border: 8px solid #c2c2c2;
  transition: 0.4s;

&:hover {
  transform: scale(1.1);
}

 h3{
  margin: 0;
  color: #2b2b2b;
}

 span{
  color: #2b2b2b;
}
 img{
  width: 150px;
}

`