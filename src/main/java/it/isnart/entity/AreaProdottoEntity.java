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
@Table(name = "aree_prodotto")
public class AreaProdottoEntity implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GenericGenerator(name = "AREA_PRODOTTO_ID_GENERATOR", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = { @Parameter(name = "hibernate_sequence", value = "ID_VALUE") })
	@GeneratedValue(generator = "AREA_PRODOTTO_ID_GENERATOR")
	private Long id;

	@Column(name = "nome_area_prodotto")
	private String nomeAreaProdotto;


}
