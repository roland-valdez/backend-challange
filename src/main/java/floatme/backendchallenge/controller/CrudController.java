package floatme.backendchallenge.controller;

import floatme.backendchallenge.model.Person;
import floatme.backendchallenge.repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class CrudController {
    private final PersonRepository persons;

    public CrudController(PersonRepository persons) {
        this.persons = persons;
    }

    @GetMapping("/")
    public String landing(Model model){
        LocalDate localDate = LocalDate.now();
        model.addAttribute("date", localDate);
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("person", new Person());
        return "add";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute Person person){
        LocalDate localDate = LocalDate.now();
        person.setDate_joined(localDate);
        persons.save(person);
        return "add";
    }

    @GetMapping("/get")
    public String get(){
        return "get";
    }

    @GetMapping("/update")
    public String update(){
        return "update";
    }

    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }

    @GetMapping("/all")
    public String all(){
        return "all";
    }

}
