import "./experiencia.css"

export function Experiencia(){
    return(
        <div className="experiencia-container">
            <h2>Experiencia</h2>
            <hr/>
            <div className="experiencias-container">
                <div className="experiencia">
                    <h3>Suporte TI - Estagiário</h3>
                    <h4>Grupo Abreu | mai/2022 - fev/2023</h4>
                    <ul>
                        <li>Atuei no suporte tecnológico da empresa, resolvendo problemas relacionados a software e sistemas operacionais em geral (Windows e Linux);</li>
                        <li>Atendimento a usuário internos;</li>
                        <li>Limpeza e manutenção de hardware;</li>
                        <li>Atendimento a usuário internos;</li>
                    </ul>
                </div>
                <div className="experiencia">
                <h3>Assistente administativo - Jovem Aprendiz</h3>
                    <h4>Rede de Farmácias Legitima & Itacenter | 2019 - 2020</h4>
                    <ul>
                        <li>Trabalhei no setor financeiro, contas a pagar, além de conhecer todos os setores da empresa</li>
                    </ul>
                </div>
            </div>
        </div>
    )
}