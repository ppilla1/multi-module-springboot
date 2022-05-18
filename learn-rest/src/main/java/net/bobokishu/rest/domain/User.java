package net.bobokishu.rest.domain;

import lombok.*;

@Builder
@Data
public class User {
    private String id;
    private String fullname;
    private int age;
}
