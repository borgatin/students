package ru.avborg.students.da.service;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Service
public class HibernateUtils {

    private EntityManagerFactory entityManagerFactory;

    public HibernateUtils() {
        entityManagerFactory = Persistence.createEntityManagerFactory("ru.avborg.students");
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
