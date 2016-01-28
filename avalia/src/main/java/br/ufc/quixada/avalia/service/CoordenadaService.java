package br.ufc.quixada.avalia.service;

import java.util.List;

import br.ufc.quixada.avalia.model.Coordenada;

public interface CoordenadaService {

	public abstract Coordenada getById(Integer id);

	public abstract List<Coordenada> getAll();
}
