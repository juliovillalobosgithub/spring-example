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

public class RegistroImprese2018 {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("id_comune")
	private Long idComune;

	@JsonProperty("trasporti")
	private TrasportiImprese2018 trasporti;
	
	@JsonProperty("alloggi")
	private AlloggiImprese2018 alloggi;
	
	@JsonProperty("ristorazione")
	private RistorazioneImprese2018 ristorazione;
	
	@JsonProperty("noleggio")
	private NoleggioImprese2018 noleggio;
	
	@JsonProperty("attivita")
	private AttivitaRicreativeImprese2018 attivita;
	
	@JsonProperty("organizzazione")
	private OrganizzazioneConvegniImprese2018 organizzazione;

	@JsonProperty("corsi")
	private CorsiSportiviImprese2018 corsi;
	
	@JsonProperty("impreseTuristiche")
	private TotImpreseTuristicheImprese2018 impreseTuristiche;
	
	@JsonProperty("tutteImprese")
	private TotImpreseAllSettoriImprese2018 tutteImprese;

	public RegistroImprese2018 id(Long id) {
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

	public RegistroImprese2018 idComune(Long idComune) {
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


	public RegistroImprese2018 trasporti(TrasportiImprese2018 trasporti) {
		this.trasporti = trasporti;
		return this;
	}

	/**
	 * Get trasporti
	 * 
	 * @return trasporti
	 **/
	@ApiModelProperty(value = "")

	public TrasportiImprese2018 getTrasporti() {
		return trasporti;
	}

	public void setTrasporti(TrasportiImprese2018 trasporti) {
		this.trasporti = trasporti;
	}
	
	public RegistroImprese2018 alloggi(AlloggiImprese2018 alloggi) {
		this.alloggi = alloggi;
		return this;
	}

	/**
	 * Get alloggi
	 * 
	 * @return alloggi
	 **/
	@ApiModelProperty(value = "")

	public AlloggiImprese2018 getAlloggi() {
		return alloggi;
	}

	public void setAlloggi(AlloggiImprese2018 alloggi) {
		this.alloggi = alloggi;
	}
	
	public RegistroImprese2018 ristorazione(RistorazioneImprese2018 ristorazione) {
		this.ristorazione = ristorazione;
		return this;
	}

	/**
	 * Get ristorazione
	 * 
	 * @return ristorazione
	 **/
	@ApiModelProperty(value = "")

	public RistorazioneImprese2018 getRistorazione() {
		return ristorazione;
	}

	public void setRistorazione(RistorazioneImprese2018 ristorazione) {
		this.ristorazione = ristorazione;
	}
	
	public RegistroImprese2018 noleggio(NoleggioImprese2018 noleggio) {
		this.noleggio = noleggio;
		return this;
	}

	/**
	 * Get noleggio
	 * 
	 * @return noleggio
	 **/
	@ApiModelProperty(value = "")

	public NoleggioImprese2018 getNoleggio() {
		return noleggio;
	}

	public void setNoleggio(NoleggioImprese2018 noleggio) {
		this.noleggio = noleggio;
	}
	
	public RegistroImprese2018 attivita(AttivitaRicreativeImprese2018 attivita) {
		this.attivita = attivita;
		return this;
	}

	/**
	 * Get noleggio
	 * 
	 * @return noleggio
	 **/
	@ApiModelProperty(value = "")

	public AttivitaRicreativeImprese2018 getAttivita() {
		return attivita;
	}

	public void setAttivita(AttivitaRicreativeImprese2018 attivita) {
		this.attivita = attivita;
	}
	
	public RegistroImprese2018 organizzazione(OrganizzazioneConvegniImprese2018 organizzazione) {
		this.organizzazione = organizzazione;
		return this;
	}

	/**
	 * Get noleggio
	 * 
	 * @return noleggio
	 **/
	@ApiModelProperty(value = "")

	public OrganizzazioneConvegniImprese2018 getOrganizzazione() {
		return organizzazione;
	}

	public void setOrganizzazione(OrganizzazioneConvegniImprese2018 organizzazione) {
		this.organizzazione = organizzazione;
	}
	
	public RegistroImprese2018 corsi(CorsiSportiviImprese2018 corsi) {
		this.corsi = corsi;
		return this;
	}

	/**
	 * Get corsi
	 * 
	 * @return corsi
	 **/
	@ApiModelProperty(value = "")

	public CorsiSportiviImprese2018 getCorsi() {
		return corsi;
	}

	public void setCorsi(CorsiSportiviImprese2018 corsi) {
		this.corsi = corsi;
	}
	
	public RegistroImprese2018 impreseTuristiche(TotImpreseTuristicheImprese2018 impreseTuristiche) {
		this.impreseTuristiche = impreseTuristiche;
		return this;
	}

	/**
	 * Get impreseTuristiche
	 * 
	 * @return impreseTuristiche
	 **/
	@ApiModelProperty(value = "")

	public TotImpreseTuristicheImprese2018 getImpreseTuristiche() {
		return impreseTuristiche;
	}

	public void setImpreseTuristiche(TotImpreseTuristicheImprese2018 impreseTuristiche) {
		this.impreseTuristiche = impreseTuristiche;
	}
	
	public RegistroImprese2018 tutteImprese(TotImpreseAllSettoriImprese2018 tutteImprese) {
		this.tutteImprese = tutteImprese;
		return this;
	}

	/**
	 * Get impreseTuristiche
	 * 
	 * @return impreseTuristiche
	 **/
	@ApiModelProperty(value = "")

	public TotImpreseAllSettoriImprese2018 getTutteImprese() {
		return tutteImprese;
	}

	public void setTutteImprese(TotImpreseAllSettoriImprese2018 tutteImprese) {
		this.tutteImprese = tutteImprese;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RegistroImprese2018 registroImprese2018 = (RegistroImprese2018) o;

		return Objects.equals(this.id, registroImprese2018.id) &&
				Objects.equals(this.idComune, registroImprese2018.idComune)&&
				Objects.equals(this.trasporti, registroImprese2018.trasporti) &&
				Objects.equals(this.alloggi, registroImprese2018.alloggi) &&
				Objects.equals(this.ristorazione, registroImprese2018.ristorazione)&&
				Objects.equals(this.noleggio, registroImprese2018.noleggio)&&
				Objects.equals(this.organizzazione, registroImprese2018.organizzazione)&&
				Objects.equals(this.corsi, registroImprese2018.corsi)&&
				Objects.equals(this.impreseTuristiche, registroImprese2018.impreseTuristiche)&&
				Objects.equals(this.tutteImprese, registroImprese2018.tutteImprese);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Registro Imprese 2018 {\n");

		sb.append("id :").append(toIndentedString(id)).append("\n");
		sb.append("idComune :").append(toIndentedString(idComune)).append("\n");
		sb.append("trasporti :").append(toIndentedString(trasporti)).append("\n");
		sb.append("alloggi :").append(toIndentedString(alloggi)).append("\n");
		sb.append("ristorazione :").append(toIndentedString(ristorazione)).append("\n");
		sb.append("noleggio :").append(toIndentedString(noleggio)).append("\n");
		sb.append("organizzazione :").append(toIndentedString(organizzazione)).append("\n");
		sb.append("corsi :").append(toIndentedString(corsi)).append("\n");
		sb.append("impreseTuristiche :").append(toIndentedString(impreseTuristiche)).append("\n");
		sb.append("tutteImprese :").append(toIndentedString(tutteImprese)).append("\n");

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
		return Objects.hash( id, idComune,trasporti,alloggi,ristorazione,noleggio,organizzazione,corsi ,impreseTuristiche,tutteImprese);
	}

}
