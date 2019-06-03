package it.isnart.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ViewLingueGuidePerComune
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-19T11:01:09.758Z")

public class ViewLingueGuidePerRegione   {
  @JsonProperty("idRegione")
  private Long idRegione = null;

  @JsonProperty("nomeRegione")
  private String nomeRegione = null;

  @JsonProperty("linguaInglese")
  private Integer linguaInglese = null;

  @JsonProperty("linguaFrancese")
  private Integer linguaFrancese = null;

  @JsonProperty("linguaSpagnolo")
  private Integer linguaSpagnolo = null;

  @JsonProperty("linguaTedesco")
  private Integer linguaTedesco = null;

  @JsonProperty("linguaRusso")
  private Integer linguaRusso = null;

  @JsonProperty("linguaPortoghese")
  private Integer linguaPortoghese = null;

  @JsonProperty("linguaDanese")
  private Integer linguaDanese = null;

  @JsonProperty("linguaNorvegese")
  private Integer linguaNorvegese = null;

  @JsonProperty("linguaSvedese")
  private Integer linguaSvedese = null;

  @JsonProperty("linguaFinlandese")
  private Integer linguaFinlandese = null;

  @JsonProperty("linguaOlandese")
  private Integer linguaOlandese = null;

  @JsonProperty("linguaFiammingo")
  private Integer linguaFiammingo = null;

  @JsonProperty("linguaCeco")
  private Integer linguaCeco = null;

  @JsonProperty("linguaPolacco")
  private Integer linguaPolacco = null;

  @JsonProperty("linguaSlovacco")
  private Integer linguaSlovacco = null;

  @JsonProperty("linguaAlbanese")
  private Integer linguaAlbanese = null;

  @JsonProperty("linguaArabo")
  private Integer linguaArabo = null;

  @JsonProperty("linguaBielorusso")
  private Integer linguaBielorusso = null;

  @JsonProperty("linguaBosniacoMontenegrino")
  private Integer linguaBosniacoMontenegrino = null;

  @JsonProperty("linguaCatalano")
  private Integer linguaCatalano = null;

  @JsonProperty("linguaCinese")
  private Integer linguaCinese = null;

  @JsonProperty("linguaCoreano")
  private Integer linguaCoreano = null;

  @JsonProperty("linguaCroato")
  private Integer linguaCroato = null;

  @JsonProperty("linguaEbraico")
  private Integer linguaEbraico = null;

  @JsonProperty("linguaEstone")
  private Integer linguaEstone = null;

  @JsonProperty("linguaGeorgiano")
  private Integer linguaGeorgiano = null;

  @JsonProperty("linguaGiapponese")
  private Integer linguaGiapponese = null;

  @JsonProperty("linguaGreco")
  private Integer linguaGreco = null;

  @JsonProperty("linguaLettone")
  private Integer linguaLettone = null;

  @JsonProperty("linguaLis")
  private Integer linguaLis = null;

  @JsonProperty("linguaLituan")
  private Integer linguaLituan = null;

  @JsonProperty("linguaPersiano")
  private Integer linguaPersiano = null;

  @JsonProperty("linguaRumeno")
  private Integer linguaRumeno = null;

  @JsonProperty("linguaSerbo")
  private Integer linguaSerbo = null;

  @JsonProperty("linguaSloveno")
  private Integer linguaSloveno = null;

  @JsonProperty("linguaTurco")
  private Integer linguaTurco = null;

  @JsonProperty("linguaUcraino")
  private Integer linguaUcraino = null;

  @JsonProperty("linguaUngherese")
  private Integer linguaUngherese = null;

  @JsonProperty("linguaBulgaro")
  private Integer linguaBulgaro = null;

  @JsonProperty("linguaTaiwanese")
  private Integer linguaTaiwanese = null;

  @JsonProperty("linguaHindi")
  private Integer linguaHindi = null;

