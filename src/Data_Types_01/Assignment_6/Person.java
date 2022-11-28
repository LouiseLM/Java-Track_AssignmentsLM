package Data_Types_01.Assignment_6;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String printIntroduction() {
        return "Hi, my name is %s and I'm %d years old.".formatted(name, age);
    }
}
