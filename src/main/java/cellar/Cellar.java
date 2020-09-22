package cellar;

import java.util.ArrayList;
import java.util.List;


public class Cellar {

    private final List<Bank> banks = new ArrayList<>();

    public void getBank(String name) {
        try {
            for (Bank bank : banks) {
                if (bank.name.equals(name)) {
                    System.out.println("Банкау " + bank.name + " взяли из погреба");
                    banks.remove(bank);
                }
            }
        }
        catch(RuntimeException ex){
            System.out.println("Погреб пуст");
        }
    }

    public void putBank(BankType type, String name) {
        switch (type) {
            case CUCUMBER:
                banks.add(new Cucumber(name));
                System.out.println("Банку " + name + " положили в погреб");
                break;
            case TOMATO:
                banks.add(new Tomato(name));
                System.out.println("Банку " + name + " положили в погреб");
                break;
            case SQUASH:
                banks.add(new Squash(name));
                System.out.println("Банку " + name + " положили в погреб");
                break;
            case MUSHROOM:
                banks.add(new Mushroom(name));
                System.out.println("Банку " + name + " положили в погреб");
                break;
            default:
                throw new RuntimeException("Неверный тип данных");
        }
    }

    @Override
    public String toString() {
            return banks.toString();
    }

 //public Bank bankAdd (BankType type, String name) {
 //    Bank Vegetable = new
 //    System.out.println("Банку " + name + " положили в погреб");
 //    return new
 //}
}
