package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Registro imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class RegistroImprese2018All {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("id_comune")
	private Long idComune;

	@JsonProperty("trasporti_registrati")
	private Integer trasportiRegistrati;

	@JsonProperty("trasporti_attive")
	private Integer trasportiAttive;

	@JsonProperty("trasporti_iscrizioni")
	private Integer trasportiIscrizioni;

	@JsonProperty("trasporti_cessazioni")
	private Integer trasportiCessazioni;

	@JsonProperty("trasporti_addetti_tot")
	private Integer trasportiAddettiTot;

	@JsonProperty("alloggi_registrati")
	private Integer alloggiRegistrati;

	@JsonProperty("alloggi_attive")
	private Integer alloggiAttive;

	@JsonProperty("alloggi_iscrizioni")
	private Integer alloggiIscrizioni;

	@JsonProperty("alloggi_cessazioni")
	private Integer alloggiCessazioni;

	@JsonProperty("alloggi_addetti_tot")
	private Integer alloggiAddettiTot;

	@JsonProperty("ristorazione_registrati")
	private Integer ristorazioneRegistrati;

	@JsonProperty("ristorazione_attive")
	private Integer ristorazioneAttive;

	@JsonProperty("ristorazione_iscrizioni")
	private Integer ristorazioneIscrizioni;

	@JsonProperty("ristorazione_cessazioni")
	private Integer ristorazioneCessazioni;

	@JsonProperty("ristorazione_addetti_tot")
	private Integer ristorazioneAddettiTot;

	@JsonProperty("noleggio_agenzie_altro_registrate")
	private Integer noleggioAgenzieAltroRegistrate;

	@JsonProperty("noleggio_agenzie_altro_attive")
	private Integer noleggioAgenzieAltroAttive;

	@JsonProperty("noleggio_agenzie_altro_iscrizioni")
	private Integer noleggioAgenzieAltroIscrizioni;

	@JsonProperty("noleggio_agenzie_altro_cessazioni")
	private Integer noleggioAgenzieAltroCessazioni;

	@JsonProperty("noleggio_agenzie_altro_addetti_tot")
	private Integer noleggioAgenzieAltroAddettiTot;

	@JsonProperty("att_ricreative_intratt_registrate")
	private Integer attRicreativeIntrattRegistrate;

	@JsonProperty("att_ricreative_intratt_attive")
	private Integer attRicreativeIntrattAttive;

	@JsonProperty("att_ricreative_intratt_iscrizioni")
	private Integer attRicreativeIntrattIscrizioni;

	@JsonProperty("att_ricreative_intratt_cessazione")
	private Integer attRicreativeIntrattCessazione;

	@JsonProperty("att_ricreative_intratt_addetti_tot")
	private Integer attRicreativeIntrattAddettiTot;

	@JsonProperty("org_convegni_ferie_registrate")
	private Integer orgConvegniFerieRegistrate;

	@JsonProperty("org_convegni_ferie_attive")
	private Integer orgConvegniFerieAttive;

	@JsonProperty("org_convegni_ferie_iscrizioni")
	private Integer orgConvegniFerieIscrizioni;

	@JsonProperty("org_convegni_ferie_cessazione")
	private Integer orgConvegniFerieCessazione;

	@JsonProperty("org_convegni_ferie_addetti_tot")
	private Integer orgConvegniFerieAddettiTot;

	@JsonProperty("corsi_sport_ricr_registrate")
	private Integer corsiSportRicrRegistrate;

	@JsonProperty("corsi_sport_ricr_attive")
	private Integer corsiSportRicrAttive;

	@JsonProperty("corsi_sport_ricr_iscrizioni")
	private Integer corsiSportRicrIscrizioni;

	@JsonProperty("corsi_sport_ricr_cessazioni")
	private Integer corsiSportRicrCessazioni;

	@JsonProperty("corsi_sport_ricr_addetti_tot")
	private Integer corsiSportRicrAddettiTot;

	@JsonProperty("tot_imp_turistiche_registrate")
	private Integer totImpTuristicheRegistrate;

	@JsonProperty("tot_imp_turistiche_attive")
	private Integer totImpTuristicheAttive;

	@JsonProperty("tot_imp_turistiche_iscrizioni")
	private Integer totImpTuristicheIscrizioni;

	@JsonProperty("tot_imp_turistiche_cessazioni")
	private Integer totImpTuristicheCessazioni;

	@JsonProperty("tot_imp_turistiche_addetti_tot")
	private Integer totImpTuristicheAddettiTot;

	@JsonProperty("tot_impr_settori_registrate")
	private Integer totImprSettoriRegistrate;

	@JsonProperty("tot_impr_settori_attive")
	private Integer totImprSettoriAttive;

	@JsonProperty("tot_impr_settori_iscrizioni")
	private Integer totImprSettoriIscrizioni;

	@JsonProperty("tot_impr_settori_cessazioni")
	private Integer totImprSettoriCessazioni;

	@JsonProperty("tot_impr_settori_addetti_tot")
	private Integer totImprSettoriAddettiTot;

	public RegistroImprese2018All id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RegistroImprese2018All idComune(Long idComune) {
		this.idComune = idComune;
		return this;
	}

	/**
	 * Get idComune
	 * 
	 * @return idComune
	 **/
	@ApiModelProperty(value = "")

	public Long getIdComune() {
		return idComune;
	}

	public void setIdComune(Long idComune) {
		this.idComune = idComune;
	}

	public RegistroImprese2018All trasportiRegistrati(Integer trasportiRegistrati) {
		this.trasportiRegistrati = trasportiRegistrati;
		return this;
	}

	/**
	 * Get trasportiRegistrati
	 * 
	 * @return trasportiRegistrati
	 **/
	@ApiModelProperty(value = "")

	public Integer getTrasportiRegistrati() {
		return trasportiRegistrati;
	}

	public void setTrasportiRegistrati(Integer trasportiRegistrati) {
		this.trasportiRegistrati = trasportiRegistrati;
	}

	public RegistroImprese2018All trasportiAttive(Integer trasportiAttive) {
		this.trasportiAttive = trasportiAttive;
		return this;
	}

	/**
	 * Get trasportiAttive
	 * 
	 * @return trasportiAttive
	 **/
	@ApiModelProperty(value = "")

	public Integer getTrasportiAttive() {
		return trasportiAttive;
	}

	public void setTrasportiAttive(Integer trasportiAttive) {
		this.trasportiAttive = trasportiAttive;
	}

	public RegistroImprese2018All trasportiIscrizioni(Integer trasportiIscrizioni) {
		this.trasportiIscrizioni = trasportiIscrizioni;
		return this;
	}

	/**
	 * Get trasportiIscrizioni
	 * 
	 * @return trasportiIscrizioni
	 **/
	@ApiModelProperty(value = "")

	public Integer getTrasportiIscrizioni() {
		return trasportiIscrizioni;
	}

	public void setTrasportiIscrizioni(Integer trasportiIscrizioni) {
		this.trasportiIscrizioni = trasportiIscrizioni;
	}

	public RegistroImprese2018All trasportiCessazioni(Integer trasportiCessazioni) {
		this.trasportiCessazioni = trasportiCessazioni;
		return this;
	}

	/**
	 * Get trasportiCessazioni
	 * 
	 * @return trasportiCessazioni
	 **/

	@ApiModelProperty(value = "")
	public Integer getTrasportiCessazioni() {
		return trasportiCessazioni;
	}

	public void setTrasportiCessazioni(Integer trasportiCessazioni) {
		this.trasportiCessazioni = trasportiCessazioni;
	}

	public RegistroImprese2018All trasportiAddettiTot(Integer trasportiAddettiTot) {
		this.trasportiAddettiTot = trasportiAddettiTot;
		return this;
	}

	/**
	 * Get trasportiAddettiTot
	 * 
	 * @return trasportiAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getTrasportiAddettiTot() {
		return trasportiAddettiTot;
	}

	public void setTrasportiAddettiTot(Integer trasportiAddettiTot) {
		this.trasportiAddettiTot = trasportiAddettiTot;
	}

	public RegistroImprese2018All alloggiRegistrati(Integer alloggiRegistrati) {
		this.alloggiRegistrati = alloggiRegistrati;
		return this;
	}

	/**
	 * Get alloggiRegistrati
	 * 
	 * @return alloggiRegistrati
	 **/

	@ApiModelProperty(value = "")

	public Integer getAlloggiRegistrati() {
		return alloggiRegistrati;
	}

	public void setAlloggiRegistrati(Integer alloggiRegistrati) {
		this.alloggiRegistrati = alloggiRegistrati;
	}

	public RegistroImprese2018All alloggiAttive(Integer alloggiAttive) {
		this.alloggiAttive = alloggiAttive;
		return this;
	}

	/**
	 * Get alloggiAttive
	 * 
	 * @return alloggiAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getAlloggiAttive() {
		return alloggiAttive;
	}

	public void setAlloggiAttive(Integer alloggiAttive) {
		this.alloggiAttive = alloggiAttive;
	}

	public RegistroImprese2018All alloggiIscrizioni(Integer alloggiIscrizioni) {
		this.alloggiIscrizioni = alloggiIscrizioni;
		return this;
	}

	/**
	 * Get alloggiIscrizioni
	 * 
	 * @return alloggiIscrizioni
	 **/

	@ApiModelProperty(value = "")
	public Integer getAlloggiIscrizioni() {
		return alloggiIscrizioni;
	}

	public void setAlloggiIscrizioni(Integer alloggiIscrizioni) {
		this.alloggiIscrizioni = alloggiIscrizioni;
	}

	public RegistroImprese2018All alloggiCessazioni(Integer alloggiCessazioni) {
		this.alloggiCessazioni = alloggiCessazioni;
		return this;
	}

	/**
	 * Get alloggiCessazioni
	 * 
	 * @return alloggiCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getAlloggiCessazioni() {
		return alloggiCessazioni;
	}

	public void setAlloggiCessazioni(Integer alloggiCessazioni) {
		this.alloggiCessazioni = alloggiCessazioni;
	}

	public RegistroImprese2018All alloggiAddettiTot(Integer alloggiAddettiTot) {
		this.alloggiAddettiTot = alloggiAddettiTot;
		return this;
	}

	/**
	 * Get alloggiAddettiTot
	 * 
	 * @return alloggiAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getAlloggiAddettiTot() {
		return alloggiAddettiTot;
	}

	public void setAlloggiAddettiTot(Integer alloggiAddettiTot) {
		this.alloggiAddettiTot = alloggiAddettiTot;
	}

	public RegistroImprese2018All ristorazioneRegistrati(Integer ristorazioneRegistrati) {
		this.ristorazioneRegistrati = ristorazioneRegistrati;
		return this;
	}

	/**
	 * Get ristorazioneRegistrati
	 * 
	 * @return ristorazioneRegistrati
	 **/

	@ApiModelProperty(value = "")

	public Integer getRistorazioneRegistrati() {
		return ristorazioneRegistrati;
	}

	public void setRistorazioneRegistrati(Integer ristorazioneRegistrati) {
		this.ristorazioneRegistrati = ristorazioneRegistrati;
	}

	public RegistroImprese2018All ristorazioneAttive(Integer ristorazioneAttive) {
		this.ristorazioneAttive = ristorazioneAttive;
		return this;
	}

	/**
	 * Get ristorazioneAttive
	 * 
	 * @return ristorazioneAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getRistorazioneAttive() {
		return ristorazioneAttive;
	}

	public void setRistorazioneAttive(Integer ristorazioneAttive) {
		this.ristorazioneAttive = ristorazioneAttive;
	}

	public RegistroImprese2018All ristorazioneIscrizioni(Integer ristorazioneIscrizioni) {
		this.ristorazioneIscrizioni = ristorazioneIscrizioni;
		return this;
	}

	/**
	 * Get ristorazioneIscrizioni
	 * 
	 * @return ristorazioneIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getRistorazioneIscrizioni() {
		return ristorazioneIscrizioni;
	}

	public void setRistorazioneIscrizioni(Integer ristorazioneIscrizioni) {
		this.ristorazioneIscrizioni = ristorazioneIscrizioni;
	}

	public RegistroImprese2018All ristorazioneCessazioni(Integer ristorazioneCessazioni) {
		this.ristorazioneCessazioni = ristorazioneCessazioni;
		return this;
	}

	/**
	 * Get ristorazioneCessazioni
	 * 
	 * @return ristorazioneCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getRistorazioneCessazioni() {
		return ristorazioneCessazioni;
	}

	public void setRistorazioneCessazioni(Integer ristorazioneCessazioni) {
		this.ristorazioneCessazioni = ristorazioneCessazioni;
	}

	public RegistroImprese2018All ristorazioneAddettiTot(Integer ristorazioneAddettiTot) {
		this.ristorazioneAddettiTot = ristorazioneAddettiTot;
		return this;
	}

	/**
	 * Get ristorazioneAddettiTot
	 * 
	 * @return ristorazioneAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getRistorazioneAddettiTot() {
		return ristorazioneAddettiTot;
	}

	public void setRistorazioneAddettiTot(Integer ristorazioneAddettiTot) {
		this.ristorazioneAddettiTot = ristorazioneAddettiTot;
	}

	public RegistroImprese2018All noleggioAgenzieAltroRegistrate(Integer noleggioAgenzieAltroRegistrate) {
		this.noleggioAgenzieAltroRegistrate = noleggioAgenzieAltroRegistrate;
		return this;
	}

	/**
	 * Get noleggioAgenzieAltroRegistrate
	 * 
	 * @return noleggioAgenzieAltroRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getNoleggioAgenzieAltroRegistrate() {
		return noleggioAgenzieAltroRegistrate;
	}

	public void setNoleggioAgenzieAltroRegistrate(Integer noleggioAgenzieAltroRegistrate) {
		this.noleggioAgenzieAltroRegistrate = noleggioAgenzieAltroRegistrate;
	}

	public RegistroImprese2018All noleggioAgenzieAltroAttive(Integer noleggioAgenzieAltroAttive) {
		this.noleggioAgenzieAltroAttive = noleggioAgenzieAltroAttive;
		return this;
	}

	/**
	 * Get noleggioAgenzieAltroAttive
	 * 
	 * @return noleggioAgenzieAltroAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getNoleggioAgenzieAltroAttive() {
		return noleggioAgenzieAltroAttive;
	}

	public void setNoleggioAgenzieAltroAttive(Integer noleggioAgenzieAltroAttive) {
		this.noleggioAgenzieAltroAttive = noleggioAgenzieAltroAttive;
	}

	public RegistroImprese2018All noleggioAgenzieAltroIscrizioni(Integer noleggioAgenzieAltroIscrizioni) {
		this.noleggioAgenzieAltroIscrizioni = noleggioAgenzieAltroIscrizioni;
		return this;
	}

	/**
	 * Get noleggioAgenzieAltroIscrizioni
	 * 
	 * @return noleggioAgenzieAltroIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getNoleggioAgenzieAltroIscrizioni() {
		return noleggioAgenzieAltroIscrizioni;
	}

	public void setNoleggioAgenzieAltroIscrizioni(Integer noleggioAgenzieAltroIscrizioni) {
		this.noleggioAgenzieAltroIscrizioni = noleggioAgenzieAltroIscrizioni;
	}

	public RegistroImprese2018All noleggioAgenzieAltroCessazioni(Integer noleggioAgenzieAltroCessazioni) {
		this.noleggioAgenzieAltroCessazioni = noleggioAgenzieAltroCessazioni;
		return this;
	}

	/**
	 * Get noleggioAgenzieAltroCessazioni
	 * 
	 * @return noleggioAgenzieAltroCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getNoleggioAgenzieAltroCessazioni() {
		return noleggioAgenzieAltroCessazioni;
	}

	public void setNoleggioAgenzieAltroCessazioni(Integer noleggioAgenzieAltroCessazioni) {
		this.noleggioAgenzieAltroCessazioni = noleggioAgenzieAltroCessazioni;
	}

	public RegistroImprese2018All noleggioAgenzieAltroAddettiTot(Integer noleggioAgenzieAltroAddettiTot) {
		this.noleggioAgenzieAltroAddettiTot = noleggioAgenzieAltroAddettiTot;
		return this;
	}

	/**
	 * Get noleggioAgenzieAltroAddettiTot
	 * 
	 * @return noleggioAgenzieAltroAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getNoleggioAgenzieAltroAddettiTot() {
		return noleggioAgenzieAltroAddettiTot;
	}

	public void setNoleggioAgenzieAltroAddettiTot(Integer noleggioAgenzieAltroAddettiTot) {
		this.noleggioAgenzieAltroAddettiTot = noleggioAgenzieAltroAddettiTot;
	}

	public RegistroImprese2018All attRicreativeIntrattRegistrate(Integer attRicreativeIntrattRegistrate) {
		this.attRicreativeIntrattRegistrate = attRicreativeIntrattRegistrate;
		return this;
	}

	/**
	 * Get attRicreativeIntrattRegistrate
	 * 
	 * @return attRicreativeIntrattRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getAttRicreativeIntrattRegistrate() {
		return attRicreativeIntrattRegistrate;
	}

	public void setAttRicreativeIntrattRegistrate(Integer attRicreativeIntrattRegistrate) {
		this.attRicreativeIntrattRegistrate = attRicreativeIntrattRegistrate;
	}

	public RegistroImprese2018All attRicreativeIntrattAttive(Integer attRicreativeIntrattAttive) {
		this.attRicreativeIntrattAttive = attRicreativeIntrattAttive;
		return this;
	}

	/**
	 * Get attRicreativeIntrattAttive
	 * 
	 * @return attRicreativeIntrattAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getAttRicreativeIntrattAttive() {
		return attRicreativeIntrattAttive;
	}

	public void setAttRicreativeIntrattAttive(Integer attRicreativeIntrattAttive) {
		this.attRicreativeIntrattAttive = attRicreativeIntrattAttive;
	}

	public RegistroImprese2018All attRicreativeIntrattIscrizioni(Integer attRicreativeIntrattIscrizioni) {
		this.attRicreativeIntrattIscrizioni = attRicreativeIntrattIscrizioni;
		return this;
	}

	/**
	 * Get attRicreativeIntrattIscrizioni
	 * 
	 * @return attRicreativeIntrattIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getAttRicreativeIntrattIscrizioni() {
		return attRicreativeIntrattIscrizioni;
	}

	public void setAttRicreativeIntrattIscrizioni(Integer attRicreativeIntrattIscrizioni) {
		this.attRicreativeIntrattIscrizioni = attRicreativeIntrattIscrizioni;
	}

	public RegistroImprese2018All attRicreativeIntrattCessazione(Integer attRicreativeIntrattCessazione) {
		this.attRicreativeIntrattCessazione = attRicreativeIntrattCessazione;
		return this;
	}

	/**
	 * Get attRicreativeIntrattCessazione
	 * 
	 * @return attRicreativeIntrattCessazione
	 **/

	@ApiModelProperty(value = "")
	public Integer getAttRicreativeIntrattCessazione() {
		return attRicreativeIntrattCessazione;
	}

	public void setAttRicreativeIntrattCessazione(Integer attRicreativeIntrattCessazione) {
		this.attRicreativeIntrattCessazione = attRicreativeIntrattCessazione;
	}

	public RegistroImprese2018All attRicreativeIntrattAddettiAot(Integer attRicreativeIntrattAddettiAot) {
		this.attRicreativeIntrattAddettiTot = attRicreativeIntrattAddettiAot;
		return this;
	}

	/**
	 * Get attRicreativeIntrattAddettiAot
	 * 
	 * @return attRicreativeIntrattAddettiAot
	 **/

	@ApiModelProperty(value = "")

	public Integer getAttRicreativeIntrattAddettiAot() {
		return attRicreativeIntrattAddettiTot;
	}

	public void setAttRicreativeIntrattAddettiAot(Integer attRicreativeIntrattAddettiAot) {
		this.attRicreativeIntrattAddettiTot = attRicreativeIntrattAddettiAot;
	}

	public RegistroImprese2018All orgConvegniFerieRegistrate(Integer orgConvegniFerieRegistrate) {
		this.orgConvegniFerieRegistrate = orgConvegniFerieRegistrate;
		return this;
	}

	/**
	 * Get orgConvegniFerieRegistrate
	 * 
	 * @return orgConvegniFerieRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getOrgConvegniFerieRegistrate() {
		return orgConvegniFerieRegistrate;
	}

	public void setOrgConvegniFerieRegistrate(Integer orgConvegniFerieRegistrate) {
		this.orgConvegniFerieRegistrate = orgConvegniFerieRegistrate;
	}

	public RegistroImprese2018All orgConvegniFerieAttive(Integer orgConvegniFerieAttive) {
		this.orgConvegniFerieAttive = orgConvegniFerieAttive;
		return this;
	}

	/**
	 * Get orgConvegniFerieAttive
	 * 
	 * @return orgConvegniFerieAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getOrgConvegniFerieAttive() {
		return orgConvegniFerieAttive;
	}

	public void setOrgConvegniFerieAttive(Integer orgConvegniFerieAttive) {
		this.orgConvegniFerieAttive = orgConvegniFerieAttive;
	}

	public RegistroImprese2018All orgConvegniFerieIscrizioni(Integer orgConvegniFerieIscrizioni) {
		this.orgConvegniFerieIscrizioni = orgConvegniFerieIscrizioni;
		return this;
	}

	/**
	 * Get orgConvegniFerieIscrizioni
	 * 
	 * @return orgConvegniFerieIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getOrgConvegniFerieIscrizioni() {
		return orgConvegniFerieIscrizioni;
	}

	public void setOrgConvegniFerieIscrizioni(Integer orgConvegniFerieIscrizioni) {
		this.orgConvegniFerieIscrizioni = orgConvegniFerieIscrizioni;
	}

	public RegistroImprese2018All orgConvegniFerieCessazione(Integer orgConvegniFerieCessazione) {
		this.orgConvegniFerieCessazione = orgConvegniFerieCessazione;
		return this;
	}

	/**
	 * Get orgConvegniFerieCessazione
	 * 
	 * @return orgConvegniFerieCessazione
	 **/

	@ApiModelProperty(value = "")

	public Integer getOrgConvegniFerieCessazione() {
		return orgConvegniFerieCessazione;
	}

	public void setOrgConvegniFerieCessazione(Integer orgConvegniFerieCessazione) {
		this.orgConvegniFerieCessazione = orgConvegniFerieCessazione;
	}

	public RegistroImprese2018All orgConvegniFerieAddettiTot(Integer orgConvegniFerieAddettiTot) {
		this.orgConvegniFerieAddettiTot = orgConvegniFerieAddettiTot;
		return this;
	}

	/**
	 * Get orgConvegniFerieAddettiTot
	 * 
	 * @return orgConvegniFerieAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getOrgConvegniFerieAddettiTot() {
		return orgConvegniFerieAddettiTot;
	}

	public void setOrgConvegniFerieAddettiTot(Integer orgConvegniFerieAddettiTot) {
		this.orgConvegniFerieAddettiTot = orgConvegniFerieAddettiTot;
	}

	public RegistroImprese2018All corsiSportRicrRegistrate(Integer corsiSportRicrRegistrate) {
		this.corsiSportRicrRegistrate = corsiSportRicrRegistrate;
		return this;
	}

	/**
	 * Get corsiSportRicrRegistrate
	 * 
	 * @return corsiSportRicrRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getCorsiSportRicrRegistrate() {
		return corsiSportRicrRegistrate;
	}

	public void setCorsiSportRicrRegistrate(Integer corsiSportRicrRegistrate) {
		this.corsiSportRicrRegistrate = corsiSportRicrRegistrate;
	}

	public RegistroImprese2018All corsiSportRicrAttive(Integer corsiSportRicrAttive) {
		this.corsiSportRicrAttive = corsiSportRicrAttive;
		return this;
	}

	/**
	 * Get corsiSportRicrAttive
	 * 
	 * @return corsiSportRicrAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getCorsiSportRicrAttive() {
		return corsiSportRicrAttive;
	}

	public void setCorsiSportRicrAttive(Integer corsiSportRicrAttive) {
		this.corsiSportRicrAttive = corsiSportRicrAttive;
	}

	public RegistroImprese2018All corsiSportRicrIscrizioni(Integer corsiSportRicrIscrizioni) {
		this.corsiSportRicrIscrizioni = corsiSportRicrIscrizioni;
		return this;
	}

	/**
	 * Get corsiSportRicrIscrizioni
	 * 
	 * @return corsiSportRicrIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getCorsiSportRicrIscrizioni() {
		return corsiSportRicrIscrizioni;
	}

	public void setCorsiSportRicrIscrizioni(Integer corsiSportRicrIscrizioni) {
		this.corsiSportRicrIscrizioni = corsiSportRicrIscrizioni;
	}

	public RegistroImprese2018All corsiSportRicrCessazioni(Integer corsiSportRicrCessazioni) {
		this.corsiSportRicrCessazioni = corsiSportRicrCessazioni;
		return this;
	}

	/**
	 * Get corsiSportRicrCessazioni
	 * 
	 * @return corsiSportRicrCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getCorsiSportRicrCessazioni() {
		return corsiSportRicrCessazioni;
	}

	public void setCorsiSportRicrCessazioni(Integer corsiSportRicrCessazioni) {
		this.corsiSportRicrCessazioni = corsiSportRicrCessazioni;
	}

	public RegistroImprese2018All corsiSportRicrAddettiTot(Integer corsiSportRicrAddettiTot) {
		this.corsiSportRicrAddettiTot = corsiSportRicrAddettiTot;
		return this;
	}

	/**
	 * Get corsiSportRicrAddettiTot
	 * 
	 * @return corsiSportRicrAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getCorsiSportRicrAddettiTot() {
		return corsiSportRicrAddettiTot;
	}

	public void setCorsiSportRicrAddettiTot(Integer corsiSportRicrAddettiTot) {
		this.corsiSportRicrAddettiTot = corsiSportRicrAddettiTot;
	}

	public RegistroImprese2018All totImpTuristicheRegistrate(Integer totImpTuristicheRegistrate) {
		this.totImpTuristicheRegistrate = totImpTuristicheRegistrate;
		return this;
	}

	/**
	 * Get totImpTuristicheRegistrate
	 * 
	 * @return totImpTuristicheRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImpTuristicheRegistrate() {
		return totImpTuristicheRegistrate;
	}

	public void setTotImpTuristicheRegistrate(Integer totImpTuristicheRegistrate) {
		this.totImpTuristicheRegistrate = totImpTuristicheRegistrate;
	}

	public RegistroImprese2018All totImpTuristicheAttive(Integer totImpTuristicheAttive) {
		this.totImpTuristicheAttive = totImpTuristicheAttive;
		return this;
	}

	/**
	 * Get totImpTuristicheAttive
	 * 
	 * @return totImpTuristicheAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImpTuristicheAttive() {
		return totImpTuristicheAttive;
	}

	public void setTotImpTuristicheAttive(Integer totImpTuristicheAttive) {
		this.totImpTuristicheAttive = totImpTuristicheAttive;
	}

	public RegistroImprese2018All totImpTuristicheIscrizioni(Integer totImpTuristicheIscrizioni) {
		this.totImpTuristicheIscrizioni = totImpTuristicheIscrizioni;
		return this;
	}

	/**
	 * Get totImpTuristicheIscrizioni
	 * 
	 * @return totImpTuristicheIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImpTuristicheIscrizioni() {
		return totImpTuristicheIscrizioni;
	}

	public void setTotImpTuristicheIscrizioni(Integer totImpTuristicheIscrizioni) {
		this.totImpTuristicheIscrizioni = totImpTuristicheIscrizioni;
	}

	public RegistroImprese2018All totImpTuristicheCessazioni(Integer totImpTuristicheCessazioni) {
		this.totImpTuristicheCessazioni = totImpTuristicheCessazioni;
		return this;
	}

	/**
	 * Get totImpTuristicheCessazioni
	 * 
	 * @return totImpTuristicheCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImpTuristicheCessazioni() {
		return totImpTuristicheCessazioni;
	}

	public void setTotImpTuristicheCessazioni(Integer totImpTuristicheCessazioni) {
		this.totImpTuristicheCessazioni = totImpTuristicheCessazioni;
	}

	public RegistroImprese2018All totImpTuristicheAddettiTot(Integer totImpTuristicheAddettiTot) {
		this.totImpTuristicheAddettiTot = totImpTuristicheAddettiTot;
		return this;
	}

	/**
	 * Get totImpTuristicheAddettiTot
	 * 
	 * @return totImpTuristicheAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImpTuristicheAddettiTot() {
		return totImpTuristicheAddettiTot;
	}

	public void setTotImpTuristicheAddettiTot(Integer totImpTuristicheAddettiTot) {
		this.totImpTuristicheAddettiTot = totImpTuristicheAddettiTot;
	}

	public RegistroImprese2018All totImprSettoriRegistrate(Integer totImprSettoriRegistrate) {
		this.totImprSettoriRegistrate = totImprSettoriRegistrate;
		return this;
	}

	/**
	 * Get totImprSettoriRegistrate
	 * 
	 * @return totImprSettoriRegistrate
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImprSettoriRegistrate() {
		return totImprSettoriRegistrate;
	}

	public void setTotImprSettoriRegistrate(Integer totImprSettoriRegistrate) {
		this.totImprSettoriRegistrate = totImprSettoriRegistrate;
	}

	public RegistroImprese2018All totImprSettoriAttive(Integer totImprSettoriAttive) {
		this.totImprSettoriAttive = totImprSettoriAttive;
		return this;
	}

	/**
	 * Get totImprSettoriAttive
	 * 
	 * @return totImprSettoriAttive
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImprSettoriAttive() {
		return totImprSettoriAttive;
	}

	public void setTotImprSettoriAttive(Integer totImprSettoriAttive) {
		this.totImprSettoriAttive = totImprSettoriAttive;
	}

	public RegistroImprese2018All totImprSettoriIscrizioni(Integer totImprSettoriIscrizioni) {
		this.totImprSettoriIscrizioni = totImprSettoriIscrizioni;
		return this;
	}

	/**
	 * Get totImprSettoriIscrizioni
	 * 
	 * @return totImprSettoriIscrizioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImprSettoriIscrizioni() {
		return totImprSettoriIscrizioni;
	}

	public void setTotImprSettoriIscrizioni(Integer totImprSettoriIscrizioni) {
		this.totImprSettoriIscrizioni = totImprSettoriIscrizioni;
	}

	public RegistroImprese2018All totImprSettoriCessazioni(Integer totImprSettoriCessazioni) {
		this.totImprSettoriCessazioni = totImprSettoriCessazioni;
		return this;
	}

	/**
	 * Get totImprSettoriCessazioni
	 * 
	 * @return totImprSettoriCessazioni
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImprSettoriCessazioni() {
		return totImprSettoriCessazioni;
	}

	public void setTotImprSettoriCessazioni(Integer totImprSettoriCessazioni) {
		this.totImprSettoriCessazioni = totImprSettoriCessazioni;
	}

	public RegistroImprese2018All totImprSettoriAddettiTot(Integer totImprSettoriAddettiTot) {
		this.totImprSettoriAddettiTot = totImprSettoriAddettiTot;
		return this;
	}

	/**
	 * Get totImprSettoriAddettiTot
	 * 
	 * @return totImprSettoriAddettiTot
	 **/

	@ApiModelProperty(value = "")

	public Integer getTotImprSettoriAddettiTot() {
		return totImprSettoriAddettiTot;
	}

	public void setTotImprSettoriAddettiTot(Integer totImprSettoriAddettiTot) {
		this.totImprSettoriAddettiTot = totImprSettoriAddettiTot;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RegistroImprese2018All registroImprese2018 = (RegistroImprese2018All) o;

		return Objects.equals(this.id, registroImprese2018.id) &&
				Objects.equals(this.idComune, registroImprese2018.idComune) &&
				Objects.equals(this.trasportiRegistrati, registroImprese2018.trasportiRegistrati)&&
				Objects.equals(this.trasportiAttive, registroImprese2018.trasportiAttive)&&
				Objects.equals(this.trasportiIscrizioni, registroImprese2018.trasportiIscrizioni)&&
				Objects.equals(this.trasportiCessazioni, registroImprese2018.trasportiCessazioni)&&
				Objects.equals(this.trasportiAddettiTot, registroImprese2018.trasportiAddettiTot)&&
				Objects.equals(this.alloggiRegistrati, registroImprese2018.alloggiRegistrati)&&
				Objects.equals(this.alloggiAttive, registroImprese2018.alloggiAttive)&&
				Objects.equals(this.alloggiIscrizioni, registroImprese2018.alloggiIscrizioni)&&
				Objects.equals(this.alloggiCessazioni, registroImprese2018.alloggiCessazioni)&&
				Objects.equals(this.alloggiAddettiTot, registroImprese2018.alloggiAddettiTot)&&
				Objects.equals(this.ristorazioneRegistrati, registroImprese2018.ristorazioneRegistrati)&&
				Objects.equals(this.ristorazioneAttive, registroImprese2018.ristorazioneAttive)&&
				Objects.equals(this.ristorazioneIscrizioni, registroImprese2018.ristorazioneIscrizioni)&&
				Objects.equals(this.ristorazioneCessazioni, registroImprese2018.ristorazioneCessazioni)&&
				Objects.equals(this.ristorazioneAddettiTot, registroImprese2018.ristorazioneAddettiTot)&&
				Objects.equals(this.noleggioAgenzieAltroRegistrate, registroImprese2018.noleggioAgenzieAltroRegistrate)&&
				Objects.equals(this.noleggioAgenzieAltroAttive, registroImprese2018.noleggioAgenzieAltroAttive)&&
				Objects.equals(this.noleggioAgenzieAltroIscrizioni, registroImprese2018.noleggioAgenzieAltroIscrizioni)&&
				Objects.equals(this.noleggioAgenzieAltroCessazioni, registroImprese2018.noleggioAgenzieAltroCessazioni)&&
				Objects.equals(this.noleggioAgenzieAltroAddettiTot, registroImprese2018.noleggioAgenzieAltroAddettiTot)&&
				Objects.equals(this.attRicreativeIntrattRegistrate, registroImprese2018.attRicreativeIntrattRegistrate)&&
				Objects.equals(this.attRicreativeIntrattAttive, registroImprese2018.attRicreativeIntrattAttive)&&
				Objects.equals(this.attRicreativeIntrattIscrizioni, registroImprese2018.attRicreativeIntrattIscrizioni)&&
				Objects.equals(this.attRicreativeIntrattCessazione, registroImprese2018.attRicreativeIntrattCessazione)&&
				Objects.equals(this.attRicreativeIntrattAddettiTot, registroImprese2018.attRicreativeIntrattAddettiTot)&&
				Objects.equals(this.orgConvegniFerieRegistrate, registroImprese2018.orgConvegniFerieRegistrate)&&
				Objects.equals(this.orgConvegniFerieAttive, registroImprese2018.orgConvegniFerieAttive) &&
				Objects.equals(this.orgConvegniFerieIscrizioni, registroImprese2018.orgConvegniFerieIscrizioni)&&
				Objects.equals(this.orgConvegniFerieCessazione, registroImprese2018.orgConvegniFerieCessazione)&&
				Objects.equals(this.orgConvegniFerieAddettiTot, registroImprese2018.orgConvegniFerieAddettiTot)&&
				Objects.equals(this.corsiSportRicrRegistrate, registroImprese2018.corsiSportRicrRegistrate)&&
				Objects.equals(this.corsiSportRicrAttive, registroImprese2018.corsiSportRicrAttive)&&
				Objects.equals(this.corsiSportRicrIscrizioni, registroImprese2018.corsiSportRicrIscrizioni)&&
				Objects.equals(this.corsiSportRicrCessazioni, registroImprese2018.corsiSportRicrCessazioni)&&
				Objects.equals(this.corsiSportRicrAddettiTot, registroImprese2018.corsiSportRicrAddettiTot)&&
				Objects.equals(this.totImpTuristicheRegistrate, registroImprese2018.totImpTuristicheRegistrate)&&
				Objects.equals(this.totImpTuristicheAttive, registroImprese2018.totImpTuristicheAttive)&&
				Objects.equals(this.totImpTuristicheIscrizioni, registroImprese2018.totImpTuristicheIscrizioni)&&
				Objects.equals(this.totImpTuristicheCessazioni, registroImprese2018.totImpTuristicheCessazioni)&&
				Objects.equals(this.totImpTuristicheAddettiTot, registroImprese2018.totImpTuristicheAddettiTot)&&
				Objects.equals(this.totImprSettoriRegistrate, registroImprese2018.totImprSettoriRegistrate)&&
				Objects.equals(this.totImprSettoriAttive, registroImprese2018.totImprSettoriAttive)&&
				Objects.equals(this.totImprSettoriIscrizioni, registroImprese2018.totImprSettoriIscrizioni)&&
				Objects.equals(this.totImprSettoriCessazioni, registroImprese2018.totImprSettoriCessazioni)&&
				Objects.equals(this.totImprSettoriAddettiTot, registroImprese2018.totImprSettoriAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Registro Imprese 2018 {\n");

		sb.append("Long id :").append(toIndentedString(id)).append("\n");
		sb.append("Long idComune :").append(toIndentedString(idComune)).append("\n");
		sb.append("trasportiRegistrati :").append(toIndentedString(trasportiRegistrati)).append("\n");
		sb.append("trasportiAttive :").append(toIndentedString(trasportiAttive)).append("\n");
		sb.append("trasportiIscrizioni :").append(toIndentedString(trasportiIscrizioni)).append("\n");
		sb.append("trasportiCessazioni :").append(toIndentedString(trasportiCessazioni)).append("\n");
		sb.append("trasportiAddettiTot :").append(toIndentedString(trasportiAddettiTot)).append("\n");
		sb.append("alloggiRegistrati :").append(toIndentedString(alloggiRegistrati)).append("\n");
		sb.append("alloggiAttive :").append(toIndentedString(alloggiAttive)).append("\n");
		sb.append("alloggiIscrizioni :").append(toIndentedString(alloggiIscrizioni)).append("\n");
		sb.append("alloggiCessazioni :").append(toIndentedString(alloggiCessazioni)).append("\n");
		sb.append("alloggiAddettiTot :").append(toIndentedString(alloggiAddettiTot)).append("\n");
		sb.append("ristorazioneRegistrati :").append(toIndentedString(ristorazioneRegistrati)).append("\n");
		sb.append("ristorazioneAttive :").append(toIndentedString(ristorazioneAttive)).append("\n");
		sb.append("ristorazioneIscrizioni :").append(toIndentedString(ristorazioneIscrizioni)).append("\n");
		sb.append("ristorazioneCessazioni :").append(toIndentedString(ristorazioneCessazioni)).append("\n");
		sb.append("ristorazioneAddettiTot :").append(toIndentedString(ristorazioneAddettiTot)).append("\n");
		sb.append(" noleggioAgenzieAltroRegistrate :").append(toIndentedString(noleggioAgenzieAltroRegistrate)).append("\n");
		sb.append(" noleggioAgenzieAltroAttive :").append(toIndentedString(noleggioAgenzieAltroAttive)).append("\n");
		sb.append(" noleggioAgenzieAltroIscrizioni :").append(toIndentedString(noleggioAgenzieAltroIscrizioni)).append("\n");
		sb.append(" noleggioAgenzieAltroCessazioni :").append(toIndentedString(noleggioAgenzieAltroCessazioni)).append("\n");
		sb.append(" noleggioAgenzieAltroAddettiTot :").append(toIndentedString(noleggioAgenzieAltroAddettiTot)).append("\n");
		sb.append(" attRicreativeIntrattRegistrate :").append(toIndentedString(attRicreativeIntrattRegistrate)).append("\n");
		sb.append(" attRicreativeIntrattAttive :").append(toIndentedString(attRicreativeIntrattAttive)).append("\n");
		sb.append(" attRicreativeIntrattIscrizioni :").append(toIndentedString(attRicreativeIntrattIscrizioni)).append("\n");
		sb.append(" attRicreativeIntrattCessazione :").append(toIndentedString(attRicreativeIntrattCessazione)).append("\n");
		sb.append(" attRicreativeIntrattAddettiAot :").append(toIndentedString(attRicreativeIntrattAddettiTot)).append("\n");
		sb.append(" orgConvegniFerieRegistrate :").append(toIndentedString(orgConvegniFerieRegistrate)).append("\n");
		sb.append(" orgConvegniFerieAttive :").append(toIndentedString(orgConvegniFerieAttive)).append("\n");
		sb.append(" orgConvegniFerieIscrizioni :").append(toIndentedString(orgConvegniFerieIscrizioni)).append("\n");
		sb.append(" orgConvegniFerieCessazione :").append(toIndentedString(orgConvegniFerieCessazione)).append("\n");
		sb.append(" orgConvegniFerieAddettiTot :").append(toIndentedString(orgConvegniFerieAddettiTot)).append("\n");
		sb.append(" corsiSportRicrRegistrate :").append(toIndentedString(corsiSportRicrRegistrate)).append("\n");
		sb.append(" corsiSportRicrAttive :").append(toIndentedString(corsiSportRicrAttive)).append("\n");
		sb.append(" corsiSportRicrIscrizioni :").append(toIndentedString(corsiSportRicrIscrizioni)).append("\n");
		sb.append(" corsiSportRicrCessazioni :").append(toIndentedString(corsiSportRicrCessazioni)).append("\n");
		sb.append(" corsiSportRicrAddettiTot :").append(toIndentedString(corsiSportRicrAddettiTot)).append("\n");
		sb.append(" totImpTuristicheRegistrate :").append(toIndentedString(totImpTuristicheRegistrate)).append("\n");
		sb.append(" totImpTuristicheAttive :").append(toIndentedString(totImpTuristicheAttive)).append("\n");
		sb.append(" totImpTuristicheIscrizioni :").append(toIndentedString(totImpTuristicheIscrizioni)).append("\n");
		sb.append(" totImpTuristicheCessazioni :").append(toIndentedString(totImpTuristicheCessazioni)).append("\n");
		sb.append(" totImpTuristicheAddettiTot :").append(toIndentedString(totImpTuristicheAddettiTot)).append("\n");
		sb.append(" totImprSettoriRegistrate :").append(toIndentedString(totImprSettoriRegistrate)).append("\n");
		sb.append(" totImprSettoriAttive :").append(toIndentedString(totImprSettoriAttive)).append("\n");
		sb.append(" totImprSettoriIscrizioni :").append(toIndentedString(totImprSettoriIscrizioni)).append("\n");
		sb.append(" totImprSettoriCessazioni :").append(toIndentedString(totImprSettoriCessazioni)).append("\n");
		sb.append(" totImprSettoriAddettiTot:").append(toIndentedString(totImprSettoriAddettiTot)).append("\n");

		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idComune, trasportiRegistrati, trasportiAttive, trasportiIscrizioni,
				trasportiCessazioni, trasportiAddettiTot, alloggiRegistrati, alloggiAttive, alloggiIscrizioni,
				alloggiCessazioni, alloggiAddettiTot, ristorazioneRegistrati, ristorazioneAttive,
				ristorazioneIscrizioni, ristorazioneCessazioni, ristorazioneAddettiTot, noleggioAgenzieAltroRegistrate,
				noleggioAgenzieAltroAttive, noleggioAgenzieAltroIscrizioni, noleggioAgenzieAltroCessazioni,
				noleggioAgenzieAltroAddettiTot, attRicreativeIntrattRegistrate, attRicreativeIntrattAttive,
				attRicreativeIntrattIscrizioni, attRicreativeIntrattCessazione, attRicreativeIntrattAddettiTot,
				orgConvegniFerieRegistrate, orgConvegniFerieAttive, orgConvegniFerieIscrizioni,
				orgConvegniFerieCessazione, orgConvegniFerieAddettiTot, corsiSportRicrRegistrate, corsiSportRicrAttive,
				corsiSportRicrIscrizioni, corsiSportRicrCessazioni, corsiSportRicrAddettiTot,
				totImpTuristicheRegistrate, totImpTuristicheAttive, totImpTuristicheIscrizioni,
				totImpTuristicheCessazioni, totImpTuristicheAddettiTot, totImprSettoriRegistrate, totImprSettoriAttive,
				totImprSettoriIscrizioni, totImprSettoriCessazioni, totImprSettoriAddettiTot);
	}

}
