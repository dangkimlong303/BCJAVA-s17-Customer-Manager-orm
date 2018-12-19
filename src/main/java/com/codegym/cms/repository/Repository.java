package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

import java.util.List;

public interface Repository<T> {
    List<Customer> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
