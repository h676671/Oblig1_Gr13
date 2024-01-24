package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import java.util.ArrayList;
import java.util.Iterator;

public class Filmarkiv implements FilmarkivADT {

    private ArrayList<Film> arkiv;
    private int antall;

    /*
    Konstruktør som oppretter et tomt film arkiv/init arrayList med Film som objekt
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

        Film[] film = new Film[antall];
        for (int i = 0; i < film.length; i++ ) {

            //Sjekker om filmen har samme tittel som "delstreng"

            if (film[i] ) {
                return new Film[i];
            }
        }

        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
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
}
