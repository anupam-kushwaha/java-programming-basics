package testpack;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("testpack.Person created...");
    }

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
        this.age = age;
    }

    public void sayHelloTo(Person p) {
        System.out.println(this.getName() +" say hello to "+ p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
