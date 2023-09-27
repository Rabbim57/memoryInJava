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
    public void setAge(int age) {
        this.age = age;
    }

}
