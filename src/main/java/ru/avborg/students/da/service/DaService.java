package ru.avborg.students.da.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class DaService<T extends Serializable> {

    private HibernateUtils hibernateUtils;

    @Autowired
    public void setHibernateUtils(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    public void save(T entity) {
        EntityManager entityManager = hibernateUtils.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public T get(long id, Class<T> tClass) {
        EntityManager entityManager = hibernateUtils.getEntityManager();
        return entityManager.find(tClass, id);
    }

}
