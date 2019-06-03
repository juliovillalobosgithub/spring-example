
package it.isnart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "v_comuni_completo")
public class ViewComuniEntity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "id")
	@GenericGenerator(name = "COMUNE_ID_GENERATOR", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = { @Parameter(name = "hibernate_sequence", value = "ID_VALUE") })
	@GeneratedValue(generator = "COMUNE_ID_GENERATOR")
	private Long id;

	@Column(name = "nome_comune")
	private String nomeComune;
	
	@Column(name = "nome_province")
	private String nomeProvince;
	
	@Column(name = "nome_regione")
	private String nomeRegione;
	
	@Column(name = "nome_area_prodotto")
	private String nomeAreaProdotto;
	
	@Column(name = "id_regione")
	private Long idRegione;
	
	@Column(name = "id_provincia")
	private Long idProvincia;
	
	@Column(name = "id_area_prodotto")
	private Long idAreaProdotto;

}
