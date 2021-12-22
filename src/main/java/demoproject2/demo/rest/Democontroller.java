package demoproject2.demo.rest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class Democontroller {

    @GetMapping(value="get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get() {
        return "hello world";
    }
}


