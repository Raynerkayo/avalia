package br.ufc.quixada.avalia.repository;

import java.util.List;

import br.ufc.quixada.avalia.model.Contato;

public interface ContatoRepository {

	public abstract void save(Contato c);

	public abstract List<Contato> findAll();
	
}