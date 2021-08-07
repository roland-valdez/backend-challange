package floatme.backendchallange.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Crud {
    @GetMapping("/")
    public String landing(){
        return "index";
    }

    @GetMapping("/add")
    public String add(){
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
