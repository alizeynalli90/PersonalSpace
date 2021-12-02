package az.alizeynalli.personalspace.todo.entity;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class ToDo {

    @Id
    @GeneratedValue
    private long todo_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    private String description;
    private Integer week;

    public ToDo() {
    }

    public ToDo(String description, Integer week) {
        this.description = description;
        this.week = week;
    }

    public long getId() {
        return todo_id;
    }

    public void setId(long id) {
        this.todo_id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
}
