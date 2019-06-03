
package it.isnart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.isnart.entity.ViewComuniEntity;
import it.isnart.model.ViewComuni;
import it.isnart.repository.ComuniRepository;
import it.isnart.service.ComuniService;

@Service
public class ComuniServiceImpl implements ComuniService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ComuniServiceImpl.class.getName());

	
	@Autowired
	private ComuniRepository comuniRepository;

	
	@Override
	public List<ViewComuni> tutti() {
		// TODO Auto-generated method stub
		List<ViewComuniEntity> listComEnt =	comuniRepository.findAll();
		List<ViewComuni> comuni = new ArrayList<ViewComuni>();
		for(ViewComuniEntity comEnt : listComEnt) {	
			ViewComuni com = new ViewComuni();	
			com.setId(comEnt.getId());
			com.setNomeComune(comEnt.getNomeComune());
			com.setNomeProvince(comEnt.getNomeProvince());
			com.setNomeRegione(comEnt.getNomeRegione());
			com.setNomeAreaProdotto(comEnt.getNomeAreaProdotto());
			com.setIdRegione(comEnt.getIdRegione());
			com.setIdProvincia(comEnt.getIdProvincia());
			com.setIdAreaProdotto(comEnt.getIdAreaProdotto());
			comuni.add(com);
		}
		
		
		return comuni;
	}



	
}