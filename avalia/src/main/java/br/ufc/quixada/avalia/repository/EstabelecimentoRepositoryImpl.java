package br.ufc.quixada.avalia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufc.quixada.avalia.model.Estabelecimento;

public class EstabelecimentoRepositoryImpl implements EstabelecimentoRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Estabelecimento e) {
		if (e.getId() == null) {
			em.persist(e);
		} else {
			em.merge(e);
		}
	}

	@Override
	public List<Estabelecimento> getAll() {
		return em.createQuery("from Estabelecimento", Estabelecimento.class).getResultList();
	}

	@Override
	public Estabelecimento getById(Integer id) {
		return em.find(Estabelecimento.class, id);
	}

}
