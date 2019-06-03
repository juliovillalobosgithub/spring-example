package it.isnart.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.isnart.entity.RegistroImprese2018Entity;
import it.isnart.model.AlloggiImprese2018;
import it.isnart.model.AttivitaRicreativeImprese2018;
import it.isnart.model.CorsiSportiviImprese2018;
import it.isnart.model.NoleggioImprese2018;
import it.isnart.model.OrganizzazioneConvegniImprese2018;
import it.isnart.model.RegistroImprese2018;
import it.isnart.model.RistorazioneImprese2018;
import it.isnart.model.TotImpreseAllSettoriImprese2018;
import it.isnart.model.TotImpreseTuristicheImprese2018;
import it.isnart.model.TrasportiImprese2018;
import it.isnart.repository.RegistroImprese2018Repository;
import it.isnart.service.RegistroImprese2018Service;

@Service
public class RegistroImprese2018ServiceImpl implements RegistroImprese2018Service {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistroImprese2018ServiceImpl.class.getName());

	@Autowired
	private RegistroImprese2018Repository registroImprese2018Repository;

	@Override
	public List<RegistroImprese2018> tutti(List<Long> idComune) {
		// TODO Auto-generated method stub
		List<RegistroImprese2018Entity> listRegEnt =	registroImprese2018Repository.findAllByListId(idComune);
		List<RegistroImprese2018> registro = new ArrayList<RegistroImprese2018>();
		for(RegistroImprese2018Entity regEnt : listRegEnt) {	
			RegistroImprese2018 tot = new RegistroImprese2018();
			tot.setId(regEnt.getId());
			tot.setIdComune(regEnt.getIdComune());
				TrasportiImprese2018 trasporti = new TrasportiImprese2018();
				trasporti.setTrasportiRegistrati(regEnt.getTrasportiRegistrati());
				trasporti.setTrasportiAddettiTot( regEnt.getTrasportiAddettiTot());
				trasporti.setTrasportiAttive(regEnt.getTrasportiAttive());
				trasporti.setTrasportiCessazioni(regEnt.getTrasportiCessazioni());
				trasporti.setTrasportiIscrizioni(regEnt.getTrasportiIscrizioni());
			tot.setTrasporti(trasporti);
				AlloggiImprese2018 alloggi = new AlloggiImprese2018();
				alloggi.setAlloggiAddettiTot(regEnt.getAlloggiAddettiTot());
				alloggi.setAlloggiAttive(regEnt.getAlloggiAttive());
				alloggi.setAlloggiCessazioni(regEnt.getAlloggiCessazioni());
				alloggi.setAlloggiIscrizioni(regEnt.getAlloggiIscrizioni());
				alloggi.setAlloggiRegistrati(regEnt.getAlloggiRegistrati());
			tot.setAlloggi(alloggi);
				RistorazioneImprese2018 ristorazione = new RistorazioneImprese2018();
				ristorazione.setRistorazioneAddettiTot(regEnt.getRistorazioneAddettiTot());
				ristorazione.setRistorazioneAttive(regEnt.getRistorazioneAttive());
				ristorazione.setRistorazioneCessazioni(regEnt.getRistorazioneCessazioni());
				ristorazione.setRistorazioneIscrizioni(regEnt.getRistorazioneIscrizioni());
				ristorazione.setRistorazioneRegistrati(regEnt.getRistorazioneRegistrati());
			tot.setRistorazione(ristorazione);
				NoleggioImprese2018 noleggio =  new NoleggioImprese2018();
				noleggio.setNoleggioAgenzieAltroAddettiTot(regEnt.getNoleggioAgenzieAltroAddettiTot());
				noleggio.setNoleggioAgenzieAltroAttive(regEnt.getNoleggioAgenzieAltroAttive());
				noleggio.setNoleggioAgenzieAltroCessazioni(regEnt.getNoleggioAgenzieAltroCessazioni());
				noleggio.setNoleggioAgenzieAltroIscrizioni(regEnt.getNoleggioAgenzieAltroIscrizioni());
				noleggio.setNoleggioAgenzieAltroRegistrate(regEnt.getNoleggioAgenzieAltroRegistrate());
			tot.setNoleggio(noleggio);	
				AttivitaRicreativeImprese2018 attivita = new AttivitaRicreativeImprese2018();
				attivita.setAttRicreativeIntrattAddettiTot(regEnt.getAttRicreativeIntrattAddettiTot());
				attivita.setAttRicreativeIntrattAttive(regEnt.getAttRicreativeIntrattAttive());
				attivita.setAttRicreativeIntrattCessazione(regEnt.getAttRicreativeIntrattCessazione());
				attivita.setAttRicreativeIntrattIscrizioni(regEnt.getAttRicreativeIntrattIscrizioni());
				attivita.setAttRicreativeIntrattRegistrate(regEnt.getAttRicreativeIntrattRegistrate());
			tot.setAttivita(attivita);
				OrganizzazioneConvegniImprese2018 organizzazione = new OrganizzazioneConvegniImprese2018();
				organizzazione.setOrgConvegniFerieAddettiTot(regEnt.getOrgConvegniFerieAddettiTot());
				organizzazione.setOrgConvegniFerieAttive(regEnt.getOrgConvegniFerieAttive());
				organizzazione.setOrgConvegniFerieCessazione(regEnt.getOrgConvegniFerieCessazione());
				organizzazione.setOrgConvegniFerieIscrizioni(regEnt.getOrgConvegniFerieIscrizioni());
				organizzazione.setOrgConvegniFerieRegistrate(regEnt.getOrgConvegniFerieRegistrate());
			tot.setOrganizzazione(organizzazione);
				CorsiSportiviImprese2018 corsi = new CorsiSportiviImprese2018();
				corsi.setCorsiSportRicrAddettiTot(regEnt.getCorsiSportRicrAddettiTot());
				corsi.setCorsiSportRicrAttive(regEnt.getCorsiSportRicrAttive());
				corsi.setCorsiSportRicrCessazioni(regEnt.getCorsiSportRicrCessazioni());
				corsi.setCorsiSportRicrIscrizioni(regEnt.getCorsiSportRicrIscrizioni());
				corsi.setCorsiSportRicrRegistrate(regEnt.getCorsiSportRicrRegistrate());
			tot.setCorsi(corsi);
				TotImpreseTuristicheImprese2018 turistiche = new TotImpreseTuristicheImprese2018();
				turistiche.setTotImpTuristicheAddettiTot(regEnt.getTotImpTuristicheAddettiTot());
				turistiche.setTotImpTuristicheAttive(regEnt.getTotImpTuristicheAttive());
				turistiche.setTotImpTuristicheCessazioni(regEnt.getTotImpTuristicheCessazioni());
				turistiche.setTotImpTuristicheIscrizioni(regEnt.getTotImpTuristicheIscrizioni());
				turistiche.setTotImpTuristicheRegistrate(regEnt.getTotImpTuristicheRegistrate());
			tot.setImpreseTuristiche(turistiche);	
				TotImpreseAllSettoriImprese2018 allSettori = new TotImpreseAllSettoriImprese2018();
				allSettori.setTotImprSettoriAddettiTot(regEnt.getTotImprSettoriAddettiTot());
				allSettori.setTotImprSettoriAttive(regEnt.getTotImprSettoriAttive());
				allSettori.setTotImprSettoriCessazioni(regEnt.getTotImprSettoriCessazioni());
				allSettori.setTotImprSettoriIscrizioni(regEnt.getTotImprSettoriIscrizioni());
				allSettori.setTotImprSettoriRegistrate(regEnt.getTotImprSettoriRegistrate());
			tot.setTutteImprese(allSettori);					
			registro.add(tot);
		}
		
		return registro;
	}



	
}