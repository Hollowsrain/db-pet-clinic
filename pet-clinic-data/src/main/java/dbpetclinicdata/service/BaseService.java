package dbpetclinicdata.service;

import java.util.Set;

public interface BaseService<T, ID> {

    T findById(ID id);

    <S extends T> S save(S entity);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);

}
