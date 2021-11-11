package az.alizeynalli.personalspace.todo.controller;


import az.alizeynalli.personalspace.todo.api.ToDoApi;
import az.alizeynalli.personalspace.todo.domain.service.ToDoService;
import az.alizeynalli.personalspace.todo.entity.ToDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToDoController implements ToDoApi {

    private static final Logger logger = LoggerFactory.getLogger(ToDoController.class);

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public List<ToDo> getToDos() {
        logger.info("Get /todos");
        return toDoService.getAll();
    }

    @Override
    public ToDo getToDo(long id) {
        logger.info("Get /todos/{}", id);
        return toDoService.get(id);
    }

    @Override
    public void postToDo(ToDo todo) {
        logger.info("Post /todos");
        toDoService.post(todo);
    }

    @Override
    public void putToDo(long id, ToDo todo) {
        logger.info("Put /todos/{}", id);
        toDoService.put(id, todo);
    }

    @Override
    public void deleteToDo(long id) {
        logger.info("Delete /todos/{}", id);
        toDoService.delete(id);
    }
}
