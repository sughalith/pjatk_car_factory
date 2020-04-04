package pl.pjatk.zjazd1.a6_challenge;

public class FloatAndDoubleChallenge {
    /*
    Przekonwertuj dowolną ilość funtów na kilogramy.
        Utwórz zmienną o wartości jaką chcesz przekonwertować
        Przelicz wartość (1 funt = 0.45359237kg)
        Wypisz wynik na ekran
     */
    public static void main(String[] args) {
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);
    }
}
