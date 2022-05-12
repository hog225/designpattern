package org.study.designpattern.flyweight.after;

public class Client {
    /**
     * 컬러 자주 바뀌겠지 ?
     * 폰트 패밀리, 폰트 사이즈 --> 잘 변하지 않는 속성 이라고 치자
     * @param args
     */
    public static void main(String[] args) {
        FontFactory factory = new FontFactory();
        Character c1 = new Character('h', "white", factory.getFont("Nanum:12"));
        Character c2 = new Character('e', "white", factory.getFont("Nanum:12"));

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getFont() == c2.getFont());

    }
}
