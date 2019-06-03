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

public class Comuni   {
  @JsonProperty("id")
  private Long idComune = null;

  @JsonProperty("nome_comune")
  private String nomeComune = null;

  @JsonProperty("idRegione")
  private Long idRegione = null;

  @JsonProperty("idProvincia")
  private Long idProvincia = null;
  
  @JsonProperty("nome_provincia")
  private String nomeProvincia = null;

  public Comuni idComune(Long idComune) {
    this.idComune = idComune;
    return this;
  }

  /**
   * Get idComune
   * @return idComune
  **/
  @ApiModelProperty(value = "")


  public Long getIdComune() {
    return idComune;
  }

  public void setIdComune(Long idComune) {
    this.idComune = idComune;
  }

  public Comuni comune(String nomeComune) {
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

  public Comuni idRegione(Long idRegione) {
    this.idRegione = idRegione;
    return this;
  }

  /**
   * Get idRegione
   * @return idRegione
  **/
  @ApiModelProperty(value = "")


  public Long getIdRegione() {
    return idRegione;
  }

  public void setIdRegione(Long idRegione) {
    this.idRegione = idRegione;
  }

  public Comuni idProvincia(Long idProvincia) {
    this.idProvincia = idProvincia;
    return this;
  }
  
  /**
   * Get idProvincia
   * @return idProvincia
  **/
  @ApiModelProperty(value = "")

  
  public Long getIdProvincia() {
    return idProvincia;
  }

  public void setIdProvincia(Long idProvincia) {
    this.idProvincia = idProvincia;
  }
  
  /**
   * Get nomeProvincia
   * @return nomeProvincia
  **/
  @ApiModelProperty(value = "")

  public Comuni nomeProvincia(String nomeProvincia) {
    this.nomeProvincia = nomeProvincia;
    return this;
  }
  
  public String getNomeProvincia() {
	return nomeProvincia;
  }

  public void setNomeProvincia(String nomeProvincia) {
	this.nomeProvincia = nomeProvincia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comuni comuni = (Comuni) o;
    return Objects.equals(this.idComune, comuni.idComune) &&
        Objects.equals(this.nomeComune, comuni.nomeComune) &&
        Objects.equals(this.idRegione, comuni.idRegione) &&
        Objects.equals(this.idProvincia, comuni.idProvincia)&&
        Objects.equals(this.nomeProvincia, comuni.nomeProvincia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idComune, nomeComune, idRegione, idProvincia , nomeProvincia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comuni {\n");
    
    sb.append("    idComune: ").append(toIndentedString(idComune)).append("\n");
    sb.append("    nomeComune: ").append(toIndentedString(nomeComune)).append("\n");
    sb.append("    idRegione: ").append(toIndentedString(idRegione)).append("\n");
    sb.append("    idProvincia: ").append(toIndentedString(idProvincia)).append("\n");
    sb.append("    nomeProvincia: ").append(toIndentedString(nomeProvincia)).append("\n");
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

