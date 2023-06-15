import styled from "styled-components"

const inputStyle = styled.input`
    background-color: green;
`



export function Input(){
    return(
        <>
        <input type="text" placeholder="Digite seu nome" style={inputStyle}></input>
        </>
    )
}