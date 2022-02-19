package org.study.designpattern.singletone;

// Basic Singletone
// thread safe 하지 않다.
public class Setting {

    private static Setting singleToneSetting;
    private Setting() {

    }

    public static Setting getInstance() {
        if (singleToneSetting == null) {
            singleToneSetting = new Setting();
        }
        return singleToneSetting;
    }
}


