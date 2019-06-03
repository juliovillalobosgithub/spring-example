package it.isnart.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.isnart.entity.RegistroImprese2018Entity;

@Repository
public interface RegistroImprese2018Repository extends JpaRepository<RegistroImprese2018Entity, Long> {

	// @formatter:off
		@Query( "select o from RegistroImprese2018Entity o where idComune in :idComune" )
	// @formatter:on
	List<RegistroImprese2018Entity> findAllByListId(@Param("idComune") List<Long> idComune);
}