package org.example.java8quesrevision;

import java.util.Optional;

class Account {
    double balance;
    Account(double balance) {
        this.balance = balance;
    }
    double getBalance() {
        return balance;
    }
}

class User {
    Optional<Account> account;
    User(Optional<Account> account) {
        this.account = account;
    }
    Optional<Account> getAccount() {
        return account;
    }
}
