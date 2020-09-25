package cellar.banks;

import cellar.Bank;

public class Garlic extends Bank {
    public Garlic(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
