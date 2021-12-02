package az.alizeynalli.personalspace.todo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue
    private Long person_id;
    private String name;

    @OneToMany(
            mappedBy = "person"
    )
    private List<ToDo> todos = new ArrayList<>();

    public Person() {
    }

    public void addToDo(ToDo todo){
        todos.add(todo);
    }

    public void removeToDo(ToDo todo){
        todos.remove(todo);
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return person_id;
    }

    public void setId(Long id) {
        this.person_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
