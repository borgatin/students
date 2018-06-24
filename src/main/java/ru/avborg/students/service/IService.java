package ru.avborg.students.service;

import java.util.List;

public interface IService<M> {

    void save(M model);

    M get(long id);

    List<M> getAll();

    void delete(long id);

}
