package lab_1;

public class Cake extends Food{
    private String icing = null;

    public Cake(String icing){
        super("Cake");
        this.icing = icing;
    }

    public void consume(){
        System.out.println(this + "ate!");
    }

    public  String getIcing(){
        return icing;
    }

    public void getIcing(String icing){
        this.icing =  icing;
    }
    public String toString(){
        return super.toString() + " with '" + icing.toUpperCase()+ "' icing ";
    }
}
