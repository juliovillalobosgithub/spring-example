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

public class TrasportiImprese2018 {



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

	



	public TrasportiImprese2018 id(Integer trasportiRegistrati) {
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

	public TrasportiImprese2018 trasportiAttive(Integer trasportiAttive) {
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

	public TrasportiImprese2018 trasportiIscrizioni(Integer trasportiIscrizioni) {
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

	public TrasportiImprese2018 trasportiCessazioni(Integer trasportiCessazioni) {
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

	public TrasportiImprese2018 trasportiAddettiTot(Integer trasportiAddettiTot) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrasportiImprese2018 registroImprese2018 = (TrasportiImprese2018) o;

		return Objects.equals(this.trasportiRegistrati, registroImprese2018.trasportiRegistrati)&&
				Objects.equals(this.trasportiAttive, registroImprese2018.trasportiAttive)&&
				Objects.equals(this.trasportiIscrizioni, registroImprese2018.trasportiIscrizioni)&&
				Objects.equals(this.trasportiCessazioni, registroImprese2018.trasportiCessazioni)&&
				Objects.equals(this.trasportiAddettiTot, registroImprese2018.trasportiAddettiTot);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Trasporti Imprese 2018 {\n");

		sb.append("trasportiRegistrati :").append(toIndentedString(trasportiRegistrati)).append("\n");
		sb.append("trasportiAttive :").append(toIndentedString(trasportiAttive)).append("\n");
		sb.append("trasportiIscrizioni :").append(toIndentedString(trasportiIscrizioni)).append("\n");
		sb.append("trasportiCessazioni :").append(toIndentedString(trasportiCessazioni)).append("\n");
		sb.append("trasportiAddettiTot :").append(toIndentedString(trasportiAddettiTot)).append("\n");

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
		return Objects.hash( trasportiRegistrati, trasportiAttive, trasportiIscrizioni,
				trasportiCessazioni, trasportiAddettiTot);
	}

}
