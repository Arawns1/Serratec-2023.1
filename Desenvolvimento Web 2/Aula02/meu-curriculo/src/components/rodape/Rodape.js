import './rodape.css'
export function Rodape(){
    return(
        <div className="footer">
            <h2>Meus Contatos</h2>
            <ul className="lista-contatos">
                <li>
                <img src="https://media.discordapp.net/attachments/929069726372597815/1100602568645820426/174857.png?width=343&amp;height=343" alt="LinkedIn Logo"/>
                    <a href="https://www.linkedin.com/in/gabriel-damico/" target="_blank" rel="noreferrer">Meu Linkedin</a>
                </li>
                <li>
                    <img src="https://media.discordapp.net/attachments/929069726372597815/1100603252262830120/25231.png?width=343&amp;height=343" alt="Logo Github"/>
                    <a href="https://github.com/Arawns1" target="_blank" rel="noreferrer">Meu Github</a>
                </li>
                <li>
                    <img src="https://media.discordapp.net/attachments/929069726372597815/1100603544542904340/281769.png?width=343&height=343" alt="gmail logo" />
                    <a href="mailto:gabrieldamico22@gmail.com" target="_blank" rel="noreferrer">Meu Email</a>
                </li>
            </ul>
            <div className="qrCode-container">
                <img id="QrCode" src="https://media.discordapp.net/attachments/929069726372597815/1100949806807003196/qrcode_para_linktree.png?width=558&amp;height=558" alt="QrCode do Whatsapp"/>
                <p>Meu Whatsapp</p>
            </div>
        </div>
    )
}