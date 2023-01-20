package petya8bachey.imp;

public class KIA implements Car{
    String mark;
    String model;
    public KIA(String model) {
        mark = "KIA";
        this.model = model;
    }

    @Override
    public void beep() {
        System.out.println("bep-bop-byp");
    }
    @Override
    public void drive() {
        System.out.println("You are drived your KIA");
    }
    @Override
    public String getMark() {
        return mark;
    }
}
