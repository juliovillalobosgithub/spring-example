package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Attività imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class AttivitaRicreativeImprese2018 {


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

	
	public AttivitaRicreativeImprese2018 attRicreativeIntrattRegistrate(Integer attRicreativeIntrattRegistrate) {
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

	public AttivitaRicreativeImprese2018 attRicreativeIntrattAttive(Integer attRicreativeIntrattAttive) {
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

	public AttivitaRicreativeImprese2018 attRicreativeIntrattIscrizioni(Integer attRicreativeIntrattIscrizioni) {
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

	public AttivitaRicreativeImprese2018 attRicreativeIntrattCessazione(Integer attRicreativeIntrattCessazione) {
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

	public AttivitaRicreativeImprese2018 attRicreativeIntrattAddettiTot(Integer attRicreativeIntrattAddettiTot) {
		this.attRicreativeIntrattAddettiTot = attRicreativeIntrattAddettiTot;
		return this;
	}

	/**
	 * Get attRicreativeIntrattAddettiAot
	 * 
	 * @return attRicreativeIntrattAddettiAot
	 **/

	@ApiModelProperty(value = "")

	public Integer getAttRicreativeIntrattAddettiTot() {
		return attRicreativeIntrattAddettiTot;
	}

	public void setAttRicreativeIntrattAddettiTot(Integer attRicreativeIntrattAddettiTot) {
		this.attRicreativeIntrattAddettiTot = attRicreativeIntrattAddettiTot;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AttivitaRicreativeImprese2018 registroImprese2018 = (AttivitaRicreativeImprese2018) o;

		return Objects.equals(this.attRicreativeIntrattRegistrate, registroImprese2018.attRicreativeIntrattRegistrate)&&
				Objects.equals(this.attRicreativeIntrattAttive, registroImprese2018.attRicreativeIntrattAttive)&&
				Objects.equals(this.attRicreativeIntrattIscrizioni, registroImprese2018.attRicreativeIntrattIscrizioni)&&
				Objects.equals(this.attRicreativeIntrattCessazione, registroImprese2018.attRicreativeIntrattCessazione)&&
				Objects.equals(this.attRicreativeIntrattAddettiTot, registroImprese2018.attRicreativeIntrattAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Attivit&agrave; Imprese 2018 {\n");

		sb.append(" attRicreativeIntrattRegistrate :").append(toIndentedString(attRicreativeIntrattRegistrate)).append("\n");
		sb.append(" attRicreativeIntrattAttive :").append(toIndentedString(attRicreativeIntrattAttive)).append("\n");
		sb.append(" attRicreativeIntrattIscrizioni :").append(toIndentedString(attRicreativeIntrattIscrizioni)).append("\n");
		sb.append(" attRicreativeIntrattCessazione :").append(toIndentedString(attRicreativeIntrattCessazione)).append("\n");
		sb.append(" attRicreativeIntrattAddettiAot :").append(toIndentedString(attRicreativeIntrattAddettiTot)).append("\n");

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
		return Objects.hash(attRicreativeIntrattRegistrate, attRicreativeIntrattAttive, attRicreativeIntrattIscrizioni, 
				attRicreativeIntrattCessazione, attRicreativeIntrattAddettiTot);
	}

}
