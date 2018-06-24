package ru.avborg.students.da.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DaService<T> {

    private EntityManagerFactory entityManagerFactory;

    DaService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("ru.avborg.students");
    }


    public void save(T entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public T get(long id, Class<T> tClass) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(tClass, id);
    }

}
