package br.ufc.quixada.avalia.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.ufc.quixada.avalia.model.Coordenada;
import br.ufc.quixada.avalia.repository.CoordenadaRepository;

@Named
public class CoordenadaServiceImpl implements CoordenadaService{

	@Inject
	CoordenadaRepository coordenadaRepository;
	
	@Override
	public Coordenada getById(Integer id) {
		return coordenadaRepository.getById(id);
	}

	@Override
	public List<Coordenada> getAll() {
		return coordenadaRepository.getAll();
	}

}
