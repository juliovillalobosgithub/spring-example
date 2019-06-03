package it.isnart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.isnart.entity.ViewComuniEntity;

@Repository
public interface ComuniRepository extends JpaRepository<ViewComuniEntity, Long> {



}