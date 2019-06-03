package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Organizzazione convegni imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class OrganizzazioneConvegniImprese2018 {

	
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

	
	public OrganizzazioneConvegniImprese2018 orgConvegniFerieRegistrate(Integer orgConvegniFerieRegistrate) {
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

	public OrganizzazioneConvegniImprese2018 orgConvegniFerieAttive(Integer orgConvegniFerieAttive) {
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

	public OrganizzazioneConvegniImprese2018 orgConvegniFerieIscrizioni(Integer orgConvegniFerieIscrizioni) {
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

	public OrganizzazioneConvegniImprese2018 orgConvegniFerieCessazione(Integer orgConvegniFerieCessazione) {
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

	public OrganizzazioneConvegniImprese2018 orgConvegniFerieAddettiTot(Integer orgConvegniFerieAddettiTot) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OrganizzazioneConvegniImprese2018 registroImprese2018 = (OrganizzazioneConvegniImprese2018) o;

		return Objects.equals(this.orgConvegniFerieRegistrate, registroImprese2018.orgConvegniFerieRegistrate)&&
				Objects.equals(this.orgConvegniFerieAttive, registroImprese2018.orgConvegniFerieAttive) &&
				Objects.equals(this.orgConvegniFerieIscrizioni, registroImprese2018.orgConvegniFerieIscrizioni)&&
				Objects.equals(this.orgConvegniFerieCessazione, registroImprese2018.orgConvegniFerieCessazione)&&
				Objects.equals(this.orgConvegniFerieAddettiTot, registroImprese2018.orgConvegniFerieAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Organizzazione Convegni Imprese 2018 {\n");

		sb.append(" orgConvegniFerieRegistrate :").append(toIndentedString(orgConvegniFerieRegistrate)).append("\n");
		sb.append(" orgConvegniFerieAttive :").append(toIndentedString(orgConvegniFerieAttive)).append("\n");
		sb.append(" orgConvegniFerieIscrizioni :").append(toIndentedString(orgConvegniFerieIscrizioni)).append("\n");
		sb.append(" orgConvegniFerieCessazione :").append(toIndentedString(orgConvegniFerieCessazione)).append("\n");
		sb.append(" orgConvegniFerieAddettiTot :").append(toIndentedString(orgConvegniFerieAddettiTot)).append("\n");

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
		return Objects.hash(orgConvegniFerieRegistrate, orgConvegniFerieAttive, orgConvegniFerieIscrizioni,
				orgConvegniFerieCessazione, orgConvegniFerieAddettiTot);
	}

}
