package org.ammonium.example.api.service;

import java.util.Map;

/**
 * Simple CRUD service.
 *
 * @param <ID> the type of the ID of the entity
 * @param <T>  the type of the entity
 */
public interface Service<ID, T> {

    Map<ID, T> getCache();

    T get(ID id);

    void save(T t);

    void delete(ID id);

}
