package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")

    public String Hello(){
        return "Hello, world";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Name: " + name;
    }
}
