package testpack;

public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        Person anu = new Person();
        anu.setName("Anuapm");
        anu.setAge(22);
        celebrateBirthday(anu);
        System.out.println(anu.getName() +"'s age after recent birthday has become "+ anu.getAge());

    }

    private static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}
