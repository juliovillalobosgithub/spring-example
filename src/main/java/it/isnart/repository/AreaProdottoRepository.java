package it.isnart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.isnart.entity.AreaProdottoEntity;

@Repository
public interface AreaProdottoRepository extends JpaRepository<AreaProdottoEntity, Long> {



}