package petya8bachey.abt;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public abstract void sayHello();

    public void doHandshake(){
        System.out.println("Handshake");
    }

    public void greet() {
        doHandshake();
        sayHello();
    }
}
