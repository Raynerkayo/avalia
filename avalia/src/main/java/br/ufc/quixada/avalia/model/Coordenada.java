package br.ufc.quixada.avalia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "coordenada")
public class Coordenada implements Serializable {

	private static final long serialVersionUID = 1l;

	@Id
	@Column(name = "id_cor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "Campo Obrigatório")
	@Column(name = "latitude")
	private double latitude;

	@NotNull(message = "Campo Obrigatório")
	@Column(name = "longitude")
	private double longitude;

	public Coordenada() {}
	
	public Coordenada(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
