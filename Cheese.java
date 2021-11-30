package lab_1;

public class Cheese extends Food{
    private String size;
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " ate!");
    }
}
