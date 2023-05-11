package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Usuario getUsuarioById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario updateUsuario(Usuario usuario, Integer id) {
		return usuarioRepository.save(usuario);
	}

	public Boolean deleteUsuario(Integer id) {
		usuarioRepository.deleteById(id);
		Usuario usuarioDeletado = usuarioRepository.findById(id).orElse(null);
		if(usuarioDeletado == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
