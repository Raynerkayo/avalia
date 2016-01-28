package br.ufc.quixada.avalia.service;

import java.util.List;

import javax.inject.Inject;

import br.ufc.quixada.avalia.model.Avaliacao;
import br.ufc.quixada.avalia.repository.AvaliacaoRepository;

public class AvaliacaoServiceImpl implements AvaliacaoService{

	@Inject
	private AvaliacaoRepository avaliacaoRepository;
	
	@Override
	public Avaliacao getById(Integer id) {
		return avaliacaoRepository.getById(id);
	}

	@Override
	public List<Avaliacao> getAllAvaliacoesEstabelecimento(Integer id) {
		return avaliacaoRepository.getAllAvaliacoesEstabelecimento(id);
	}

}
