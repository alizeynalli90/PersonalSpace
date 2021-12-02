package az.alizeynalli.personalspace.todo.controller;

import az.alizeynalli.personalspace.todo.api.PersonApi;
import az.alizeynalli.personalspace.todo.domain.service.PersonService;
import az.alizeynalli.personalspace.todo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonController implements PersonApi {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public List<Person> getPersons() {
        logger.info("Get /persons");
        return personService.getAll();
    }

    @Override
    public Person getPerson(long id) {
        logger.info("Get /person/{}", id);
        return personService.get(id);
    }

    @Override
    public void postPerson(Person person) {
        logger.info("Post /users");
        personService.post(person);
    }

    @Override
    public void putPerson(long id, Person person) {
        logger.info("Put /person/{}", id);
        personService.put(id, person);
    }

    @Override
    public void deletePerson(long id) {
        logger.info("Delete /person/{}", id);
        personService.delete(id);
    }
}
