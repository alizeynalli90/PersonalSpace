package az.alizeynalli.personalspace.todo.repository;

import az.alizeynalli.personalspace.todo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
