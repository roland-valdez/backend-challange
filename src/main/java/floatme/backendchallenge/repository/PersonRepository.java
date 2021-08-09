package floatme.backendchallenge.repository;

import floatme.backendchallenge.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
