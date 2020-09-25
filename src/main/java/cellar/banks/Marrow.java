package cellar.banks;

import cellar.Bank;

public class Marrow extends Bank {
    public Marrow(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Банка "
                + name;
    }
}
