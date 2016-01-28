package br.ufc.quixada.avalia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "avaliacao")
public class Avaliacao implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@Column(name = "id_ava")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "atendimento")
	private double atendimento;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "qualidade_comida")
	private double qualidadeComida;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "preco")
	private double preco;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "ambiente")
	private double ambiente;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "custo_beneficio")
	private double custoBeneficio;
	
	@NotNull(message = "Campo Obrigatório")
	@Column(name = "media")
	private double media;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_est")
	private Estabelecimento estabelecimento;
	
	public double getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(double atendimento) {
		this.atendimento = atendimento;
	}
	public double getQualidadeComida() {
		return qualidadeComida;
	}
	public void setQualidadeComida(double qualidadeComida) {
		this.qualidadeComida = qualidadeComida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(double ambiente) {
		this.ambiente = ambiente;
	}
	public double getCustoBeneficio() {
		return custoBeneficio;
	}
	public void setCustoBeneficio(double custoBeneficio) {
		this.custoBeneficio = custoBeneficio;
	}
	public double getMedia() {
		media = (ambiente + atendimento + custoBeneficio + preco + qualidadeComida)/5;
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	@PostLoad
	private void calcularMedia() {
		
	}
}
