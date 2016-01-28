package br.ufc.quixada.avalia.repository;

import java.util.List;

import br.ufc.quixada.avalia.model.Estabelecimento;

public interface EstabelecimentoRepository {
	
	public abstract void save(Estabelecimento e);
	
	public abstract Estabelecimento getById(Integer id);
	
	public abstract List<Estabelecimento> getAll();

}
