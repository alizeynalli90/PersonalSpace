package az.alizeynalli.personalspace.todo.domain.service;

import java.util.List;

public interface DomainService<T> {
    List<T> getAll();
    T get(long id);
    void post(T t);
    void put(long id, T t);
    void delete(long id);
}
