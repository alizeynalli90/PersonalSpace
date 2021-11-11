package az.alizeynalli.personalspace.todo.repository;

import az.alizeynalli.personalspace.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
