import './escolaridade.css'

export function Escolaridade(){
    return(
        <div className="escolaridade-container">
            <h2>Escolaridade</h2>
            <hr/>
            <div className="ensino-container">
                <div className="ensino">
                    <h3>Ensino Superior</h3>
                    <p>Faculdade Descomplica - Ciência da Computação 2022~2026</p>
                </div>
                <div className="ensino">
                    <h3>Ensino Médio</h3>
                    <p>Colégio São Tomás de Aquino - 2017~2021</p>
                </div>
            </div>
        </div>
    )
}