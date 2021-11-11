package az.alizeynalli.personalspace.todo.domain.service.impl;

import az.alizeynalli.personalspace.todo.domain.service.ToDoService;
import az.alizeynalli.personalspace.todo.entity.ToDo;
import az.alizeynalli.personalspace.todo.repository.ToDoRepository;
import az.alizeynalli.personalspace.todo.shared.exception.NotFoundException;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDo> getAll() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo get(long id) {
        ToDo result =  toDoRepository.findById(id).orElse(null);
        if(result == null){
            throw new NotFoundException("todo not found...");
        }
        return result;
    }

    @Override
    public void post(ToDo todo) {
        toDoRepository.save(todo);
    }

    @Override
    public void put(long id, ToDo todo) {
        toDoRepository.save(todo);
    }

    @Override
    public void delete(long id) {
        toDoRepository.deleteById(id);
    }
}
