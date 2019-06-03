package it.isnart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.isnart.entity.ViewLingueGuidePerRegioneEntity;
import it.isnart.model.ViewComuni;
import it.isnart.model.ViewLingueGuidePerRegione;
import it.isnart.repository.LingueGuideRepository;
import it.isnart.service.LingueGuideService;

@Service
public class LingueGuideServiceImpl implements LingueGuideService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LingueGuideServiceImpl.class.getName());

	@Autowired
	private LingueGuideRepository lingueGuideRepository;

	@Override
	public List<ViewLingueGuidePerRegione>  findLingueGuidaByRegioneId(List<Long> idRegione) {
		// TODO Auto-generated method stub
		List<ViewLingueGuidePerRegioneEntity> listComEnt =	lingueGuideRepository.findLingueByRegione(idRegione);
		List<ViewLingueGuidePerRegione> comuni = new ArrayList<ViewLingueGuidePerRegione>();
		for(ViewLingueGuidePerRegioneEntity comEnt : listComEnt) {	
			ViewLingueGuidePerRegione com = new ViewLingueGuidePerRegione();	

			 com.setIdRegione(comEnt.getIdRegione());
			 com.setNomeRegione(comEnt.getNomeRegione());
			 com.setLinguaInglese(comEnt.getLinguaInglese());
			 com.setLinguaFrancese(comEnt.getLinguaFrancese());
			 com.setLinguaSpagnolo(comEnt.getLinguaSpagnolo());
			 com.setLinguaTedesco(comEnt.getLinguaTedesco());
			 com.setLinguaRusso(comEnt.getLinguaRusso());
			 com.setLinguaPortoghese(comEnt.getLinguaPortoghese());
			 com.setLinguaDanese(comEnt.getLinguaDanese());
			 com.setLinguaNorvegese(comEnt.getLinguaNorvegese());
			 com.setLinguaSvedese(comEnt.getLinguaSvedese());
			 com.setLinguaFinlandese(comEnt.getLinguaFinlandese());
			 com.setLinguaOlandese(comEnt.getLinguaOlandese());
			 com.setLinguaFiammingo(comEnt.getLinguaFiammingo());
			 com.setLinguaCeco(comEnt.getLinguaCeco());
			 com.setLinguaPolacco(comEnt.getLinguaPolacco());
			 com.setLinguaSlovacco(comEnt.getLinguaSlovacco());
			 com.setLinguaAlbanese(comEnt.getLinguaAlbanese());
			 com.setLinguaArabo(comEnt.getLinguaArabo());
			 com.setLinguaBielorusso(comEnt.getLinguaBielorusso());
			 com.setLinguaBosniacoMontenegrino(comEnt.getLinguaBosniacoMontenegrino());
			 com.setLinguaCatalano(comEnt.getLinguaCatalano());
			 com.setLinguaCinese(comEnt.getLinguaCinese());
			 com.setLinguaCoreano(comEnt.getLinguaCoreano());
			 com.setLinguaCroato(comEnt.getLinguaCroato());
			 com.setLinguaEbraico(comEnt.getLinguaEbraico());
			 com.setLinguaEstone(comEnt.getLinguaEstone());
			 com.setLinguaGeorgiano(comEnt.getLinguaGeorgiano());
			 com.setLinguaGiapponese(comEnt.getLinguaGiapponese());
			 com.setLinguaGreco(comEnt.getLinguaGreco());
			 com.setLinguaLettone(comEnt.getLinguaLettone());
			 com.setLinguaLis(comEnt.getLinguaLis());
			 com.setLinguaLituan(comEnt.getLinguaLituan());
			 com.setLinguaPersiano(comEnt.getLinguaPersiano());
			 com.setLinguaRumeno(comEnt.getLinguaRumeno());
			 com.setLinguaSerbo(comEnt.getLinguaSerbo());
			 com.setLinguaSloveno(comEnt.getLinguaSloveno());
			 com.setLinguaTurco(comEnt.getLinguaTurco());
			 com.setLinguaUcraino(comEnt.getLinguaUcraino());
			 com.setLinguaUngherese(comEnt.getLinguaUngherese());
			 com.setLinguaBulgaro(comEnt.getLinguaBulgaro());
			 com.setLinguaTaiwanese(comEnt.getLinguaTaiwanese());
			 com.setLinguaHindi(comEnt.getLinguaHindi());
;
			comuni.add(com);
		}
		
		return comuni;
	}

	
}