package br.com.datarich.investordata.services;

import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 14:49
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
