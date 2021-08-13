package floatme.backendchallenge.controller;

import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class CrudController {
    private final PersonService personService;

    @Autowired
    public CrudController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping(path = "{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@PathVariable("personId") Long personId){
        return personService.findPerson(personId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person addPersons(@RequestBody Person person){
        person.setDate_updated(LocalDate.now());
        return personService.addPerson(person);
    }

    @DeleteMapping(path = "delete/{personId}")
    public void deletePerson(@PathVariable("personId") Long personId){
        personService.deletePerson(personId);
    }

    @PutMapping(path = "update/{personId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person updatePerson(@RequestBody Person person, @PathVariable("personId") Long personId){
        Person original  = personService.findPerson(personId);
        if(!(person.getName() == null)){
            original.setName(person.getName());
        }
        if(!(person.getAge() == null)) {
            original.setAge(person.getAge());
        }
        if(!(person.getDate_joined() == null)) {
            original.setDate_joined(person.getDate_joined());
        }
        original.setDate_updated(LocalDate.now());
        return personService.updatePerson(original);

    }

}
