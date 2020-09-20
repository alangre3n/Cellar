package cellar;

public class Squash extends Bank {
    public Squash (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
