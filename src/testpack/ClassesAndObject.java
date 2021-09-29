package testpack;

public class ClassesAndObject {
    public static void main(String[] args) {

        Person john = new Person();
        john.setName("John");
        john.setAge(25);
        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(20);

        System.out.println("John is "+ john.getAge() +" years old and Bob is "+ bob.getAge() +" years old.");
        john.sayHelloTo(bob);
        bob.sayHelloTo(john);
    }
}
