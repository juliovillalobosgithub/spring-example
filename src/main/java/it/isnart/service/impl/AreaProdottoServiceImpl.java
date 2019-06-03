package it.isnart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.isnart.entity.AreaProdottoEntity;
import it.isnart.model.AreaProdotto;
import it.isnart.repository.AreaProdottoRepository;
import it.isnart.service.AreaProdottoService;

@Service
public class AreaProdottoServiceImpl implements AreaProdottoService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AreaProdottoServiceImpl.class.getName());

	@Autowired
	private AreaProdottoRepository areaProdottoRepository;

	@Override
	public List<AreaProdotto> tutti() {
		// TODO Auto-generated method stub
		List<AreaProdottoEntity> listProdEnt =	areaProdottoRepository.findAll();
		List<AreaProdotto> prodotto = new ArrayList<AreaProdotto>();
		for(AreaProdottoEntity prodEnt : listProdEnt) {	
			AreaProdotto prod = new AreaProdotto();	
			prod.setId(prodEnt.getId());
			prod.setNomeAreaProdotto(prodEnt.getNomeAreaProdotto());
			prodotto.add(prod);
		}
		
		return prodotto;
	}



	
}