package com.codegym.cms.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findByName(String T);
    void save(T model);

    void remove(String model);
}
