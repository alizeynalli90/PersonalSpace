package az.alizeynalli.personalspace.todo.api;

import az.alizeynalli.personalspace.todo.entity.ToDo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "ToDo API")
public interface ToDoApi {

    @GetMapping("/todos")
    public List<ToDo> getToDos();

    @GetMapping("/todos/{id}")
    public ToDo getToDo(@PathVariable("id") long id);

    @PostMapping("/todos")
    public void postToDo(ToDo todo);

    @PutMapping("/todos/{id}")
    public void putToDo(@PathVariable("id") long id, ToDo todo);

    @DeleteMapping("todos/{id}")
    public void deleteToDo(@PathVariable("id") long id);

}
