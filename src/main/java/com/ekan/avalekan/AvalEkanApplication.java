package com.ekan.avalekan;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ekan.avalekan.domain.Documento;
import com.ekan.avalekan.domain.Beneficiario;

@SpringBootApplication
public class AvalEkanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvalEkanApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Documento cat1 = new Documento(null,"Informática");
		Documento cat2 = new Documento(null,"Escritório");
		
		Beneficiario p1 = new Beneficiario(null, "Computador", 2000.00);
		Beneficiario p2 = new Beneficiario(null, "Impressora", 800.00);
		Beneficiario p3 = new Beneficiario(null, "Mouse", 80.00);
		
		cat1.getDocumentos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2)); 
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}

}
