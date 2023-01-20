package petya8bachey.imp;

public class Mersedes implements Car{
    String mark;
    String model;
    public Mersedes(String model) {
        mark = "Mersedes";
        this.model = model;
    }
    @Override
    public void beep() {
        System.out.println("beep-beep");
    }
    @Override
    public void drive() {
        System.out.println("You are drived your Mers");
    }
    @Override
    public String getMark() {
        return mark;
    }
}
