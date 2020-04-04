package pl.pjatk.zjazd1.a11_challenge;

public class IfElseChallenge {

    public static void main(String[] args) {
        /*
        Utwórz trzy zmienne typu double o wartosciacg 20, 40, suma*100
        Utwórz zmienną typu boolean do której
        przypiszesz rezultat sprawdzenia czy suma*100%40.00d == 0
        Jeżeli reszta będzie większa od 0 wypisz to na ekranie
         */
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
