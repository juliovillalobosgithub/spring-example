package it.isnart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "registro_imprese_2018")
public class RegistroImprese2018Entity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "IMPRESE_ID_GENERATOR", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = { @Parameter(name = "hibernate_sequence", value = "ID_VALUE") })
	@GeneratedValue(generator = "IMPRESE_ID_GENERATOR")
	private Long id; 

	@Column(name = "id_comune") 
	private Long idComune; 

	@Column(name = "trasporti_registrati") 
	private Integer trasportiRegistrati; 

	@Column(name = "trasporti_attive") 
	private Integer trasportiAttive; 

	@Column(name = "trasporti_iscrizioni") 
	private Integer trasportiIscrizioni; 

	@Column(name = "trasporti_cessazioni") 
	private Integer trasportiCessazioni; 

	@Column(name = "trasporti_addetti_tot") 
	private Integer trasportiAddettiTot; 

	@Column(name = "alloggi_registrati") 
	private Integer alloggiRegistrati; 

	@Column(name = "alloggi_attive") 
	private Integer alloggiAttive; 

	@Column(name = "alloggi_iscrizioni") 
	private Integer alloggiIscrizioni; 

	@Column(name = "alloggi_cessazioni") 
	private Integer alloggiCessazioni; 

	@Column(name = "alloggi_addetti_tot") 
	private Integer alloggiAddettiTot; 

	@Column(name = "ristorazione_registrati") 
	private Integer ristorazioneRegistrati; 

	@Column(name = "ristorazione_attive") 
	private Integer ristorazioneAttive; 

	@Column(name = "ristorazione_iscrizioni") 
	private Integer ristorazioneIscrizioni; 

	@Column(name = "ristorazione_cessazioni") 
	private Integer ristorazioneCessazioni; 

	@Column(name = "ristorazione_addetti_tot") 
	private Integer ristorazioneAddettiTot; 

	@Column(name = "noleggio_agenzie_altro_registrate") 
	private Integer  noleggioAgenzieAltroRegistrate; 

	@Column(name = "noleggio_agenzie_altro_attive") 
	private Integer  noleggioAgenzieAltroAttive; 

	@Column(name = "noleggio_agenzie_altro_iscrizioni") 
	private Integer  noleggioAgenzieAltroIscrizioni; 

	@Column(name = "noleggio_agenzie_altro_cessazioni") 
	private Integer  noleggioAgenzieAltroCessazioni; 

	@Column(name = "noleggio_agenzie_altro_addetti_tot") 
	private Integer  noleggioAgenzieAltroAddettiTot; 

	@Column(name = "att_ricreative_intratt_registrate") 
	private Integer  attRicreativeIntrattRegistrate; 

	@Column(name = "att_ricreative_intratt_attive") 
	private Integer  attRicreativeIntrattAttive; 

	@Column(name = "att_ricreative_intratt_iscrizioni") 
	private Integer  attRicreativeIntrattIscrizioni; 

	@Column(name = "att_ricreative_intratt_cessazione") 
	private Integer  attRicreativeIntrattCessazione; 

	@Column(name = "att_ricreative_intratt_addetti_tot") 
	private Integer  attRicreativeIntrattAddettiTot; 

	@Column(name = "org_convegni_ferie_registrate") 
	private Integer  orgConvegniFerieRegistrate; 

	@Column(name = "org_convegni_ferie_attive") 
	private Integer  orgConvegniFerieAttive; 

	@Column(name = "org_convegni_ferie_iscrizioni") 
	private Integer  orgConvegniFerieIscrizioni; 

	@Column(name = "org_convegni_ferie_cessazione") 
	private Integer  orgConvegniFerieCessazione; 

	@Column(name = "org_convegni_ferie_addetti_tot") 
	private Integer  orgConvegniFerieAddettiTot; 

	@Column(name = "corsi_sport_ricr_registrate") 
	private Integer  corsiSportRicrRegistrate; 

	@Column(name = "corsi_sport_ricr_attive") 
	private Integer  corsiSportRicrAttive; 

	@Column(name = "corsi_sport_ricr_iscrizioni") 
	private Integer  corsiSportRicrIscrizioni; 

	@Column(name = "corsi_sport_ricr_cessazioni") 
	private Integer  corsiSportRicrCessazioni; 

	@Column(name = "corsi_sport_ricr_addetti_tot") 
	private Integer  corsiSportRicrAddettiTot; 

	@Column(name = "tot_imp_turistiche_registrate") 
	private Integer  totImpTuristicheRegistrate; 

	@Column(name = "tot_imp_turistiche_attive") 
	private Integer  totImpTuristicheAttive; 

	@Column(name = "tot_imp_turistiche_iscrizioni") 
	private Integer  totImpTuristicheIscrizioni; 

	@Column(name = "tot_imp_turistiche_cessazioni") 
	private Integer  totImpTuristicheCessazioni; 

	@Column(name = "tot_imp_turistiche_addetti_tot") 
	private Integer  totImpTuristicheAddettiTot; 

	@Column(name = "tot_impr_settori_registrate") 
	private Integer  totImprSettoriRegistrate; 

	@Column(name = "tot_impr_settori_attive") 
	private Integer  totImprSettoriAttive; 

	@Column(name = "tot_impr_settori_iscrizioni") 
	private Integer  totImprSettoriIscrizioni; 

	@Column(name = "tot_impr_settori_cessazioni") 
	private Integer  totImprSettoriCessazioni; 

	@Column(name = "tot_impr_settori_addetti_tot") 
	private Integer  totImprSettoriAddettiTot; 

}
