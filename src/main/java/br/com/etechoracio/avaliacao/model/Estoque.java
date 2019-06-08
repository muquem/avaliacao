package br.com.etechoracio.avaliacao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ESTOQUE")
public class Estoque {
	
	@Id
	@GeneratedValue
	@Column(name="ID_CODIGO")
	private int id;
	
	
	@Column(name="TX_NOME_MEDICAMENTO")
	private String nm_medicamento;
	
	
	@Column(name="DT_PRODUCAO ")
	private Date dt_producao;
	
	
	@Column(name="DT_VENCIMENTO")
	private Date dt_vencimento;
	
	
	@Column(name="NR_ESTOQUE")
	private int estoque;
	
	
	@Column(name="NR_PRECO")
	private Double preco;

}
