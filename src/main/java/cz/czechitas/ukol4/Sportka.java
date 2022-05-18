package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();


    public Sportka() {
        //TODO naplnit osudí čísly 1 až 49

        for (int cislaVOsudi = 1; cislaVOsudi<= 49; cislaVOsudi++)

            osudi.add(cislaVOsudi);
        }


    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        //TODO zamíchat osudí
        Collections.shuffle(osudi, new Random());

    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        return osudi.subList(0, 6);
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
        //TODO Vrátit sedmé číslo z osudí.
        return osudi.get(6);
    }
}
