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

public class AreaProdotto   {
  @JsonProperty("id")
  private Long id= null;

  @JsonProperty("nome_area_prodotto")
  private String nomeAreaProdotto = null;

  public AreaProdotto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get idAreaProdotto
   * @return idAreaProdotto
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AreaProdotto nomeAreaProdotto(String nomeAreaProdotto) {
    this.nomeAreaProdotto = nomeAreaProdotto;
    return this;
  }

  /**
   * Get nomeAreaProdotto
   * @return nomeAreaProdotto
  **/
  @ApiModelProperty(value = "")


  public String getNomeAreaProdotto() {
    return nomeAreaProdotto;
  }

  public void setNomeAreaProdotto(String nomeAreaProdotto) {
    this.nomeAreaProdotto = nomeAreaProdotto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaProdotto attrattori = (AreaProdotto) o;
    return Objects.equals(this.id, attrattori.id) &&
        Objects.equals(this.nomeAreaProdotto, attrattori.nomeAreaProdotto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeAreaProdotto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attrattori {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeAreaProdotto: ").append(toIndentedString(nomeAreaProdotto)).append("\n");
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

