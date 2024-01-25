package org.ammonium.example;

import org.ammonium.example.api.model.User;
import org.ammonium.example.api.service.user.UserService;

public final class Application {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.save(new User("johndoe", "john@example.com"));
        userService.save(new User("janedoe", "jane@example.com"));
        userService.save(new User("stevemc", "stevemc@example.com"));

        System.out.println("All users:");
        userService.getCache().values().forEach(System.out::println);
    }

}
