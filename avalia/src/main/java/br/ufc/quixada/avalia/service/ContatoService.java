package br.ufc.quixada.avalia.service;

import java.util.List;

import br.ufc.quixada.avalia.model.Contato;

public interface ContatoService {

	public abstract void insere();

	public abstract List<Contato> findAll();

}