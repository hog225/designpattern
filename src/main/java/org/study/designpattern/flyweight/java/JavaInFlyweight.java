package org.study.designpattern.flyweight.java;

public class JavaInFlyweight {

    /**
     * 자주 사용하는 10 은 캐싱하고 있어서 인스턴스가 같다.
     * 그런데 10000 는 서로다른 객체이다.
     * @param args
     */
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2 );

        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);
        System.out.println(i3 == i4 );
    }
}
