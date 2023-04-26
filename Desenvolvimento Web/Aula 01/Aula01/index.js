function validateUser() {
  event.preventDefault()
  var nome = document.getElementById('nomeInput').value
  var senha = document.getElementById('senhaInput').value
  var titulo = document.getElementById('status')

  if (nome == 'Gabriel' && senha == '1234') {
    titulo.innerText = 'Olá, Gabriel! Você está logado'
  } else {
    titulo.innerText = 'Senha incorreta, tente novamente...'
  }
}
