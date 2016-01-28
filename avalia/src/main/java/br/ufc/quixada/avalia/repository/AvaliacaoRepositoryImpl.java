package br.ufc.quixada.avalia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufc.quixada.avalia.model.Avaliacao;

public class AvaliacaoRepositoryImpl implements AvaliacaoRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Avaliacao a) {
		if (a.getId() == null) {
			em.persist(a);
		} else {
			em.merge(a);
		}
	}

	@Override
	public Avaliacao getById(Integer id) {
		return em.find(Avaliacao.class, id);
	}

	@Override
	public List<Avaliacao> getAllAvaliacoesEstabelecimento(Integer id) {
		return null;
	}

}
