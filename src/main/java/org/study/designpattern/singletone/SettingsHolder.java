package org.study.designpattern.singletone;

// 가장 권장되는 방법
public class SettingsHolder {

    private SettingsHolder() {

    }

    private static class holder {
        private static final SettingsHolder INSTANCE = new SettingsHolder();
    }

    public static SettingsHolder getInstance() {
        return holder.INSTANCE;
    }



}
