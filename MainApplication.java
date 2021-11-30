package lab_1;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int CheeseAm = 0, AppleAm = 0,CakeAm = 0;
        Apple Ap = new Apple(null);
        Cheese Ch = new Cheese();
        Cake Ca = new Cake(null);
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            else
            if (parts[0].equals("Cake")) {
                breakfast[itemsSoFar] = new Cake(parts[1]);
            }
            itemsSoFar++;
        }
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(Ch)) {
                    CheeseAm++;
                } else if (breakfast[i].equals(Ap)) {
                    AppleAm++;
                } else if (breakfast[i].equals(Ca)) {
                    CakeAm++;
                }
            } else break;
        }
        System.out.println("Amount of apples is " + AppleAm + ", Amount of cheese is " + CheeseAm + ", Amount of cake is " + CakeAm + "");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
        System.out.println("Good luck!");
    }
    }

