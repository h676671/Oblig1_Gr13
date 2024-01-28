package java.no.hvl.data102.filmarkiv.impl;

import java.no.hvl.data102.filmarkiv.adt.FilmarkivADT;

import java.util.ArrayList;


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

        //ArrayList slik at vi kan få flere filmer med lignenede tittel
        ArrayList<Film> resultater = new ArrayList<>();

        for (Film film : arkiv) {
           if (film.getTittel().equals(delstreng)) {
               resultater.add(film);
           }
        }

        //Gjør ArrayListen om til en tabell go trimmer listen slik at den er full.
        return resultater.toArray(trimTab(new Film[0], resultater.size()));
    }

    @Override
    public Film[] soekProdusent(String delstreng) {

        //ArrayList slik at vi kan få flere filmer med lignenede tittel
        ArrayList<Film> resultater = new ArrayList<>();

        for (Film film : arkiv) {
            if (film.getFilmSkaper().equals(delstreng)) {
                resultater.add(film);
            }
        }

        //Gjør ArrayListen om til en tabell go trimmer listen slik at den er full.
        return resultater.toArray(trimTab(new Film[0], resultater.size()));
    }

    @Override
    public int antall(Sjanger sjanger) {
        int antSjanger = 0;
        for (Film film : arkiv) {
            if(film.getSjanger().equals(sjanger)){
                antSjanger++;
            }
        }
        return antSjanger;
    }

    @Override
    public int antall() {
        return arkiv.size();
    }

    /**
     * Hjelpemetode som trimmer en tabell, slik at alle steder i tabellen har en referanse
     * @param tab tabellen
     * @param n posisjon
     * @return trimmet tabell
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
