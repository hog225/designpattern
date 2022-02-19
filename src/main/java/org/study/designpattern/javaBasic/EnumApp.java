package org.study.designpattern.javaBasic;

enum Direction {
    EAST(1, "east") {
        String getValueAndStr(int value) {
            return str + value;
        }
    },
    SOUTH(2, "south") {
        String getValueAndStr(int value) {
            return str + value + "할증";
        }
    };

    private final int value;
    // protected 로 해야 각 상수에서 접근 가능
    protected final String str;

    Direction(int value, String str) {
        this.value = value;
        this.str = str;
    }

    public int getValue() {
        return value;
    }

    public String getStr() {
        return str;
    }

    abstract String getValueAndStr(int value);
}
public class EnumApp {

    public static void main(String[] args) {

        System.out.println(Direction.EAST.getValue());
        System.out.println(Direction.SOUTH.getStr());
        System.out.println(Direction.SOUTH.getValueAndStr(2));

    }
}
