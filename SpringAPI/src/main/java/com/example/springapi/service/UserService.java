package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ida", 32, "ida@gmail.com");
        User user2 = new User(2, "Hans", 36, "hans@gmail.com");

        userList.addAll(Arrays.asList(user1,user2));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if (id == user.getID()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
