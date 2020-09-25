package banks;

import cellar.Bank;

public class Cabbage extends Bank {
    public Cabbage (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
