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

    @GetMapping("/todo/{id}")
    public ToDo getToDo(@PathVariable("id") long id);

    @PostMapping("/todo")
    public void postToDo(ToDo todo);

    @PutMapping("/todo/{id}")
    public void putToDo(@PathVariable("id") long id, ToDo todo);

    @DeleteMapping("todo/{id}")
    public void  deleteToDo(@PathVariable("id") long id);

}
