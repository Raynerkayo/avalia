package br.ufc.quixada.avalia.repository;

import br.ufc.quixada.avalia.model.Avaliacao;

public interface AvaliacaoRepository {

	public abstract void save(Avaliacao a);

	public abstract Avaliacao getById(Integer id);

}
