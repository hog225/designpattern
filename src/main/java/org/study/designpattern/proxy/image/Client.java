package org.study.designpattern.proxy.image;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 이미지 파일을 처음 로딩할 때
        image.display();
        System.out.println("------");

        // 이미지 파일을 다시 로딩하지 않고 보여줄 때
        image.display();
    }
}
