package seminar3.ex3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seminar3.ex3.domain.User;

@Service
public class UserService {
    public User createUser(String name, int age, String email) {
            User user = new User();
            user.setName(name);
            user.setAge(age);
            user.setEmail(email);
            return user;
    }
}
