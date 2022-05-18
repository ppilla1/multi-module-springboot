package net.bobokishu.rest.controller;

import lombok.extern.log4j.Log4j2;
import net.bobokishu.rest.domain.User;
import net.bobokishu.rest.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
class UserController {
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/v1")
    List<User> fetchAll(){
        return userService.allUsers();
    }

    @GetMapping("/v1/{id}")
    User fetchUserById(@PathVariable("id") String id) {
        User filter = User.builder()
                        .id(id)
                        .build();
        return userService.user(filter);
    }
}
