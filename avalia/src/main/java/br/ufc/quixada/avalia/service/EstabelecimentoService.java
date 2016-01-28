package br.ufc.quixada.avalia.service;

import java.util.List;

import br.ufc.quixada.avalia.model.Estabelecimento;

public interface EstabelecimentoService {
	
	public abstract Estabelecimento getById(Integer id);
	
	public abstract List<Estabelecimento> getAll();
}