package it.isnart.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.isnart.entity.RegistroImprese2018Entity;
import it.isnart.entity.ViewLingueGuidePerRegioneEntity;

@Repository
public interface LingueGuideRepository extends JpaRepository<ViewLingueGuidePerRegioneEntity, Long> {

	// @formatter:off
		@Query( "select o from ViewLingueGuidePerRegioneEntity o where idRegione in :idRegione" )
	List<ViewLingueGuidePerRegioneEntity> findLingueByRegione(@Param("idRegione") List<Long> idRegione);
}