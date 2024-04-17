package seminar3.ex3.services;

import org.springframework.stereotype.Service;
import seminar3.ex3.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
}
