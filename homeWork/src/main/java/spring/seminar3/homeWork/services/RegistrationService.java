package spring.seminar3.homeWork.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.seminar3.homeWork.domain.User;

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

    public void processRegistration(String name, int age, String email){
        User user = userService.createUser(name, age, email);
        dataProcessingService.addUserToList(user);
        notificationService.sendNotification("Пользователь добавлен в репозиторий");
    }
}