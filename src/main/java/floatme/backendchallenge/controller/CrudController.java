package floatme.backendchallenge.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
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
        System.out.println(personService.getAllPersons());
        return personService.getAllPersons();
    }

    @GetMapping(path = "{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@PathVariable("personId") Long personId){
        System.out.println(personService.findPerson(personId));
        return personService.findPerson(personId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPersons(@RequestBody Person person){
        personService.addPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Long personId){
        personService.deletePerson(personId);
    }

    @PutMapping(path = "{personId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePerson(@PathVariable("personId") Long personId){
        personService.updatePerson(personId);
    }

}
