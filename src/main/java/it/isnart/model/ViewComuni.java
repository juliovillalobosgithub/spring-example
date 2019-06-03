
package it.isnart.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Comuni
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class ViewComuni   {
  @JsonProperty("id")
  private Long id = null;
  
  @JsonProperty("id_regione")
  private Long idRegione = null;
  
  @JsonProperty("id_provincia")
  private Long idProvincia = null;
  
  @JsonProperty("id_area_prodotto")
  private Long idAreaProdotto = null;

  @JsonProperty("nome_comune")
  private String nomeComune = null;

  @JsonProperty("nome_regione")
  private String nomeRegione = null;
  
  @JsonProperty("nome_province")
  private String nomeProvince = null;
  
  @JsonProperty("nome_area_prodotto")
  private String nomeAreaProdotto = null;

  public ViewComuni id(Long id) {
    this.id = id;
    return this;
  }

  
  
  /**
   * Get idComune
   * @return idComune
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ViewComuni nomeComune(String nomeComune) {
    this.nomeComune = nomeComune;
    return this;
  }

  /**
   * Get comune
   * @return comune
  **/
  @ApiModelProperty(value = "")


  public String getNomeComune() {
    return nomeComune;
  }

  public void setNomeComune(String nomeComune) {
    this.nomeComune = nomeComune;
  }

  public ViewComuni idRegione(String nomeRegione) {
    this.nomeRegione = nomeRegione;
    return this;
  }

  /**
   * Get idRegione
   * @return idRegione
  **/
  @ApiModelProperty(value = "")


  public String getNomeRegione() {
    return nomeRegione;
  }

  public void setNomeRegione(String nomeRegione) {
    this.nomeRegione = nomeRegione;
  }


  /**
   * Get nomeProvincia
   * @return nomeProvincia
  **/
  @ApiModelProperty(value = "")

  public ViewComuni nomeProvincia(String nomeProvince) {
    this.nomeProvince = nomeProvince;
    return this;
  }
  
  public String getNomeProvince() {
	return nomeProvince;
  }

  public void setNomeProvince(String nomeProvince) {
	this.nomeProvince = nomeProvince;
  }
  
  
  /**
   * Get nomeAreaProdotto
   * @return nomeAreaProdotto
  **/
  @ApiModelProperty(value = "")

  public ViewComuni nomeAreaProdotto(String nomeAreaProdotto) {
    this.nomeAreaProdotto = nomeAreaProdotto;
    return this;
  }
  
  public String getNomeAreaProdotto() {
	return nomeAreaProdotto;
  }

  public void setNomeAreaProdotto(String nomeAreaProdotto) {
	this.nomeAreaProdotto = nomeAreaProdotto;
  }

  
  
  /**
   * Get idRegione
   * @return idRegione
  **/
  @ApiModelProperty(value = "")

  public ViewComuni idRegione(Long idRegione) {
    this.idRegione = idRegione;
    return this;
  }
  
  public Long getIdRegione() {
	return idRegione;
  }

  public void setIdRegione(Long idRegione) {
	this.idRegione = idRegione;
  }

  
  /**
   * Get idProvincia
   * @return idProvincia
  **/
  @ApiModelProperty(value = "")

  public ViewComuni idProvincia(Long idProvincia) {
    this.idProvincia = idProvincia;
    return this;
  }
  
  public Long getIdProvincia() {
	return idProvincia;
  }

  public void setIdProvincia(Long idProvincia) {
	this.idProvincia = idProvincia;
  }
  
  
  /**
   * Get idAreaProdotto
   * @return idAreaProdotto
  **/
  @ApiModelProperty(value = "")

  public ViewComuni idAreaProdotto(Long idAreaProdotto) {
    this.idAreaProdotto = idAreaProdotto;
    return this;
  }
  
  public Long getIdAreaProdotto() {
	return idAreaProdotto;
  }

  public void setIdAreaProdotto(Long idAreaProdotto) {
	this.idAreaProdotto = idAreaProdotto;
  }
  
  
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewComuni comuni = (ViewComuni) o;
    return Objects.equals(this.id, comuni.id) &&
        Objects.equals(this.nomeComune, comuni.nomeComune) &&
        Objects.equals(this.nomeRegione, comuni.nomeRegione) &&
        Objects.equals(this.nomeProvince, comuni.nomeProvince) &&
        Objects.equals(this.nomeAreaProdotto, comuni.nomeAreaProdotto)&&
        Objects.equals(this.idRegione, comuni.idRegione) &&
        Objects.equals(this.idProvincia, comuni.idProvincia) &&
        Objects.equals(this.idAreaProdotto, comuni.idAreaProdotto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeComune, nomeRegione, nomeProvince,nomeAreaProdotto, idRegione, idProvincia, idAreaProdotto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comuni {\n");
    
    
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeComune: ").append(toIndentedString(nomeComune)).append("\n");
    sb.append("    nomeRegione: ").append(toIndentedString(nomeRegione)).append("\n");
    sb.append("    nomeProvince: ").append(toIndentedString(nomeProvince)).append("\n");
    sb.append("    nomeAreaProdotto: ").append(toIndentedString(nomeAreaProdotto)).append("\n");
    sb.append("    idRegione: ").append(toIndentedString(idRegione)).append("\n");
    sb.append("    idProvincia: ").append(toIndentedString(idProvincia)).append("\n");
    sb.append("    idAreaProdotto: ").append(toIndentedString(idAreaProdotto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

