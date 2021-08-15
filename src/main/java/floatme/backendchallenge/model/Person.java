package floatme.backendchallenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="person")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Person {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
//        @GeneratedValue(generator = "sequence-generator")
//        @GenericGenerator(
//                name = "sequence-generator",
//                strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//                parameters = {
//                        @Parameter(name = "sequence_name", value = "user_sequence"),
//                        @Parameter(name = "initial_value", value = "4"),
//                        @Parameter(name = "increment_size", value = "1")
//                }
//        )

//        @SequenceGenerator(
//                name = "person_sequence",
//                sequenceName = "person_sequence",
//                allocationSize = 1
//        )
//        @GeneratedValue(
//                strategy = GenerationType.SEQUENCE,
//                generator = "student_sequence"
//        )

//        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private long id;

        @Column(nullable = true, length = 100)
        private String name;

        @Column(nullable = true)
        private Integer age;

        @Column(nullable = true, length = 100)
        private LocalDate date_joined;

        @Column(length = 255)
        private LocalDate date_updated;

    public Person(){}

//    public Person(Person copy){
//        id = copy.id;
//        name = copy.name;
//        age = copy.age;
//        date_joined = copy.date_joined;
//        date_updated = copy.date_updated;
//    }

    public Person(long id, String name, Integer age, LocalDate date_joined, LocalDate date_updated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date_joined = date_joined;
        this.date_updated = date_updated;
    }

    public Person(String name, Integer age, LocalDate date_joined) {
        this.name = name;
        this.age = age;
        this.date_joined = date_joined;
    }

    public Person(String name, Integer age, LocalDate date_joined, LocalDate date_updated) {
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

    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", date_joined=" + date_joined +
                ", date_updated=" + date_updated +
                '}';
    }
}
