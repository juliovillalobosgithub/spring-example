package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Corsi Sportivi imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class CorsiSportiviImprese2018 {

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

	public CorsiSportiviImprese2018 corsiSportRicrRegistrate(Integer corsiSportRicrRegistrate) {
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

	public CorsiSportiviImprese2018 corsiSportRicrAttive(Integer corsiSportRicrAttive) {
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

	public CorsiSportiviImprese2018 corsiSportRicrIscrizioni(Integer corsiSportRicrIscrizioni) {
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

	public CorsiSportiviImprese2018 corsiSportRicrCessazioni(Integer corsiSportRicrCessazioni) {
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

	public CorsiSportiviImprese2018 corsiSportRicrAddettiTot(Integer corsiSportRicrAddettiTot) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CorsiSportiviImprese2018 registroImprese2018 = (CorsiSportiviImprese2018) o;

		return Objects.equals(this.corsiSportRicrRegistrate, registroImprese2018.corsiSportRicrRegistrate)&&
				Objects.equals(this.corsiSportRicrAttive, registroImprese2018.corsiSportRicrAttive)&&
				Objects.equals(this.corsiSportRicrIscrizioni, registroImprese2018.corsiSportRicrIscrizioni)&&
				Objects.equals(this.corsiSportRicrCessazioni, registroImprese2018.corsiSportRicrCessazioni)&&
				Objects.equals(this.corsiSportRicrAddettiTot, registroImprese2018.corsiSportRicrAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Corsi Sportivi Imprese 2018 {\n");

		sb.append(" corsiSportRicrRegistrate :").append(toIndentedString(corsiSportRicrRegistrate)).append("\n");
		sb.append(" corsiSportRicrAttive :").append(toIndentedString(corsiSportRicrAttive)).append("\n");
		sb.append(" corsiSportRicrIscrizioni :").append(toIndentedString(corsiSportRicrIscrizioni)).append("\n");
		sb.append(" corsiSportRicrCessazioni :").append(toIndentedString(corsiSportRicrCessazioni)).append("\n");
		sb.append(" corsiSportRicrAddettiTot :").append(toIndentedString(corsiSportRicrAddettiTot)).append("\n");
	
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
		return Objects.hash(corsiSportRicrRegistrate, corsiSportRicrAttive, corsiSportRicrIscrizioni, corsiSportRicrCessazioni,
				corsiSportRicrAddettiTot);
	}

}
