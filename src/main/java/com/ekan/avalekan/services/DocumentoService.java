package com.ekan.avalekan.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekan.avalekan.domain.Documento;
import com.ekan.avalekan.repositories.DocumentoRepository;


@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository repo;
	
	public Documento buscar(Integer id) { 
		 Optional<Documento> obj = repo.findById(id); 
		return obj.orElse(null); 
		} 


}
