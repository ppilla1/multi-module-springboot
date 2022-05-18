package net.bobokishu.rest.service;

import net.bobokishu.rest.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
class StaticUserService implements UserService {

    @Override
    public List<User> allUsers() {
        return Arrays.asList(1, 2, 3)
                .stream()
                .map(id ->
                        User.builder()
                                .id(Integer.toString(id))
                                .age(20 + id)
                                .fullname("User"+id)
                                .build())
                .collect(Collectors.toList());
    }

    @Override
    public User user(User filter) {
        return User.builder()
                .id(filter.getId())
                .age(20 + Integer.parseInt(filter.getId()))
                .fullname("User"+filter.getId())
                .build();
    }
}
