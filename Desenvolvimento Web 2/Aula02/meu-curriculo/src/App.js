import './App.css';
import { Cabecalho } from './components/cabecalho/Cabecalho';
import { Escolaridade } from './components/escolaridade/Escolaridade';
import { Experiencia } from './components/experiencia/Experiencia';
import { Idioma } from './components/idiomas/Idioma';
import { Cursos } from './components/cursos/Cursos';
import { Rodape } from './components/rodape/Rodape';

function App() {
  return (
    <div className="page">
      <Cabecalho/>
      <div className="body-content">
        <Escolaridade/>
        <Experiencia/>
        <Idioma/>
        <Cursos/>
      </div>
      <Rodape/>
    </div>
  )
}

export default App;
