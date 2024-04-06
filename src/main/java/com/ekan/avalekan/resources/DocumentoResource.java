package com.ekan.avalekan.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekan.avalekan.domain.Documento;

@RestController
@RequestMapping(value="/documentos")
public class DocumentoResource {
	
	@Autowired
	private DocumentoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		Documento obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
		}

}
