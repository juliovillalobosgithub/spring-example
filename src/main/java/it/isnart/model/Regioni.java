package it.isnart.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
/**
 * Regioni
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T13:30:44.307Z")

public class Regioni   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("regione")
  private String regione = null;

  public Regioni id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Regioni regione(String regione) {
    this.regione = regione;
    return this;
  }

  /**
   * Get regione
   * @return regione
  **/
  @ApiModelProperty(value = "")


  public String getRegione() {
    return regione;
  }

  public void setRegione(String regione) {
    this.regione = regione;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Regioni regioni = (Regioni) o;
    return Objects.equals(this.id, regioni.id) &&
        Objects.equals(this.regione, regioni.regione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, regione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Regioni {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    regione: ").append(toIndentedString(regione)).append("\n");
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

