package HW;

public class HW1 {
    public static void main(String[] args) {
        int value = 33;
        System.out.println("Вызов первоночального метода: " + value);
        changeValue(value);
        System.out.println("Вызов итогового метода: " + value);
    }

    public static void changeValue (int value) {
        value = 22;

    }
}
