package cellar;

public class Cucumber extends Bank {
    public Cucumber (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
