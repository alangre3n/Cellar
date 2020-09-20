package cellar;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class Cellar {

    private final List<Bank> banks = new ArrayList<>();

    public void getBank(String name) {
        try {
            for (int i = 0; i < banks.size(); i++) {
                if (banks.get(i).name.equals(name)) {
                    System.out.println("Банка " + banks.get(i).name + " взята из погреба");
                    banks.remove(i);
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
                System.out.println("Банку соленых огурцов" + name + " положили в погреб");
                break;
            case TOMATO:
                banks.add(new Tomato(name));
                System.out.println("Банку соленых помидоров " + name + " положили в погреб");
                break;
            case SQUASH:
                banks.add(new Squash(name));
                System.out.println("Банку соленой тыквы " + name + " положили в погреб");
                break;
            case MUSHROOM:
                banks.add(new Mushroom(name));
                System.out.println("Банку соленых грибов " + name + " положили в погреб");
                break;
            default:
                throw new RuntimeException("Wrong type");
        }
    }

    @Override
    public String toString() {
        if(banks.equals(0)) {
            String s="Погреб пуст";
            return s;
        }
        else {
            return banks.toString();
        }
    }
}
