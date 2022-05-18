package net.bobokishu.graphql.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Address {
    private String houseNo;
    private String locality;
    private String street;
    private String location;
    private String city;
    private String state;
    private String pin;
    private String country;
}
