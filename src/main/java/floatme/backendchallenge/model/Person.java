package floatme.backendchallenge.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="person")
public class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = true, length = 100)
        private String name;

        @Column(nullable = true, length = 3)
        private String age;

        @Column(nullable = true, length = 100)
        private LocalDate date_joined;

        @Column(length = 255)
        private LocalDate date_updated;

    public Person(){}

    public Person(Person copy){
        id = copy.id;
        name = copy.name;
        age = copy.age;
        date_joined = copy.date_joined;
        date_updated = copy.date_updated;
    }

    public Person(long id, String name, String age, LocalDate date_joined, LocalDate date_updated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date_joined = date_joined;
        this.date_updated = date_updated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(LocalDate date_joined) {
        this.date_joined = date_joined;
    }

    public LocalDate getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(LocalDate date_updated) {
        this.date_updated = date_updated;
    }
}
