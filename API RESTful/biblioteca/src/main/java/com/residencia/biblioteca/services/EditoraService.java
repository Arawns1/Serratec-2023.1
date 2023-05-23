package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.dto.ReceitaWsDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {
	@Autowired
	EditoraRepository editoraRepository;	
	
	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();
	}
	
	public Editora getEditoraById(Integer id) {
		return editoraRepository.findById(id).orElse(null);
	}
	
	public EditoraResumidaDTO getEditoraDtoById(Integer id) {
		Editora editora = editoraRepository.findById(id).orElse(null);
		
		if(editora == null)
			return null; //retorna para a requisição vazio
		
		// -- UTILIZANDO GET E SET --//
		EditoraResumidaDTO editoraDTO = new EditoraResumidaDTO();//Cria uma instancia vazia
		//Popula com os dados de editora o EditoraDTO
		editoraDTO.setCodigoEditora(editora.getCodigoEditora());
		editoraDTO.setNome(editora.getNome());
		
		List<LivroResumidoDTO> listaLivroResDTO = new ArrayList<>();
		
		for(Livro livro : editora.getLivros()) {
			LivroResumidoDTO livroResDTO = new LivroResumidoDTO();
			livroResDTO.setNomeLivro(livro.getNomeLivro());
			livroResDTO.setNomeAutor(livro.getNomeAutor());
			livroResDTO.setDataLancamento(livro.getDataLancamento());
			listaLivroResDTO.add(livroResDTO);
		}
		
		editoraDTO.setListaLivrosResDto(listaLivroResDTO);
		
		// --- Cria uma instancia passando a editora e no construtor pega o get e set dela
		//EditoraResumidaDTO editoraDTO = new EditoraResumidaDTO(editora);
		
		return editoraDTO ;
	}
	
	
	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}
	
	
	public EditoraResumidaDTO saveEditoraDto(EditoraResumidaDTO editoraResumidaDto) {
		ModelMapper modelMapper = new ModelMapper();
		ReceitaWsDTO recDto = consultaApiReceitaWs(editoraResumidaDto.getCnpj());
		System.out.println("ReceitaWsDTO: " + recDto);
		Editora editora = modelMapper.map(editoraResumidaDto, Editora.class);
		
		return modelMapper.map(editora, EditoraResumidaDTO.class);
	}
	
	
	public Editora updateEditora(Editora editora, Integer id) {
		return editoraRepository.save(editora);
	}
	
	public Boolean deleteEditora(Integer id) {
		editoraRepository.deleteById(id);
		Editora editoraDeletada = editoraRepository.findById(id).orElse(null);
		if(editoraDeletada == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	private ReceitaWsDTO consultaApiReceitaWs(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://receitaws.com.br/v1/cnpj/"+cnpj;
		//nome:valor -> cnpj:numero
		Map<String, String> params = new HashMap<>();
		//chave cnpj pq o serviço espera receber esse nome.
		params.put("cnpj", cnpj);
		
		//ira acessar o url, instanciar a classe ReceitaWs com base nos parametros
		ReceitaWsDTO recDto = restTemplate.getForObject(uri, ReceitaWsDTO.class, params);
		
		return recDto;
	}
	
}
