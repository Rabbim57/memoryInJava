package HW;

import java.util.Arrays;

public class HW5 {
        public static void main(String[] args) {
            Personhw5 personhw5 = new Personhw5("Lyapis", "Trubetskoy");
        System.out.println("Вызов первоночального метода: " + personhw5 );
        changePerson(personhw5);
        System.out.println("Вызов итогового метода: " + personhw5);
    }

        public static void changePerson (Personhw5 personhw5) {
            personhw5 = new Personhw5("Ilya", "Ilagutenko");
    }
}

