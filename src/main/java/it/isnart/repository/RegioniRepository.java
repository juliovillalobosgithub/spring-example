package it.isnart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.isnart.entity.RegioniEntity;

@Repository
public interface RegioniRepository extends JpaRepository<RegioniEntity, Long> {



}