package HW;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
       Integer[] value = new Integer [] {3, 4};
        System.out.println("Вызов первоночального метода: " + Arrays.toString(value));
        changeValue(value);
        System.out.println("Вызов итогового метода: " + Arrays.toString(value));
    }

    public static void changeValue (Integer[] value) {
        value = new Integer[]{1, 2};

    }
}
