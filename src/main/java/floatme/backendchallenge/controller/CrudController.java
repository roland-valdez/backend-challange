package floatme.backendchallenge.controller;

import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/person")
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
    public void addPersons(@RequestBody Person person){
        person.setDate_updated(LocalDate.now());
        personService.addPerson(person);
    }

    @DeleteMapping(path = "delete/{personId}")
    public void deletePerson(@PathVariable("personId") Long personId){
        personService.deletePerson(personId);
    }

    @PutMapping(path = "update/{personId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePerson(@RequestBody Person person, @PathVariable("personId") Long personId){
        Person original  = personService.findPerson(personId);
        original.setName(person.getName());
        original.setAge(person.getAge());
        original.setDate_updated(LocalDate.now());
//        System.out.println("hello");
        System.out.println(original);
//        System.out.println(update);
        personService.updatePerson(original);

    }

}
