package com.ekan.avalekan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekan.avalekan.domain.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Integer > {

}
