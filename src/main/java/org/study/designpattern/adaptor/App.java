package org.study.designpattern.adaptor;

import org.study.designpattern.adaptor.security.LoginHandler;
import org.study.designpattern.adaptor.security.UserDetailsService;

import java.util.*;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService =
                new AccountUserDetailAdaptorService(accountService);
        LoginHandler handler = new LoginHandler(userDetailsService);
        String login = handler.login("password", "password");
        System.out.println(login);
/**
 * 실사용에서 어답터 패턴
 */
        List<String> arr = Arrays.asList("ee", "tt");
        // arr adaptee, Collections.enumerations : adaptor, target : target
        Enumeration<String> target = Collections.enumeration(arr);
    }
}
