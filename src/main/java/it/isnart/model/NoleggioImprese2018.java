package it.isnart.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Noleggio imprese 2018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class NoleggioImprese2018 {


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


	public NoleggioImprese2018 noleggioAgenzieAltroRegistrate(Integer noleggioAgenzieAltroRegistrate) {
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

	public NoleggioImprese2018 noleggioAgenzieAltroAttive(Integer noleggioAgenzieAltroAttive) {
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

	public NoleggioImprese2018 noleggioAgenzieAltroIscrizioni(Integer noleggioAgenzieAltroIscrizioni) {
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

	public NoleggioImprese2018 noleggioAgenzieAltroCessazioni(Integer noleggioAgenzieAltroCessazioni) {
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

	public NoleggioImprese2018 noleggioAgenzieAltroAddettiTot(Integer noleggioAgenzieAltroAddettiTot) {
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

	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NoleggioImprese2018 registroImprese2018 = (NoleggioImprese2018) o;

		return Objects.equals(this.noleggioAgenzieAltroRegistrate, registroImprese2018.noleggioAgenzieAltroRegistrate)&&
				Objects.equals(this.noleggioAgenzieAltroAttive, registroImprese2018.noleggioAgenzieAltroAttive)&&
				Objects.equals(this.noleggioAgenzieAltroIscrizioni, registroImprese2018.noleggioAgenzieAltroIscrizioni)&&
				Objects.equals(this.noleggioAgenzieAltroCessazioni, registroImprese2018.noleggioAgenzieAltroCessazioni)&&
				Objects.equals(this.noleggioAgenzieAltroAddettiTot, registroImprese2018.noleggioAgenzieAltroAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Registro Imprese 2018 {\n");

		sb.append(" noleggioAgenzieAltroRegistrate :").append(toIndentedString(noleggioAgenzieAltroRegistrate)).append("\n");
		sb.append(" noleggioAgenzieAltroAttive :").append(toIndentedString(noleggioAgenzieAltroAttive)).append("\n");
		sb.append(" noleggioAgenzieAltroIscrizioni :").append(toIndentedString(noleggioAgenzieAltroIscrizioni)).append("\n");
		sb.append(" noleggioAgenzieAltroCessazioni :").append(toIndentedString(noleggioAgenzieAltroCessazioni)).append("\n");
		sb.append(" noleggioAgenzieAltroAddettiTot :").append(toIndentedString(noleggioAgenzieAltroAddettiTot)).append("\n");
		
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
		return Objects.hash( noleggioAgenzieAltroRegistrate,noleggioAgenzieAltroAttive, noleggioAgenzieAltroIscrizioni,
				noleggioAgenzieAltroCessazioni,	noleggioAgenzieAltroAddettiTot);
	}

}
