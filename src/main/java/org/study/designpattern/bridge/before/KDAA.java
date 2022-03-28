package org.study.designpattern.bridge.before;

// KDA 스킨을 가지고 있는 A
public class KDAA implements Champion{
    // 스킨에 맞는 복장을 가지고 움직임 그리고 스킬을 사용함
    @Override
    public void move() {
        System.out.println("KDA A 이동 ");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA A Q ");
    }

    @Override
    public void skillW() {
        System.out.println("KDA A W ");
    }

    @Override
    public void skillE() {
        System.out.println("KDA A E ");
    }

    @Override
    public void skillR() {
        System.out.println("KDA A R ");
    }
}
