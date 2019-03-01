package com.patroclos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto {
	
	@Id
	@Column(name="projeto_id", nullable=false)
	@SequenceGenerator( name = "proj_seq", sequenceName = "projeto_sequence" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proj_seq")
	private long projeto_id;	
	
	private String nome;																				
	private String area;
	private Integer custo;
	
	

	
	public long getProjeto_id() {
		return projeto_id;
	}
	public void setProjeto_id(long projeto_id) {
		this.projeto_id = projeto_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getCusto() {
		return custo;
	}
	public void setCusto(Integer custo) {
		this.custo = custo;
	}
	

}
