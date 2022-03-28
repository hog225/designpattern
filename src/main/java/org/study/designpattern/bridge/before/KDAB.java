package org.study.designpattern.bridge.before;

public class KDAB implements Champion{
    @Override
    public void move() {
        System.out.println("KDA B 이동 ");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA B Q ");
    }

    @Override
    public void skillW() {
        System.out.println("KDA B W ");
    }

    @Override
    public void skillE() {
        System.out.println("KDA B E ");
    }

    @Override
    public void skillR() {
        System.out.println("KDA B R ");
    }
}
