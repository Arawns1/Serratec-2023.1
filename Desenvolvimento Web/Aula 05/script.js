var collaborators = [
  {
    id: 1,
    name:'Filipe Oliveira',
    jobTitle: 'Desenvolvedor Full-Stack',
    pictureURL: 'https://avatars.githubusercontent.com/u/125571407?v=4'
  },
  {
    id: 2,
    name:'Gabriel Damico',
    jobTitle: 'Desenvolvedor Full-Stack',
    pictureURL: 'https://avatars.githubusercontent.com/u/62900084?v=4'
  },
  {
    id: 3,
    name:'Luiz Cidade',
    jobTitle: 'Chief Executive Office',
    pictureURL: 'https://media.licdn.com/dms/image/C4D03AQFdqBoduagqdA/profile-displayphoto-shrink_200_200/0/1660261926494?e=1688601600&v=beta&t=A2YEC5nppaXwjuiVA0TYr01uMgBkTXCENjrGhUNUMhg'
  },
  {
    id: 4,
    name:'Juliana Boubee',
    jobTitle: 'Desenvolvedora Full-Stack ',
    pictureURL: 'https://media.licdn.com/dms/image/D4D03AQHQRZCPQqYlXg/profile-displayphoto-shrink_800_800/0/1680130430561?e=1688601600&v=beta&t=Xq3eRRShuuyi33i0eWsTTV_XjqqwuLkkT6d_6tsrW5c'
  },
  {
    id: 5,
    name:'Yan Gonçalves',
    jobTitle: 'Programador Senior',
    pictureURL: 'https://media.licdn.com/dms/image/D4D03AQHu7r-gXumwFw/profile-displayphoto-shrink_800_800/0/1680386054218?e=1688601600&v=beta&t=Xt6fnmbJ9q44lrrWXpWbQIeKXmftCF9nQpzHcwttc58'
  }
]

document.getElementById("sendBtn").addEventListener('click', (e) =>{
  e.preventDefault();
  searchUser();
})


// document.getElementById("search").addEventListener('input', (e) => {
//     e.preventDefault();
//     searchUser();
// })


window.onload = () => {
  var htmlString = ``;
  collaborators.forEach(collaborator =>{
    htmlString += `<div class="personContainer">
    <img src="${collaborator.pictureURL}" alt="${collaborator.name}">
    <div class="contentContainer">
      <span class="title">${collaborator.name}</span>
      <span class="subtitle">${collaborator.jobTitle}</span>
    </div>
  </div>`
  })

document.getElementById("peopleContainer").innerHTML = htmlString
}

const searchUser = () => {
  const searchValue = document.getElementById("search").value;
  const filteredCollaborators = collaborators.filter(collaborator => collaborator.name.toLowerCase().includes(searchValue.toLowerCase()));
  var htmlString = "";

  if(filteredCollaborators.length > 0) {
      filteredCollaborators.forEach(collaborator => {
          htmlString += `<div class="personContainer">
              <img src="${collaborator.pictureURL}" alt="${collaborator.name}">
              <div class="contentContainer">
                  <span class="title">${collaborator.name}</span>
                  <span class="jobTitle">${collaborator.jobTitle}</span>
              </div>
          </div>`
      })
  } else {
      htmlString = "<span class='noCollaboratorFound'>Nenhum colaborador encontrado... 😞</span>"
  }

  document.getElementById("peopleContainer").innerHTML = htmlString
  document.getElementById("search").value = ""
}