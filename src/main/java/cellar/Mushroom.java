package cellar;

public class Mushroom extends Bank {
    public Mushroom (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
