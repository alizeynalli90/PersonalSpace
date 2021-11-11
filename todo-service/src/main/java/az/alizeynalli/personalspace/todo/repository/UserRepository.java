package az.alizeynalli.personalspace.todo.repository;

import az.alizeynalli.personalspace.todo.entity.ToDo;
import az.alizeynalli.personalspace.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
