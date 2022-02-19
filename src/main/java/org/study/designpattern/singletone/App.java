package org.study.designpattern.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("hello");
        Setting s1 = Setting.getInstance();
        Setting s2 = Setting.getInstance();
        System.out.println(s1 != s2);

//        SettingDoubleCheckedLocking s3 = SettingDoubleCheckedLocking.getInstance();
//        SettingDoubleCheckedLocking s4 = SettingDoubleCheckedLocking.getInstance();
//        System.out.println(s3 != s4);

        SettingsHolder s3 = SettingsHolder.getInstance();
        SettingsHolder s4 = SettingsHolder.getInstance();

        // singletone 을 깨트리는 방법
        // 1. reflaction 사용
        Constructor<SettingsHolder> constructor = SettingsHolder.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsHolder setting1 = constructor.newInstance();

        // 2. 직렬화 역직렬화 사용
        // 역직렬화의 경우는 readResolve 를 오버라이딩 하면 된다. protect readResolve
        //




        System.out.println(s3 != setting1);

    }
}
