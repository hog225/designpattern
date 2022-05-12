package org.study.designpattern.flyweight.before;

public class Client {
    /**
     * 컬러 자주 바뀌겠지 ?
     * 폰트 패밀리, 폰트 사이즈 --> 잘 변하지 않는 속성 이라고 치자
     * @param args
     */
    public static void main(String[] args) {
        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
