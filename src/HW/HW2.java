package HW;

public class HW2 {
    public static void main(String[] args){
        Integer value = 33;
        System.out.println("Вызов первоночального метода: " + value);
        changeValue(value);
        System.out.println("Вызов итогового метода: " + value);
    }
    public static void changeValue (Integer  value) {
        value = 22;
    }
}
