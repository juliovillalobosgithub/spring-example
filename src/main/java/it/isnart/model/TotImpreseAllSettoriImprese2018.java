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

public class TotImpreseAllSettoriImprese2018 {

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

	
	public TotImpreseAllSettoriImprese2018 totImprSettoriRegistrate(Integer totImprSettoriRegistrate) {
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

	public TotImpreseAllSettoriImprese2018 totImprSettoriAttive(Integer totImprSettoriAttive) {
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

	public TotImpreseAllSettoriImprese2018 totImprSettoriIscrizioni(Integer totImprSettoriIscrizioni) {
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

	public TotImpreseAllSettoriImprese2018 totImprSettoriCessazioni(Integer totImprSettoriCessazioni) {
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

	public TotImpreseAllSettoriImprese2018 totImprSettoriAddettiTot(Integer totImprSettoriAddettiTot) {
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
		TotImpreseAllSettoriImprese2018 registroImprese2018 = (TotImpreseAllSettoriImprese2018) o;

		return Objects.equals(this.totImprSettoriRegistrate, registroImprese2018.totImprSettoriRegistrate)&&
				Objects.equals(this.totImprSettoriAttive, registroImprese2018.totImprSettoriAttive)&&
				Objects.equals(this.totImprSettoriIscrizioni, registroImprese2018.totImprSettoriIscrizioni)&&
				Objects.equals(this.totImprSettoriCessazioni, registroImprese2018.totImprSettoriCessazioni)&&
				Objects.equals(this.totImprSettoriAddettiTot, registroImprese2018.totImprSettoriAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Totale Imprese tutti i settori Imprese 2018 {\n");

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
		return Objects.hash( totImprSettoriRegistrate, totImprSettoriAttive,totImprSettoriIscrizioni, totImprSettoriCessazioni, 
				totImprSettoriAddettiTot);
	}

}
