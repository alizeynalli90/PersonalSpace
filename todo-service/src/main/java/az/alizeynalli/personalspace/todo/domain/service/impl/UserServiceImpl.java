package az.alizeynalli.personalspace.todo.domain.service.impl;

import az.alizeynalli.personalspace.todo.domain.service.ToDoService;
import az.alizeynalli.personalspace.todo.domain.service.UserService;
import az.alizeynalli.personalspace.todo.entity.ToDo;
import az.alizeynalli.personalspace.todo.entity.User;
import az.alizeynalli.personalspace.todo.repository.ToDoRepository;
import az.alizeynalli.personalspace.todo.repository.UserRepository;
import az.alizeynalli.personalspace.todo.shared.exception.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(long id) {
        User result =  userRepository.findById(id).orElse(null);
        if(result == null){
            throw new NotFoundException("user not found");
        }
        return result;
    }

    @Override
    public void post(User user) {
        userRepository.save(user);
    }

    @Override
    public void put(long id, User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
