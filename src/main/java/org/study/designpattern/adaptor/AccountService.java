package org.study.designpattern.adaptor;

/**
 * AccountService 를 수정할 수 있다면 UserDetailsService 를 직접 구현한다.
 * 클래스를 나누는게 srp에 더욱 걸맞다. 그러나 유도리 있게 할 필요도 있다.
 */
public class AccountService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public Account updateAccount() {
        return null;
    }

    public Account deleteAccount() {
        return  null;
    }
}
