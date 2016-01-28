package br.ufc.quixada.avalia.service;

import java.util.List;

import javax.inject.Inject;

import br.ufc.quixada.avalia.model.Estabelecimento;
import br.ufc.quixada.avalia.repository.EstabelecimentoRepository;

public class EstabelecimentoServiceImpl implements EstabelecimentoService{
	
	@Inject
	private EstabelecimentoRepository estabelecimentoRepository;

	@Override
	public Estabelecimento getById(Integer id) {
		return estabelecimentoRepository.getById(id);
	}

	@Override
	public List<Estabelecimento> getAll() {
		return estabelecimentoRepository.getAll();
	}

}
