package br.ufc.quixada.avalia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "estabelecimento")
public class Estabelecimento implements Serializable{
	
	private static final long serialVersionUID = 1l;

	@Id
	@Column(name = "id_est")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo obrigatório")
	@Column(name = "nome")
	@Pattern(regexp = "[a-zA-Z\\sà-ùÀ-Ù]{0,}", message = "O campo Nome não pode possuir caracteres especiais ou números.")
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cor", nullable=false)
	private Coordenada coordenadas;
	
	@OneToMany(mappedBy = "estabelecimento", targetEntity = Avaliacao.class)
	private List<Avaliacao> avaliacoes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Coordenada getCoordenadas() {
		return coordenadas;
	}
	public void setCoordenadas(Coordenada coordenadas) {
		this.coordenadas = coordenadas;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}