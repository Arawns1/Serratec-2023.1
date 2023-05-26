package com.residencia.biblioteca.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.residencia.biblioteca.dto.UploadArquivoDTO;
import com.residencia.biblioteca.exception.UploadArquivoException;

@Service
public class UploadArquivoService {
	@Value("${pasta.upload.arquivos}")
	private String pastaUploadArquivos;
	
	private Path localArmazenamentoArquivo;
	
	public UploadArquivoDTO armazenaArquivo(MultipartFile file) {
		String clearFileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try {
			if(clearFileName.contains("..")) {
				throw new UploadArquivoException("Nome de arquivo inválido: " + clearFileName);
			}
			
			this.localArmazenamentoArquivo = Paths.get(pastaUploadArquivos).toAbsolutePath().normalize();
			
			Path pastaDestino = this.localArmazenamentoArquivo.resolve(clearFileName);
			
			Files.copy(file.getInputStream(), pastaDestino, StandardCopyOption.REPLACE_EXISTING);
			
			return new UploadArquivoDTO(clearFileName, pastaDestino, file.getContentType(), file.getSize());
		}
		catch (IOException ex) {
			throw new UploadArquivoException("Ocorreu um erro ao armazenar o arquivo " + clearFileName, ex);
		}
	
	
	}
}


