package by.ita.hw.controller;

import by.ita.hw.dto.PersonDto;
import by.ita.hw.service.SimpleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final SimpleService simpleService;

    public Controller(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("read")
    public PersonDto read () {
        return simpleService.read();
    }
    @GetMapping("change")
    public PersonDto change(@RequestParam String name){
        PersonDto personDtoChange = simpleService.read();
        personDtoChange.setName(name);
        return simpleService.responce(personDtoChange);
    }
    @GetMapping("replace")
    public PersonDto replaceNameWithStatus (){
        PersonDto p = simpleService.read();
        String temp = p.getName();
        p.setName(p.getStatus());
        p.setStatus(temp);
        return simpleService.responce(p);
    }
}
