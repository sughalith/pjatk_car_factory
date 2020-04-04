package pl.pjatk.zjazd2.a3;

import pl.pjatk.zjazd3.a1.NoPowerException;

public class Inheritance {
    //Utworzyc klase samochod z polami (kola, drzwi, kierownica)
    //Utworzyc klase Tesla w która dziedziczy po samochodzie i dodatkowo posiada ładowarke i metode "ładuj"
    //Utworzyć trzecia klase "ModelS" ktora dziedziczy po Tesli i posiada 700 koni i rowniez ma swoje metody


    public void testLowPower() {
        ModelS modelS = new ModelS(4, 6, 0, 700);
        try {
            modelS.lowPower();
        } catch (NoPowerException ex){
            modelS.charge(100);
        }
    }
}
