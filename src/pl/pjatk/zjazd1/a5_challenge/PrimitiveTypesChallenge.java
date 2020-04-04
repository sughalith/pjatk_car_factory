package pl.pjatk.zjazd1.a5_challenge;

public class PrimitiveTypesChallenge {

    /*
    Utwórz trzy zmienne typu byte, short i int.
    Przypisz im dowolne wartości.
    Utwórz również zmienną typu long i
    ustaw jej wartość równą 50000 + 10 razy suma byte, short i int.
     */
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (long) (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}
