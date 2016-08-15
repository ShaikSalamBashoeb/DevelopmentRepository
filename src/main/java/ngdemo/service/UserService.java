package ngdemo.service;

import ngdemo.domain.User;

public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST3345");
        user.setLastName("DoeFromREST11");
        return user;
    }
}
