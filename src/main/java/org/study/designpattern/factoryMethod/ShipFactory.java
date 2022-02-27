package org.study.designpattern.factoryMethod;

public interface ShipFactory {

    default Ship orderShip(String email, String name) {
        validate(email, name);
        prepare(name);
        Ship ship =  createShip(email, name);
        sendEmail(email);
        return ship;
    }

    Ship createShip(String email, String name);

    private void validate(String email, String name) {
        if(email.isBlank())
            throw new IllegalArgumentException("email is not valid");
        if (name.isBlank())
            throw new IllegalArgumentException("name is not valid ");
    }

    private void prepare(String name) {
        System.out.println(name + " 배가 준비중입니다. ");
    }

    private void sendEmail(String email) {
        System.out.println(email + " 님 건조 완료 되었습니다.");
    }

}
