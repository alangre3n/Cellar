package cellar.banks;

import cellar.Bank;

public class Radish extends Bank {
    public Radish (String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
