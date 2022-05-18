package net.bobokishu.rest.service;

import net.bobokishu.rest.domain.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    User user(User filter);
}
