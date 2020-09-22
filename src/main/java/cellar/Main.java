package cellar;

public class Main {
    public static void main(String[] args) {
        Cellar cellar = new Cellar();
        cellar.putBank(BankType.TOMATO, "баночка помидорчиков");
        cellar.getBank("баночка помидорчиков");
        System.out.println(cellar);
    }
}
