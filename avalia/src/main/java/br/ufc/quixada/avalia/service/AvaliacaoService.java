package br.ufc.quixada.avalia.service;

import java.util.List;

import br.ufc.quixada.avalia.model.Avaliacao;

public interface AvaliacaoService {

	public abstract Avaliacao getById(Integer id);
	
	public abstract List<Avaliacao> getAllAvaliacoesEstabelecimento(Integer id);
}
