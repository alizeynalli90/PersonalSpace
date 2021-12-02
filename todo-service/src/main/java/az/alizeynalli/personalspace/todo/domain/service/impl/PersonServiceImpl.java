package az.alizeynalli.personalspace.todo.domain.service.impl;

import az.alizeynalli.personalspace.todo.domain.service.PersonService;
import az.alizeynalli.personalspace.todo.entity.Person;
import az.alizeynalli.personalspace.todo.repository.PersonRepository;
import az.alizeynalli.personalspace.todo.shared.exception.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person get(long id) {
        Person result =  personRepository.findById(id).orElse(null);
        if(result == null){
            throw new NotFoundException("person not found");
        }
        return result;
    }

    @Override
    public void post(Person person) {
        personRepository.save(person);
    }

    @Override
    public void put(long id, Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(long id) {
        personRepository.deleteById(id);
    }
}
