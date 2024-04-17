package seminar3.ex3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seminar3.ex3.domain.User;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void processRegistration(User user){
        User newUser = userService.createUser(user.getName(), user.getAge(), user.getEmail());
        dataProcessingService.addUserToList(newUser);
        notificationService.notifyUser(user);
    }



}
