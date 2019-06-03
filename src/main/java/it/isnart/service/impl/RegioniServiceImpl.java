package it.isnart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.isnart.entity.RegioniEntity;
import it.isnart.model.Regioni;
import it.isnart.repository.RegioniRepository;
import it.isnart.service.RegioniService;

@Service
public class RegioniServiceImpl implements RegioniService {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegioniServiceImpl.class.getName());

	@Autowired
	private RegioniRepository regioniRepository;

	@Override
	public List<Regioni> findTutti() {
		// TODO Auto-generated method stub
		List<RegioniEntity> listRegEnt = regioniRepository.findAll();
		List<Regioni> regioni = new ArrayList<>();
		for(RegioniEntity regEnt : listRegEnt) {	
			Regioni reg = new Regioni();	
			reg.setId(regEnt.getId());
			reg.setRegione(regEnt.getNomeRegione());
			regioni.add(reg);
		}
		
		return regioni;
	}



	
}