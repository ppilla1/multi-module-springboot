package net.bobokishu.graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.log4j.Log4j2;
import net.bobokishu.graphql.domain.BankAccount;
import net.bobokishu.graphql.domain.Currency;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log4j2
@Component
class BankAccountResolver implements GraphQLQueryResolver {

    BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id {}", id);

        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID())
                .name("Prashant")
                .currency(Currency.INR)
                .build();

        return bankAccount;
    }
}
