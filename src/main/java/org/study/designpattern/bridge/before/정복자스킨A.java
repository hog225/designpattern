package org.study.designpattern.bridge.before;

// 정복자 스킨이 추가되면 A, B 캐릭터에 대한 클래스가 추가로 생성 되어야 한다.
public class 정복자스킨A implements Champion {

    @Override
    public void move() {
        System.out.println("정복자 아리 무브 ");
    }

    @Override
    public void skillQ() {

    }

    @Override
    public void skillW() {

    }

    @Override
    public void skillE() {

    }

    @Override
    public void skillR() {

    }
}
