package org.study.designpattern.singletone;

//double checked locking
public class SettingDoubleCheckedLocking {
    // volatile 키워드 사용해야 정상 동작 java 1.5 이후만 동작
    private static volatile SettingDoubleCheckedLocking singleToneSetting;
    private SettingDoubleCheckedLocking() {

    }

    public static SettingDoubleCheckedLocking getInstance() {
        if(singleToneSetting == null) {
            synchronized (SettingDoubleCheckedLocking.class) {
                if(singleToneSetting == null) {
                    singleToneSetting = new SettingDoubleCheckedLocking();
                }
            }
        }
        return singleToneSetting;
    }
}

