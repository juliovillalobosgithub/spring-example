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

public class TotImpreseTuristicheImprese2018 {


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


	public TotImpreseTuristicheImprese2018 totImpTuristicheRegistrate(Integer totImpTuristicheRegistrate) {
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

	public TotImpreseTuristicheImprese2018 totImpTuristicheAttive(Integer totImpTuristicheAttive) {
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

	public TotImpreseTuristicheImprese2018 totImpTuristicheIscrizioni(Integer totImpTuristicheIscrizioni) {
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

	public TotImpreseTuristicheImprese2018 totImpTuristicheCessazioni(Integer totImpTuristicheCessazioni) {
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

	public TotImpreseTuristicheImprese2018 totImpTuristicheAddettiTot(Integer totImpTuristicheAddettiTot) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TotImpreseTuristicheImprese2018 registroImprese2018 = (TotImpreseTuristicheImprese2018) o;

		return Objects.equals(this.totImpTuristicheRegistrate, registroImprese2018.totImpTuristicheRegistrate)&&
				Objects.equals(this.totImpTuristicheAttive, registroImprese2018.totImpTuristicheAttive)&&
				Objects.equals(this.totImpTuristicheIscrizioni, registroImprese2018.totImpTuristicheIscrizioni)&&
				Objects.equals(this.totImpTuristicheCessazioni, registroImprese2018.totImpTuristicheCessazioni)&&
				Objects.equals(this.totImpTuristicheAddettiTot, registroImprese2018.totImpTuristicheAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Registro Imprese 2018 {\n");

		sb.append(" totImpTuristicheRegistrate :").append(toIndentedString(totImpTuristicheRegistrate)).append("\n");
		sb.append(" totImpTuristicheAttive :").append(toIndentedString(totImpTuristicheAttive)).append("\n");
		sb.append(" totImpTuristicheIscrizioni :").append(toIndentedString(totImpTuristicheIscrizioni)).append("\n");
		sb.append(" totImpTuristicheCessazioni :").append(toIndentedString(totImpTuristicheCessazioni)).append("\n");
		sb.append(" totImpTuristicheAddettiTot :").append(toIndentedString(totImpTuristicheAddettiTot)).append("\n");
		
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
		return Objects.hash(totImpTuristicheRegistrate, totImpTuristicheAttive, totImpTuristicheIscrizioni,
				totImpTuristicheCessazioni, totImpTuristicheAddettiTot);
	}

}
