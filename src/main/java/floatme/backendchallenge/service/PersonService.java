package floatme.backendchallenge.service;

import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public void addPerson (Person person){
        personRepository.save(person);
    }

    public Person findPerson(Long personId){
        return personRepository.getById(personId);
    }

    public void deletePerson(Long personId){
        personRepository.deleteById(personId);
    }

    public Person updatePerson(Person update){
        return personRepository.save(update);
    }
}
