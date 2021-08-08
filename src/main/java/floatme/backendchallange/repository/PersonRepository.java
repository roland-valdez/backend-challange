package floatme.backendchallange.repository;

import floatme.backendchallange.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
