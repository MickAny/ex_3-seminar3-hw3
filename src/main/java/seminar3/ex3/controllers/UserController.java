package seminar3.ex3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seminar3.ex3.domain.User;
import seminar3.ex3.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user){
        service.processRegistration(user);
        return "User (%s - %d - %s) has been created".formatted(user.getName(), user.getAge(), user.getEmail());
    }
}
