package net.bobokishu.graphql.domain;

import lombok.Builder;
import lombok.Data;


import java.util.UUID;

@Builder
@Data
public class BankAccount {
    private UUID id;
    private String name;
    private Currency currency;
}
