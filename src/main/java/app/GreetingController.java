package app;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Petro Karabyn
 * on 22-Jan-18
 */

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping
    public Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
