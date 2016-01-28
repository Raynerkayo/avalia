package br.ufc.quixada.avalia.repository;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufc.quixada.avalia.model.Coordenada;

@Named
public class CoordenadaRepositoryImpl implements CoordenadaRepository {

	@PersistenceContext
	EntityManager em;

	@Override
	public void save(Coordenada c) {
		if (c.getId() == null) {
			em.persist(c);
		} else {
			em.merge(c);
		}
	}

	@Override
	public Coordenada getById(Integer id) {
		return em.find(Coordenada.class, id);
	}

	@Override
	public List<Coordenada> getAll() {
		return em.createQuery("from Coordenada", Coordenada.class).getResultList();
	}

}
