package org.study.designpattern.adaptor;

import org.study.designpattern.adaptor.security.UserDetails;
import org.study.designpattern.adaptor.security.UserDetailsService;

public class AccountUserDetailAdaptorService implements UserDetailsService {

    private final AccountService accountService;
    AccountUserDetailAdaptorService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = this.accountService.findAccountByUsername(username);
        UserDetails userDetails = new AccountUserDetailAdaptor(account);
        return userDetails;
    }
}
