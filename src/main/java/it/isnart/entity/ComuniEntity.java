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
@Table(name = "comune_provincia_regione_prodotto")
public class ComuniEntity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "COMUNE_ID_GENERATOR", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = { @Parameter(name = "hibernate_sequence", value = "ID_VALUE") })
	@GeneratedValue(generator = "COMUNE_ID_GENERATOR")
	private Long idComune;

	@Column(name = "nome_comune")
	private String nomeComune;

	@Column(name = "id_regione")
	private Long idRegione;

	@Column(name = "id_provincia")
	private Long idProvincia;
	
	@Column(name = "nome_provincia")
	private String nomeProvincia;


}
