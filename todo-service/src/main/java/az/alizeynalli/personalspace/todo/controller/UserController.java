package az.alizeynalli.personalspace.todo.controller;

import az.alizeynalli.personalspace.todo.api.UserApi;
import az.alizeynalli.personalspace.todo.domain.service.UserService;
import az.alizeynalli.personalspace.todo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserController implements UserApi {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> getUsers() {
        logger.info("Get /users");
        return userService.getAll();
    }

    @Override
    public User getUser(long id) {
        logger.info("Get /users/{}", id);
        return userService.get(id);
    }

    @Override
    public void postUser(User user) {
        logger.info("Post /users");
        userService.post(user);
    }

    @Override
    public void putUser(long id, User user) {
        logger.info("Put /users/{}", id);
        userService.put(id, user);
    }

    @Override
    public void deleteUser(long id) {
        logger.info("Delete /users/{}", id);
        userService.delete(id);
    }
}
