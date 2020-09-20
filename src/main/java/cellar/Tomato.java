package cellar;

public class Tomato extends Bank{
    public Tomato (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
