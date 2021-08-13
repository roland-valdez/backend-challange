package floatme.backendchallenge;

import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository){
        return args -> {
//            Person juan = new Person(
//            "Juan Valdez",
//            "27",
//            LocalDate.now()
//            );
//            repository.save(juan);
        };
    }
}
