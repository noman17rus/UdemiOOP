package homeWork;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Alex";
//        person1.age = 25;
//
//
//        Person person2 = new Person();
//        person2.name = "Max";
//        person2.age = 22;
//
//        Person person3 = new Person();
//        person3.name = "John";
//        person3.age = 41;
//
//        double averageAge = (person1.age + person2.age + person3.age)/3;
//        System.out.println(averageAge);
//    }
}
