package com.ekan.avalekan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ekan.avalekan.domain.Beneficiario;


@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Integer > {

}
