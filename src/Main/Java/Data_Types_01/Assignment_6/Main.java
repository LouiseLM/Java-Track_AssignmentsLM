package Main.Java.Data_Types_01.Assignment_6;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pudding", 3);
        Person person1 = new Person("Athena", 25);
        Person person2 = new Person("Fera", 5);

        System.out.println(person.printIntroduction()); // "Hi, my name is Pudding and I'm 3 years old."
        System.out.println(person1.printIntroduction()); // "Hi, my name is Athena and I'm 25 years old."
        System.out.println(person2.printIntroduction()); // "Hi, my name is Fera and I'm 5 years old."
    }
}
