package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Ristorazione imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class RistorazioneImprese2018 {


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


	public RistorazioneImprese2018 ristorazioneRegistrati(Integer ristorazioneRegistrati) {
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

	public RistorazioneImprese2018 ristorazioneAttive(Integer ristorazioneAttive) {
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

	public RistorazioneImprese2018 ristorazioneIscrizioni(Integer ristorazioneIscrizioni) {
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

	public RistorazioneImprese2018 ristorazioneCessazioni(Integer ristorazioneCessazioni) {
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

	public RistorazioneImprese2018 ristorazioneAddettiTot(Integer ristorazioneAddettiTot) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RistorazioneImprese2018 registroImprese2018 = (RistorazioneImprese2018) o;

		return Objects.equals(this.ristorazioneRegistrati, registroImprese2018.ristorazioneRegistrati)&&
				Objects.equals(this.ristorazioneAttive, registroImprese2018.ristorazioneAttive)&&
				Objects.equals(this.ristorazioneIscrizioni, registroImprese2018.ristorazioneIscrizioni)&&
				Objects.equals(this.ristorazioneCessazioni, registroImprese2018.ristorazioneCessazioni)&&
				Objects.equals(this.ristorazioneAddettiTot, registroImprese2018.ristorazioneAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Ristorazione Imprese 2018 {\n");

		sb.append("ristorazioneRegistrati :").append(toIndentedString(ristorazioneRegistrati)).append("\n");
		sb.append("ristorazioneAttive :").append(toIndentedString(ristorazioneAttive)).append("\n");
		sb.append("ristorazioneIscrizioni :").append(toIndentedString(ristorazioneIscrizioni)).append("\n");
		sb.append("ristorazioneCessazioni :").append(toIndentedString(ristorazioneCessazioni)).append("\n");
		sb.append("ristorazioneAddettiTot :").append(toIndentedString(ristorazioneAddettiTot)).append("\n");

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
		return Objects.hash(ristorazioneRegistrati, ristorazioneAttive,ristorazioneIscrizioni, ristorazioneCessazioni, ristorazioneAddettiTot);
	}

}
