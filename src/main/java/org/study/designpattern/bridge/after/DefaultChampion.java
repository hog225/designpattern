package org.study.designpattern.bridge.after;

//Abstraction
public class DefaultChampion implements Champion {
    private Skin skin;
    private String chmpionName;

    DefaultChampion (Skin skin, String chmpionName) {
        this.skin = skin;
        this.chmpionName = chmpionName;
    }


    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getSkinName(), chmpionName );
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s SkillQ\n", skin.getSkinName(), chmpionName );
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s SkillW\n", skin.getSkinName(), chmpionName );
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s SkillE\n", skin.getSkinName(), chmpionName );
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s SkillR\n", skin.getSkinName(), chmpionName );
    }
}
