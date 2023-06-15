import styled from 'styled-components'

const StyledInput = styled.input`
    all: unset;
    background-color: ${props => {
        let color;
        switch(props.tamanho){
            case 'verde':
                color = 'green';
                break;
            case 'amarelo':
                color = 'yellow';
                break;
            case 'azul':
                color = 'blue';
                break;
            default:
                color = 'red';
            break
        }
        return color;
    }};
    width: 200px;
    height: 50px;
    border-radius: 10px;
    :hover{
        cursor:pointer;
    }
`

export function Input(){
    return(
        <>
        <StyledInput tamanho={'azul'} placeholder='Digite um negócio'/>
        </>
    )
}