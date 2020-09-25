package cellar;

import banks.*;

import java.util.ArrayList;
import java.util.List;

public class Cellar {

    private final List<Bank> banks = new ArrayList<>();

    // Берем банку
    public void getBank(String name) throws CrashException {
        if (!banks.isEmpty()) {
            for (Bank bank : banks) {
                if (bank.name.equals(name)) {
                    try {
                        crashOrNot(50, name);
                        System.out.println("Банку " + name + " взяли из погреба");
                    } catch (CrashException ex) {
                        System.out.println(ex.getMessage());
                    }
                    banks.remove(bank);
                    break;
                }
            }
        } else {
            System.out.println("Погреб пуст");
        }
    }

    // Кладем банку
    public void putBank(BankType type, String name) throws CrashException {
        try{
            crashOrNot(50,name);
            switch (type) {
                case CUCUMBER:
                    banks.add(new Cucumber(name));
                    break;
                case TOMATO:
                    banks.add(new Tomato(name));
                    break;
                case MARROW:
                    banks.add(new Marrow(name));
                    break;
                case MUSHROOM:
                    banks.add(new Mushroom(name));
                    break;
                case GARLIC:
                    banks.add(new Garlic(name));
                    break;
                case CABBAGE:
                    banks.add(new Cabbage(name));
                    break;
                case RADISH:
                    banks.add(new Radish(name));
                    break;
                default:
                    throw new RuntimeException("Неверный тип данных");
            }
            System.out.println("Банку " + name + " положили в погреб");
        }
        catch (CrashException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Разобьется или нет?
    public void crashOrNot(int probability, String name) throws CrashException {
        int crash = (int) (Math.random() * 100);
        if (crash < probability) {
            throw new CrashException("Ой-ой, банка " + name + " выпала из рук и разбилась");
        }
    }

    @Override
    public String toString() {
        if(banks.isEmpty()){
            return "Погреб пуст";
        } else {
            return banks.toString();
        }
    }
}
