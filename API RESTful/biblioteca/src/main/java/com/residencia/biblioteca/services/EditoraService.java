package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
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
	
}
