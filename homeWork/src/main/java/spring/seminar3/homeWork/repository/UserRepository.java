package spring.seminar3.homeWork.repository;

import org.springframework.stereotype.Component;
import spring.seminar3.homeWork.domain.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users = new ArrayList<>();

}