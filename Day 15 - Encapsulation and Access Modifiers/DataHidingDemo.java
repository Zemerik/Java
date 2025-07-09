public class DataHidingDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setAge(-5); // Invalid age
    }
}

class Person {
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
        } else {
            System.out.println("Invalid age: " + age);
        }
    }
} 