  public ViewLingueGuidePerRegione idRegione(Long idRegione) {
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

  public ViewLingueGuidePerRegione nomeRegione(String nomeRegione) {
    this.nomeRegione = nomeRegione;
    return this;
  }

  /**
   * Get nomeRegione
   * @return nomeRegione
  **/
  @ApiModelProperty(value = "")


  public String getNomeRegione() {
    return nomeRegione;
  }

  public void setNomeRegione(String nomeRegione) {
    this.nomeRegione = nomeRegione;
  }

  public ViewLingueGuidePerRegione linguaInglese(Integer linguaInglese) {
    this.linguaInglese = linguaInglese;
    return this;
  }

  /**
   * Get linguaInglese
   * @return linguaInglese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaInglese() {
    return linguaInglese;
  }

  public void setLinguaInglese(Integer linguaInglese) {
    this.linguaInglese = linguaInglese;
  }

  public ViewLingueGuidePerRegione linguaFrancese(Integer linguaFrancese) {
    this.linguaFrancese = linguaFrancese;
    return this;
  }

  /**
   * Get linguaFrancese
   * @return linguaFrancese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaFrancese() {
    return linguaFrancese;
  }

  public void setLinguaFrancese(Integer linguaFrancese) {
    this.linguaFrancese = linguaFrancese;
  }

  public ViewLingueGuidePerRegione linguaSpagnolo(Integer linguaSpagnolo) {
    this.linguaSpagnolo = linguaSpagnolo;
    return this;
  }

  /**
   * Get linguaSpagnolo
   * @return linguaSpagnolo
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaSpagnolo() {
    return linguaSpagnolo;
  }

  public void setLinguaSpagnolo(Integer linguaSpagnolo) {
    this.linguaSpagnolo = linguaSpagnolo;
  }

  public ViewLingueGuidePerRegione linguaTedesco(Integer linguaTedesco) {
    this.linguaTedesco = linguaTedesco;
    return this;
  }

  /**
   * Get linguaTedesco
   * @return linguaTedesco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaTedesco() {
    return linguaTedesco;
  }

  public void setLinguaTedesco(Integer linguaTedesco) {
    this.linguaTedesco = linguaTedesco;
  }

  public ViewLingueGuidePerRegione linguaRusso(Integer linguaRusso) {
    this.linguaRusso = linguaRusso;
    return this;
  }

  /**
   * Get linguaRusso
   * @return linguaRusso
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaRusso() {
    return linguaRusso;
  }

  public void setLinguaRusso(Integer linguaRusso) {
    this.linguaRusso = linguaRusso;
  }

  public ViewLingueGuidePerRegione linguaPortoghese(Integer linguaPortoghese) {
    this.linguaPortoghese = linguaPortoghese;
    return this;
  }

  /**
   * Get linguaPortoghese
   * @return linguaPortoghese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaPortoghese() {
    return linguaPortoghese;
  }

  public void setLinguaPortoghese(Integer linguaPortoghese) {
    this.linguaPortoghese = linguaPortoghese;
  }

  public ViewLingueGuidePerRegione linguaDanese(Integer linguaDanese) {
    this.linguaDanese = linguaDanese;
    return this;
  }

  /**
   * Get linguaDanese
   * @return linguaDanese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaDanese() {
    return linguaDanese;
  }

  public void setLinguaDanese(Integer linguaDanese) {
    this.linguaDanese = linguaDanese;
  }

  public ViewLingueGuidePerRegione linguaNorvegese(Integer linguaNorvegese) {
    this.linguaNorvegese = linguaNorvegese;
    return this;
  }

  /**
   * Get linguaNorvegese
   * @return linguaNorvegese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaNorvegese() {
    return linguaNorvegese;
  }

  public void setLinguaNorvegese(Integer linguaNorvegese) {
    this.linguaNorvegese = linguaNorvegese;
  }

  public ViewLingueGuidePerRegione linguaSvedese(Integer linguaSvedese) {
    this.linguaSvedese = linguaSvedese;
    return this;
  }

  /**
   * Get linguaSvedese
   * @return linguaSvedese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaSvedese() {
    return linguaSvedese;
  }

  public void setLinguaSvedese(Integer linguaSvedese) {
    this.linguaSvedese = linguaSvedese;
  }

  public ViewLingueGuidePerRegione linguaFinlandese(Integer linguaFinlandese) {
    this.linguaFinlandese = linguaFinlandese;
    return this;
  }

  /**
   * Get linguaFinlandese
   * @return linguaFinlandese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaFinlandese() {
    return linguaFinlandese;
  }

  public void setLinguaFinlandese(Integer linguaFinlandese) {
    this.linguaFinlandese = linguaFinlandese;
  }

  public ViewLingueGuidePerRegione linguaOlandese(Integer linguaOlandese) {
    this.linguaOlandese = linguaOlandese;
    return this;
  }

  /**
   * Get linguaOlandese
   * @return linguaOlandese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaOlandese() {
    return linguaOlandese;
  }

  public void setLinguaOlandese(Integer linguaOlandese) {
    this.linguaOlandese = linguaOlandese;
  }

  public ViewLingueGuidePerRegione linguaFiammingo(Integer linguaFiammingo) {
    this.linguaFiammingo = linguaFiammingo;
    return this;
  }

  /**
   * Get linguaFiammingo
   * @return linguaFiammingo
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaFiammingo() {
    return linguaFiammingo;
  }

  public void setLinguaFiammingo(Integer linguaFiammingo) {
    this.linguaFiammingo = linguaFiammingo;
  }

  public ViewLingueGuidePerRegione linguaCeco(Integer linguaCeco) {
    this.linguaCeco = linguaCeco;
    return this;
  }

  /**
   * Get linguaCeco
   * @return linguaCeco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaCeco() {
    return linguaCeco;
  }

  public void setLinguaCeco(Integer linguaCeco) {
    this.linguaCeco = linguaCeco;
  }

  public ViewLingueGuidePerRegione linguaPolacco(Integer linguaPolacco) {
    this.linguaPolacco = linguaPolacco;
    return this;
  }

  /**
   * Get linguaPolacco
   * @return linguaPolacco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaPolacco() {
    return linguaPolacco;
  }

  public void setLinguaPolacco(Integer linguaPolacco) {
    this.linguaPolacco = linguaPolacco;
  }

  public ViewLingueGuidePerRegione linguaSlovacco(Integer linguaSlovacco) {
    this.linguaSlovacco = linguaSlovacco;
    return this;
  }

  /**
   * Get linguaSlovacco
   * @return linguaSlovacco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaSlovacco() {
    return linguaSlovacco;
  }

  public void setLinguaSlovacco(Integer linguaSlovacco) {
    this.linguaSlovacco = linguaSlovacco;
  }

  public ViewLingueGuidePerRegione linguaAlbanese(Integer linguaAlbanese) {
    this.linguaAlbanese = linguaAlbanese;
    return this;
  }

  /**
   * Get linguaAlbanese
   * @return linguaAlbanese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaAlbanese() {
    return linguaAlbanese;
  }

  public void setLinguaAlbanese(Integer linguaAlbanese) {
    this.linguaAlbanese = linguaAlbanese;
  }

  public ViewLingueGuidePerRegione linguaArabo(Integer linguaArabo) {
    this.linguaArabo = linguaArabo;
    return this;
  }

  /**
   * Get linguaArabo
   * @return linguaArabo
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaArabo() {
    return linguaArabo;
  }

  public void setLinguaArabo(Integer linguaArabo) {
    this.linguaArabo = linguaArabo;
  }

  public ViewLingueGuidePerRegione linguaBielorusso(Integer linguaBielorusso) {
    this.linguaBielorusso = linguaBielorusso;
    return this;
  }

  /**
   * Get linguaBielorusso
   * @return linguaBielorusso
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaBielorusso() {
    return linguaBielorusso;
  }

  public void setLinguaBielorusso(Integer linguaBielorusso) {
    this.linguaBielorusso = linguaBielorusso;
  }

  public ViewLingueGuidePerRegione linguaBosniacoMontenegrino(Integer linguaBosniacoMontenegrino) {
    this.linguaBosniacoMontenegrino = linguaBosniacoMontenegrino;
    return this;
  }

  /**
   * Get linguaBosniacoMontenegrino
   * @return linguaBosniacoMontenegrino
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaBosniacoMontenegrino() {
    return linguaBosniacoMontenegrino;
  }

  public void setLinguaBosniacoMontenegrino(Integer linguaBosniacoMontenegrino) {
    this.linguaBosniacoMontenegrino = linguaBosniacoMontenegrino;
  }

  public ViewLingueGuidePerRegione linguaCatalano(Integer linguaCatalano) {
    this.linguaCatalano = linguaCatalano;
    return this;
  }

  /**
   * Get linguaCatalano
   * @return linguaCatalano
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaCatalano() {
    return linguaCatalano;
  }

  public void setLinguaCatalano(Integer linguaCatalano) {
    this.linguaCatalano = linguaCatalano;
  }

  public ViewLingueGuidePerRegione linguaCinese(Integer linguaCinese) {
    this.linguaCinese = linguaCinese;
    return this;
  }

  /**
   * Get linguaCinese
   * @return linguaCinese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaCinese() {
    return linguaCinese;
  }

  public void setLinguaCinese(Integer linguaCinese) {
    this.linguaCinese = linguaCinese;
  }

  public ViewLingueGuidePerRegione linguaCoreano(Integer linguaCoreano) {
    this.linguaCoreano = linguaCoreano;
    return this;
  }

  /**
   * Get linguaCoreano
   * @return linguaCoreano
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaCoreano() {
    return linguaCoreano;
  }

  public void setLinguaCoreano(Integer linguaCoreano) {
    this.linguaCoreano = linguaCoreano;
  }

  public ViewLingueGuidePerRegione linguaCroato(Integer linguaCroato) {
    this.linguaCroato = linguaCroato;
    return this;
  }

  /**
   * Get linguaCroato
   * @return linguaCroato
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaCroato() {
    return linguaCroato;
  }

  public void setLinguaCroato(Integer linguaCroato) {
    this.linguaCroato = linguaCroato;
  }

  public ViewLingueGuidePerRegione linguaEbraico(Integer linguaEbraico) {
    this.linguaEbraico = linguaEbraico;
    return this;
  }

  /**
   * Get linguaEbraico
   * @return linguaEbraico
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaEbraico() {
    return linguaEbraico;
  }

  public void setLinguaEbraico(Integer linguaEbraico) {
    this.linguaEbraico = linguaEbraico;
  }

  public ViewLingueGuidePerRegione linguaEstone(Integer linguaEstone) {
    this.linguaEstone = linguaEstone;
    return this;
  }

  /**
   * Get linguaEstone
   * @return linguaEstone
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaEstone() {
    return linguaEstone;
  }

  public void setLinguaEstone(Integer linguaEstone) {
    this.linguaEstone = linguaEstone;
  }

  public ViewLingueGuidePerRegione linguaGeorgiano(Integer linguaGeorgiano) {
    this.linguaGeorgiano = linguaGeorgiano;
    return this;
  }

  /**
   * Get linguaGeorgiano
   * @return linguaGeorgiano
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaGeorgiano() {
    return linguaGeorgiano;
  }

  public void setLinguaGeorgiano(Integer linguaGeorgiano) {
    this.linguaGeorgiano = linguaGeorgiano;
  }

  public ViewLingueGuidePerRegione linguaGiapponese(Integer linguaGiapponese) {
    this.linguaGiapponese = linguaGiapponese;
    return this;
  }

  /**
   * Get linguaGiapponese
   * @return linguaGiapponese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaGiapponese() {
    return linguaGiapponese;
  }

  public void setLinguaGiapponese(Integer linguaGiapponese) {
    this.linguaGiapponese = linguaGiapponese;
  }

  public ViewLingueGuidePerRegione linguaGreco(Integer linguaGreco) {
    this.linguaGreco = linguaGreco;
    return this;
  }

  /**
   * Get linguaGreco
   * @return linguaGreco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaGreco() {
    return linguaGreco;
  }

  public void setLinguaGreco(Integer linguaGreco) {
    this.linguaGreco = linguaGreco;
  }

  public ViewLingueGuidePerRegione linguaLettone(Integer linguaLettone) {
    this.linguaLettone = linguaLettone;
    return this;
  }

  /**
   * Get linguaLettone
   * @return linguaLettone
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaLettone() {
    return linguaLettone;
  }

  public void setLinguaLettone(Integer linguaLettone) {
    this.linguaLettone = linguaLettone;
  }

  public ViewLingueGuidePerRegione linguaLis(Integer linguaLis) {
    this.linguaLis = linguaLis;
    return this;
  }

  /**
   * Get linguaLis
   * @return linguaLis
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaLis() {
    return linguaLis;
  }

  public void setLinguaLis(Integer linguaLis) {
    this.linguaLis = linguaLis;
  }

  public ViewLingueGuidePerRegione linguaLituan(Integer linguaLituan) {
    this.linguaLituan = linguaLituan;
    return this;
  }

  /**
   * Get linguaLituan
   * @return linguaLituan
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaLituan() {
    return linguaLituan;
  }

  public void setLinguaLituan(Integer linguaLituan) {
    this.linguaLituan = linguaLituan;
  }

  public ViewLingueGuidePerRegione linguaPersiano(Integer linguaPersiano) {
    this.linguaPersiano = linguaPersiano;
    return this;
  }

  /**
   * Get linguaPersiano
   * @return linguaPersiano
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaPersiano() {
    return linguaPersiano;
  }

  public void setLinguaPersiano(Integer linguaPersiano) {
    this.linguaPersiano = linguaPersiano;
  }

  public ViewLingueGuidePerRegione linguaRumeno(Integer linguaRumeno) {
    this.linguaRumeno = linguaRumeno;
    return this;
  }

  /**
   * Get linguaRumeno
   * @return linguaRumeno
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaRumeno() {
    return linguaRumeno;
  }

  public void setLinguaRumeno(Integer linguaRumeno) {
    this.linguaRumeno = linguaRumeno;
  }

  public ViewLingueGuidePerRegione linguaSerbo(Integer linguaSerbo) {
    this.linguaSerbo = linguaSerbo;
    return this;
  }

  /**
   * Get linguaSerbo
   * @return linguaSerbo
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaSerbo() {
    return linguaSerbo;
  }

  public void setLinguaSerbo(Integer linguaSerbo) {
    this.linguaSerbo = linguaSerbo;
  }

  public ViewLingueGuidePerRegione linguaSloveno(Integer linguaSloveno) {
    this.linguaSloveno = linguaSloveno;
    return this;
  }

  /**
   * Get linguaSloveno
   * @return linguaSloveno
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaSloveno() {
    return linguaSloveno;
  }

  public void setLinguaSloveno(Integer linguaSloveno) {
    this.linguaSloveno = linguaSloveno;
  }

  public ViewLingueGuidePerRegione linguaTurco(Integer linguaTurco) {
    this.linguaTurco = linguaTurco;
    return this;
  }

  /**
   * Get linguaTurco
   * @return linguaTurco
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaTurco() {
    return linguaTurco;
  }

  public void setLinguaTurco(Integer linguaTurco) {
    this.linguaTurco = linguaTurco;
  }

  public ViewLingueGuidePerRegione linguaUcraino(Integer linguaUcraino) {
    this.linguaUcraino = linguaUcraino;
    return this;
  }

  /**
   * Get linguaUcraino
   * @return linguaUcraino
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaUcraino() {
    return linguaUcraino;
  }

  public void setLinguaUcraino(Integer linguaUcraino) {
    this.linguaUcraino = linguaUcraino;
  }

  public ViewLingueGuidePerRegione linguaUngherese(Integer linguaUngherese) {
    this.linguaUngherese = linguaUngherese;
    return this;
  }

  /**
   * Get linguaUngherese
   * @return linguaUngherese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaUngherese() {
    return linguaUngherese;
  }

  public void setLinguaUngherese(Integer linguaUngherese) {
    this.linguaUngherese = linguaUngherese;
  }

  public ViewLingueGuidePerRegione linguaBulgaro(Integer linguaBulgaro) {
    this.linguaBulgaro = linguaBulgaro;
    return this;
  }

  /**
   * Get linguaBulgaro
   * @return linguaBulgaro
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaBulgaro() {
    return linguaBulgaro;
  }

  public void setLinguaBulgaro(Integer linguaBulgaro) {
    this.linguaBulgaro = linguaBulgaro;
  }

  public ViewLingueGuidePerRegione linguaTaiwanese(Integer linguaTaiwanese) {
    this.linguaTaiwanese = linguaTaiwanese;
    return this;
  }

  /**
   * Get linguaTaiwanese
   * @return linguaTaiwanese
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaTaiwanese() {
    return linguaTaiwanese;
  }

  public void setLinguaTaiwanese(Integer linguaTaiwanese) {
    this.linguaTaiwanese = linguaTaiwanese;
  }

  public ViewLingueGuidePerRegione linguaHindi(Integer linguaHindi) {
    this.linguaHindi = linguaHindi;
    return this;
  }

  /**
   * Get linguaHindi
   * @return linguaHindi
  **/
  @ApiModelProperty(value = "")


  public Integer getLinguaHindi() {
    return linguaHindi;
  }

  public void setLinguaHindi(Integer linguaHindi) {
    this.linguaHindi = linguaHindi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewLingueGuidePerRegione viewLingueGuidePerComune = (ViewLingueGuidePerRegione) o;
    return Objects.equals(this.idRegione, viewLingueGuidePerComune.idRegione) &&
        Objects.equals(this.nomeRegione, viewLingueGuidePerComune.nomeRegione) &&
        Objects.equals(this.linguaInglese, viewLingueGuidePerComune.linguaInglese) &&
        Objects.equals(this.linguaFrancese, viewLingueGuidePerComune.linguaFrancese) &&
        Objects.equals(this.linguaSpagnolo, viewLingueGuidePerComune.linguaSpagnolo) &&
        Objects.equals(this.linguaTedesco, viewLingueGuidePerComune.linguaTedesco) &&
        Objects.equals(this.linguaRusso, viewLingueGuidePerComune.linguaRusso) &&
        Objects.equals(this.linguaPortoghese, viewLingueGuidePerComune.linguaPortoghese) &&
        Objects.equals(this.linguaDanese, viewLingueGuidePerComune.linguaDanese) &&
        Objects.equals(this.linguaNorvegese, viewLingueGuidePerComune.linguaNorvegese) &&
        Objects.equals(this.linguaSvedese, viewLingueGuidePerComune.linguaSvedese) &&
        Objects.equals(this.linguaFinlandese, viewLingueGuidePerComune.linguaFinlandese) &&
        Objects.equals(this.linguaOlandese, viewLingueGuidePerComune.linguaOlandese) &&
        Objects.equals(this.linguaFiammingo, viewLingueGuidePerComune.linguaFiammingo) &&
        Objects.equals(this.linguaCeco, viewLingueGuidePerComune.linguaCeco) &&
        Objects.equals(this.linguaPolacco, viewLingueGuidePerComune.linguaPolacco) &&
        Objects.equals(this.linguaSlovacco, viewLingueGuidePerComune.linguaSlovacco) &&
        Objects.equals(this.linguaAlbanese, viewLingueGuidePerComune.linguaAlbanese) &&
        Objects.equals(this.linguaArabo, viewLingueGuidePerComune.linguaArabo) &&
        Objects.equals(this.linguaBielorusso, viewLingueGuidePerComune.linguaBielorusso) &&
        Objects.equals(this.linguaBosniacoMontenegrino, viewLingueGuidePerComune.linguaBosniacoMontenegrino) &&
        Objects.equals(this.linguaCatalano, viewLingueGuidePerComune.linguaCatalano) &&
        Objects.equals(this.linguaCinese, viewLingueGuidePerComune.linguaCinese) &&
        Objects.equals(this.linguaCoreano, viewLingueGuidePerComune.linguaCoreano) &&
        Objects.equals(this.linguaCroato, viewLingueGuidePerComune.linguaCroato) &&
        Objects.equals(this.linguaEbraico, viewLingueGuidePerComune.linguaEbraico) &&
        Objects.equals(this.linguaEstone, viewLingueGuidePerComune.linguaEstone) &&
        Objects.equals(this.linguaGeorgiano, viewLingueGuidePerComune.linguaGeorgiano) &&
        Objects.equals(this.linguaGiapponese, viewLingueGuidePerComune.linguaGiapponese) &&
        Objects.equals(this.linguaGreco, viewLingueGuidePerComune.linguaGreco) &&
        Objects.equals(this.linguaLettone, viewLingueGuidePerComune.linguaLettone) &&
        Objects.equals(this.linguaLis, viewLingueGuidePerComune.linguaLis) &&
        Objects.equals(this.linguaLituan, viewLingueGuidePerComune.linguaLituan) &&
        Objects.equals(this.linguaPersiano, viewLingueGuidePerComune.linguaPersiano) &&
        Objects.equals(this.linguaRumeno, viewLingueGuidePerComune.linguaRumeno) &&
        Objects.equals(this.linguaSerbo, viewLingueGuidePerComune.linguaSerbo) &&
        Objects.equals(this.linguaSloveno, viewLingueGuidePerComune.linguaSloveno) &&
        Objects.equals(this.linguaTurco, viewLingueGuidePerComune.linguaTurco) &&
        Objects.equals(this.linguaUcraino, viewLingueGuidePerComune.linguaUcraino) &&
        Objects.equals(this.linguaUngherese, viewLingueGuidePerComune.linguaUngherese) &&
        Objects.equals(this.linguaBulgaro, viewLingueGuidePerComune.linguaBulgaro) &&
        Objects.equals(this.linguaTaiwanese, viewLingueGuidePerComune.linguaTaiwanese) &&
        Objects.equals(this.linguaHindi, viewLingueGuidePerComune.linguaHindi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRegione, nomeRegione, linguaInglese, linguaFrancese, linguaSpagnolo, linguaTedesco, linguaRusso, linguaPortoghese, linguaDanese, linguaNorvegese, linguaSvedese, linguaFinlandese, linguaOlandese, linguaFiammingo, linguaCeco, linguaPolacco, linguaSlovacco, linguaAlbanese, linguaArabo, linguaBielorusso, linguaBosniacoMontenegrino, linguaCatalano, linguaCinese, linguaCoreano, linguaCroato, linguaEbraico, linguaEstone, linguaGeorgiano, linguaGiapponese, linguaGreco, linguaLettone, linguaLis, linguaLituan, linguaPersiano, linguaRumeno, linguaSerbo, linguaSloveno, linguaTurco, linguaUcraino, linguaUngherese, linguaBulgaro, linguaTaiwanese, linguaHindi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewLingueGuidePerComune {\n");
    
    sb.append("    idRegione: ").append(toIndentedString(idRegione)).append("\n");
    sb.append("    nomeRegione: ").append(toIndentedString(nomeRegione)).append("\n");
    sb.append("    linguaInglese: ").append(toIndentedString(linguaInglese)).append("\n");
    sb.append("    linguaFrancese: ").append(toIndentedString(linguaFrancese)).append("\n");
    sb.append("    linguaSpagnolo: ").append(toIndentedString(linguaSpagnolo)).append("\n");
    sb.append("    linguaTedesco: ").append(toIndentedString(linguaTedesco)).append("\n");
    sb.append("    linguaRusso: ").append(toIndentedString(linguaRusso)).append("\n");
    sb.append("    linguaPortoghese: ").append(toIndentedString(linguaPortoghese)).append("\n");
    sb.append("    linguaDanese: ").append(toIndentedString(linguaDanese)).append("\n");
    sb.append("    linguaNorvegese: ").append(toIndentedString(linguaNorvegese)).append("\n");
    sb.append("    linguaSvedese: ").append(toIndentedString(linguaSvedese)).append("\n");
    sb.append("    linguaFinlandese: ").append(toIndentedString(linguaFinlandese)).append("\n");
    sb.append("    linguaOlandese: ").append(toIndentedString(linguaOlandese)).append("\n");
    sb.append("    linguaFiammingo: ").append(toIndentedString(linguaFiammingo)).append("\n");
    sb.append("    linguaCeco: ").append(toIndentedString(linguaCeco)).append("\n");
    sb.append("    linguaPolacco: ").append(toIndentedString(linguaPolacco)).append("\n");
    sb.append("    linguaSlovacco: ").append(toIndentedString(linguaSlovacco)).append("\n");
    sb.append("    linguaAlbanese: ").append(toIndentedString(linguaAlbanese)).append("\n");
    sb.append("    linguaArabo: ").append(toIndentedString(linguaArabo)).append("\n");
    sb.append("    linguaBielorusso: ").append(toIndentedString(linguaBielorusso)).append("\n");
    sb.append("    linguaBosniacoMontenegrino: ").append(toIndentedString(linguaBosniacoMontenegrino)).append("\n");
    sb.append("    linguaCatalano: ").append(toIndentedString(linguaCatalano)).append("\n");
    sb.append("    linguaCinese: ").append(toIndentedString(linguaCinese)).append("\n");
    sb.append("    linguaCoreano: ").append(toIndentedString(linguaCoreano)).append("\n");
    sb.append("    linguaCroato: ").append(toIndentedString(linguaCroato)).append("\n");
    sb.append("    linguaEbraico: ").append(toIndentedString(linguaEbraico)).append("\n");
    sb.append("    linguaEstone: ").append(toIndentedString(linguaEstone)).append("\n");
    sb.append("    linguaGeorgiano: ").append(toIndentedString(linguaGeorgiano)).append("\n");
    sb.append("    linguaGiapponese: ").append(toIndentedString(linguaGiapponese)).append("\n");
    sb.append("    linguaGreco: ").append(toIndentedString(linguaGreco)).append("\n");
    sb.append("    linguaLettone: ").append(toIndentedString(linguaLettone)).append("\n");
    sb.append("    linguaLis: ").append(toIndentedString(linguaLis)).append("\n");
    sb.append("    linguaLituan: ").append(toIndentedString(linguaLituan)).append("\n");
    sb.append("    linguaPersiano: ").append(toIndentedString(linguaPersiano)).append("\n");
    sb.append("    linguaRumeno: ").append(toIndentedString(linguaRumeno)).append("\n");
    sb.append("    linguaSerbo: ").append(toIndentedString(linguaSerbo)).append("\n");
    sb.append("    linguaSloveno: ").append(toIndentedString(linguaSloveno)).append("\n");
    sb.append("    linguaTurco: ").append(toIndentedString(linguaTurco)).append("\n");
    sb.append("    linguaUcraino: ").append(toIndentedString(linguaUcraino)).append("\n");
    sb.append("    linguaUngherese: ").append(toIndentedString(linguaUngherese)).append("\n");
    sb.append("    linguaBulgaro: ").append(toIndentedString(linguaBulgaro)).append("\n");
    sb.append("    linguaTaiwanese: ").append(toIndentedString(linguaTaiwanese)).append("\n");
    sb.append("    linguaHindi: ").append(toIndentedString(linguaHindi)).append("\n");
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

