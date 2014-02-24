package br.com.ebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="automovel")
public class Automovel {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anoFabricacao
	 */
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	/**
	 * @return the anoModelo
	 */
	public Integer getAnoModelo() {
		return anoModelo;
	}
	/**
	 * @param anoModelo the anoModelo to set
	 */
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Automovel [id=" + id + ", marca=" + marca + ", modelo="
				+ modelo + ", anoFabricacao=" + anoFabricacao + ", anoModelo="
				+ anoModelo + ", observacoes=" + observacoes + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result
				+ ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

	
}
