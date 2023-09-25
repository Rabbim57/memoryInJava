package Lesson;

public class Person {
    private String name;
    private int age;
    public Person child;
    public Person parent;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }
    public String getName(){
        return name;
    }

    public int getAge (){
        return this.age;
    }

    public void increaseAge(int increment) {

        if (increment < 0) {
            throw new IllegalStateException("Инкремент не может быть отрицательным");
        }
        this.age = age + increment;

    }
    public String toString (){
        return "Имя " + this.name + "Возраст " + this.age;
    }


    public void setAge(int i) {
    }
}
