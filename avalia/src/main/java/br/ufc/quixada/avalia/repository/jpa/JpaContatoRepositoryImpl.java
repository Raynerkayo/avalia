package br.ufc.quixada.avalia.repository.jpa;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufc.quixada.avalia.model.Contato;
import br.ufc.quixada.avalia.repository.ContatoRepository;

@Named
public class JpaContatoRepositoryImpl implements ContatoRepository {

	@PersistenceContext
	private EntityManager em;

	public void save(Contato c) {
		if (c.getId() == null) {
			em.persist(c);
		} else {
			em.merge(c);
		}
	}

	public List<Contato> findAll() {
		return em.createQuery("from Contato", Contato.class).getResultList();
	}

}
