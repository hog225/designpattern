package org.study.designpattern.adaptor.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
