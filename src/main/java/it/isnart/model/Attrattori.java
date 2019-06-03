package it.isnart.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Attrattori
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class Attrattori   {
  @JsonProperty("idAttrattore")
  private Long idAttrattore = null;

  @JsonProperty("attrattore")
  private String attrattore = null;

  @JsonProperty("idRegione")
  private Long idRegione = null;

  @JsonProperty("idProvincia")
  private Long idProvincia = null;

  @JsonProperty("idComuni")
  private Long idComuni = null;

  public Attrattori idAttrattore(Long idAttrattore) {
    this.idAttrattore = idAttrattore;
    return this;
  }

  /**
   * Get idAttrattore
   * @return idAttrattore
  **/
  @ApiModelProperty(value = "")


  public Long getIdAttrattore() {
    return idAttrattore;
  }

  public void setIdAttrattore(Long idAttrattore) {
    this.idAttrattore = idAttrattore;
  }

  public Attrattori attrattore(String attrattore) {
    this.attrattore = attrattore;
    return this;
  }

  /**
   * Get attrattore
   * @return attrattore
  **/
  @ApiModelProperty(value = "")


  public String getAttrattore() {
    return attrattore;
  }

  public void setAttrattore(String attrattore) {
    this.attrattore = attrattore;
  }

  public Attrattori idRegione(Long idRegione) {
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

  public Attrattori idProvincia(Long idProvincia) {
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

  public Attrattori idComuni(Long idComuni) {
    this.idComuni = idComuni;
    return this;
  }

  /**
   * Get idComuni
   * @return idComuni
  **/
  @ApiModelProperty(value = "")


  public Long getIdComuni() {
    return idComuni;
  }

  public void setIdComuni(Long idComuni) {
    this.idComuni = idComuni;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attrattori attrattori = (Attrattori) o;
    return Objects.equals(this.idAttrattore, attrattori.idAttrattore) &&
        Objects.equals(this.attrattore, attrattori.attrattore) &&
        Objects.equals(this.idRegione, attrattori.idRegione) &&
        Objects.equals(this.idProvincia, attrattori.idProvincia) &&
        Objects.equals(this.idComuni, attrattori.idComuni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAttrattore, attrattore, idRegione, idProvincia, idComuni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attrattori {\n");
    
    sb.append("    idAttrattore: ").append(toIndentedString(idAttrattore)).append("\n");
    sb.append("    attrattore: ").append(toIndentedString(attrattore)).append("\n");
    sb.append("    idRegione: ").append(toIndentedString(idRegione)).append("\n");
    sb.append("    idProvincia: ").append(toIndentedString(idProvincia)).append("\n");
    sb.append("    idComuni: ").append(toIndentedString(idComuni)).append("\n");
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

