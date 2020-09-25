package cellar;

import banks.BankType;
import banks.CrashException;

public class Main {
    public static void main(String[] args) throws CrashException {
        Cellar cellar = new Cellar();
        cellar.putBank(BankType.TOMATO, "помидоросы");
        cellar.getBank("помидоросы");
        System.out.println(cellar);
    }
}
