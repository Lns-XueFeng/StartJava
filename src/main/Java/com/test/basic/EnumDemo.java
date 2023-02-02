package main.Java.com.test.basic;

/**
 * Create by xuefeng on 2022.2.2
 * 枚举类：枚举类常用于switch语句中
 */

public class EnumDemo {
    public static void main(String... args) {
        Color yourHatColor = Color.GREEN;

        switch (yourHatColor) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("无色");
                break;
        }
    }
}

enum Color {
    RED, GREEN, BLUE;
}
