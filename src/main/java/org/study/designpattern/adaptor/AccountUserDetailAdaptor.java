package org.study.designpattern.adaptor;

import org.study.designpattern.adaptor.security.UserDetails;

public class AccountUserDetailAdaptor implements UserDetails {
    private final Account account;
    AccountUserDetailAdaptor(Account account) {
        this.account = account;
    }
    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
