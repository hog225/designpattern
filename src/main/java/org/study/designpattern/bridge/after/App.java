package org.study.designpattern.bridge.after;

import org.study.designpattern.bridge.before.KDAA;

public class App {
    public static void main(String[] args) {
        Champion champA = new ChampionA(new KDASkin());
        champA.skillE();
    }
}
