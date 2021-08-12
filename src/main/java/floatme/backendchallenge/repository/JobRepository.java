package floatme.backendchallenge.repository;

import floatme.backendchallenge.model.Job;
import floatme.backendchallenge.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
