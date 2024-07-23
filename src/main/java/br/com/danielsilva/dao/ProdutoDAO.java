package br.com.danielsilva.dao;

import br.com.danielsilva.domain.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProdutoDAO implements IProdutoDAO {


    @Override
    public Produto cadastrar(Produto produto) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("WEB");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }
}
