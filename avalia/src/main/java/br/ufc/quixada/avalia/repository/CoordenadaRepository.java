package br.ufc.quixada.avalia.repository;

import java.util.List;

import br.ufc.quixada.avalia.model.Coordenada;

public interface CoordenadaRepository {

	public void save(Coordenada c);
	
	public abstract Coordenada getById(Integer id);
	
	public abstract List<Coordenada> getAll();
}
