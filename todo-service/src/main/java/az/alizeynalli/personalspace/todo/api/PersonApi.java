package az.alizeynalli.personalspace.todo.api;

import az.alizeynalli.personalspace.todo.entity.Person;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Person API")
public interface PersonApi {

    @GetMapping("/persons")
    public List<Person> getPersons();

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id") long id);

    @PostMapping("/person")
    public void postPerson(Person user);

    @PutMapping("/person/{id}")
    public void putPerson(@PathVariable("id") long id, Person person);

    @DeleteMapping("person/{id}")
    public void deletePerson(@PathVariable("id") long id);

}
