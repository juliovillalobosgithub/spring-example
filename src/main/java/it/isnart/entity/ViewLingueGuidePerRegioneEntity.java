package it.isnart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "v_lingue_guide_per_regione")
public class ViewLingueGuidePerRegioneEntity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_regione")
	private Long idRegione;

	@Column(name = "nome_regione")
	private String nomeRegione;
	
	@Column(name = "lingua_inglese")
	private Integer linguaInglese;

	@Column(name = "lingua_francese")
	private Integer linguaFrancese;

	@Column(name = "lingua_spagnolo")
	private Integer linguaSpagnolo;

	@Column(name = "lingua_tedesco")
	private Integer linguaTedesco;

	@Column(name = "lingua_russo")
	private Integer linguaRusso;

	@Column(name = "lingua_portoghese")
	private Integer linguaPortoghese;

	@Column(name = "lingua_danese")
	private Integer linguaDanese;

	@Column(name = "lingua_norvegese")
	private Integer linguaNorvegese;

	@Column(name = "lingua_svedese")
	private Integer linguaSvedese;

	@Column(name = "lingua_finlandese")
	private Integer linguaFinlandese;

	@Column(name = "lingua_olandese")
	private Integer linguaOlandese;

	@Column(name = "lingua_fiammingo")
	private Integer linguaFiammingo;

	@Column(name = "lingua_ceco")
	private Integer linguaCeco;

	@Column(name = "lingua_polacco")
	private Integer linguaPolacco;

	@Column(name = "lingua_slovacco")
	private Integer linguaSlovacco;

	@Column(name = "lingua_albanese")
	private Integer linguaAlbanese;

	@Column(name = "lingua_arabo")
	private Integer linguaArabo;

	@Column(name = "lingua_bielorusso")
	private Integer linguaBielorusso;

	@Column(name = "lingua_bosniaco_montenegrino")
	private Integer linguaBosniacoMontenegrino;

	@Column(name = "lingua_catalano")
	private Integer linguaCatalano;

	@Column(name = "lingua_cinese")
	private Integer linguaCinese;

	@Column(name = "lingua_coreano")
	private Integer linguaCoreano;

	@Column(name = "lingua_croato")
	private Integer linguaCroato;

	@Column(name = "lingua_ebraico")
	private Integer linguaEbraico;

	@Column(name = "lingua_estone")
	private Integer linguaEstone;

	@Column(name = "lingua_georgiano")
	private Integer linguaGeorgiano;

	@Column(name = "lingua_giapponese")
	private Integer linguaGiapponese;

	@Column(name = "lingua_greco")
	private Integer linguaGreco;

	@Column(name = "lingua_lettone")
	private Integer linguaLettone;

	@Column(name = "lingua_lis")
	private Integer linguaLis;

	@Column(name = "lingua_lituan")
	private Integer linguaLituan;

	@Column(name = "lingua_persiano")
	private Integer linguaPersiano;

	@Column(name = "lingua_rumeno")
	private Integer linguaRumeno;

	@Column(name = "lingua_serbo")
	private Integer linguaSerbo;

	@Column(name = "lingua_sloveno")
	private Integer linguaSloveno;

	@Column(name = "lingua_turco")
	private Integer linguaTurco;

	@Column(name = "lingua_ucraino")
	private Integer linguaUcraino;

	@Column(name = "lingua_ungherese")
	private Integer linguaUngherese;

	@Column(name = "lingua_bulgaro")
	private Integer linguaBulgaro;

	@Column(name = "lingua_taiwanese")
	private Integer linguaTaiwanese;

	@Column(name = "lingua_hindi")
	private Integer linguaHindi;

}
