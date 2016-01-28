package br.ufc.quixada.avalia.service;

import javax.inject.Inject;
import javax.inject.Named;

import br.ufc.quixada.avalia.model.Avaliacao;
import br.ufc.quixada.avalia.repository.AvaliacaoRepository;

@Named
public class AvaliacaoServiceImpl implements AvaliacaoService{

	@Inject
	private AvaliacaoRepository avaliacaoRepository;
	
	@Override
	public Avaliacao getById(Integer id) {
		return avaliacaoRepository.getById(id);
	}
}
