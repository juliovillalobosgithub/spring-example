package it.isnart.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonParser;

import it.isnart.model.ViewLingueGuidePerRegione;

public interface LingueGuideService {

	List<ViewLingueGuidePerRegione> findLingueGuidaByRegioneId(List<Long> idRegione);

}
