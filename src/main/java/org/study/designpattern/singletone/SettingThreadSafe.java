package org.study.designpattern.singletone;

// 동기화 처리 때문에 성능에 악영향을 준다.
public class SettingThreadSafe {
    private static SettingThreadSafe singleToneSetting;
    //eager initialization 을 사용
    // 미리만든다는 자체가 단점
    //private static final SettingThreadSafe = new SettingThreadSafe();

    private SettingThreadSafe() {

    }

    // synchronized를 붙힌다.
    public static synchronized SettingThreadSafe getInstance() {
        if (singleToneSetting == null) {
            singleToneSetting = new SettingThreadSafe();
        }
        return singleToneSetting;
    }
}

