package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import java.util.ArrayList;
import java.util.Iterator;

public class Filmarkiv implements FilmarkivADT {

    private ArrayList<Film> arkiv;
    private int antall;

    /**
     * Konstruktør som oppretter et tomt film arkiv/init arrayList med Film som objekt
     *
     */
    public Filmarkiv() {
        antall = 0;
        arkiv = new ArrayList<>(antall);
    }

    @Override
    public Film finnFilm(int nr) {
        for (Film i : arkiv) {
            if (i.getFilmNr() == nr) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {

        if (!arkiv.contains(nyFilm)) {
            arkiv.add(nyFilm);
            antall++;
        }

    }

    @Override
    public boolean slettFilm(int filmnr) {

        for (Film i : arkiv) {
            if (i.getFilmNr() == filmnr) {
                arkiv.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {

        for (Film film : arkiv) {
           if (film.getTittel().equals(delstreng)) {
               return new Film[]{film};
           }
        }

        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        for (Film film : arkiv) {
            if (film.getFilmSkaper().equals(delstreng)) {
                return new Film[]{film};
            }
        }

        return new Film[0];
    }

    @Override
    public int antall(Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return 0;
    }

    /**
     * Hjelpemetode som trimmer en tabell, slik at alle steder i tabellen har en referanse
     * @param tab
     * @param n
     * @return
     */
    private Film[] trimTab(Film[] tab, int n) {
        Film[] nytab = new Film[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
