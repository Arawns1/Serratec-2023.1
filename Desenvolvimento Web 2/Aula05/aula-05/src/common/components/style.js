import styled from 'styled-components'

export const Button = styled.button`
  background-color: ${props => {
        let color;
        switch(props){
            case 'sucess':
                color = 'green';
                break
            case 'warning':
                color = 'yellow';
                break
            case 'error':
                color = 'red';
                break
            default:
                color = '#ffffff';
                break
        }
        return color;
  }};
  width: 200px;
`;
