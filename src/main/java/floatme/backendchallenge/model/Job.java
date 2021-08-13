package floatme.backendchallenge.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="job")
public class Job {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = true, length = 100)
        private String job_title;

        @Column(nullable = true)
        private Float salary;

    public Job(){};

    public Job(Job copy) {
        id = copy.id;
        job_title = copy.job_title;
        salary = copy.salary;
    }

    public Job(long id, String job_title, Float salary) {
        this.id = id;
        this.job_title = job_title;
        this.salary = salary;
    }

    public Job(String job_title, Float salary) {
        this.job_title = job_title;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
