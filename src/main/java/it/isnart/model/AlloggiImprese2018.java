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

public class AlloggiImprese2018 {


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

	

	public AlloggiImprese2018 alloggiRegistrati(Integer alloggiRegistrati) {
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

	public AlloggiImprese2018 alloggiAttive(Integer alloggiAttive) {
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

	public AlloggiImprese2018 alloggiIscrizioni(Integer alloggiIscrizioni) {
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

	public AlloggiImprese2018 alloggiCessazioni(Integer alloggiCessazioni) {
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

	public AlloggiImprese2018 alloggiAddettiTot(Integer alloggiAddettiTot) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AlloggiImprese2018 registroImprese2018 = (AlloggiImprese2018) o;

		return Objects.equals(this.alloggiRegistrati, registroImprese2018.alloggiRegistrati)&&
				Objects.equals(this.alloggiAttive, registroImprese2018.alloggiAttive)&&
				Objects.equals(this.alloggiIscrizioni, registroImprese2018.alloggiIscrizioni)&&
				Objects.equals(this.alloggiCessazioni, registroImprese2018.alloggiCessazioni)&&
				Objects.equals(this.alloggiAddettiTot, registroImprese2018.alloggiAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Alloggi Imprese 2018 {\n");

		sb.append("alloggiRegistrati :").append(toIndentedString(alloggiRegistrati)).append("\n");
		sb.append("alloggiAttive :").append(toIndentedString(alloggiAttive)).append("\n");
		sb.append("alloggiIscrizioni :").append(toIndentedString(alloggiIscrizioni)).append("\n");
		sb.append("alloggiCessazioni :").append(toIndentedString(alloggiCessazioni)).append("\n");
		sb.append("alloggiAddettiTot :").append(toIndentedString(alloggiAddettiTot)).append("\n");

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
		return Objects.hash( alloggiRegistrati, alloggiAttive, alloggiIscrizioni,alloggiCessazioni, alloggiAddettiTot);
	}

}
