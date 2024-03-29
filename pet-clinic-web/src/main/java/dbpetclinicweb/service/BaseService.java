package dbpetclinicweb.service;

import java.util.Set;

public interface BaseService<T, ID> {

    T findById(ID id);

     T save(T entity);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);

}
