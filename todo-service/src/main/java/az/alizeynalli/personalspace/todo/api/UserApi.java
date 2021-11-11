package az.alizeynalli.personalspace.todo.api;

import az.alizeynalli.personalspace.todo.entity.ToDo;
import az.alizeynalli.personalspace.todo.entity.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "User API")
public interface UserApi {

    @GetMapping("/users")
    public List<User> getUsers();

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") long id);

    @PostMapping("/users")
    public void postUser(User user);

    @PutMapping("/users/{id}")
    public void putUser(@PathVariable("id") long id, User user);

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable("id") long id);

}
