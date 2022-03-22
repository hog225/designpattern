package org.study.designpattern.adaptor;

// adaptee
/**
 * account 와  userdetail 을 어떨게 연결 할 것인가. ??
 * Account 를 수정할 수 있다면 UserDetails 를 직접 구현 할 수 있다.
 */
public class Account {
    private String name;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
