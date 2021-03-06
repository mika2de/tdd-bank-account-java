package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveBalanceOfZero() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }
}
