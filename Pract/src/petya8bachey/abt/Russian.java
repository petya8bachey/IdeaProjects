package petya8bachey.abt;

public class Russian extends Person{
    public Russian(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("Привет Я " + name);
    }
}
