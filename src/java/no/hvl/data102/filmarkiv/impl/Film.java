package java.no.hvl.data102.filmarkiv.impl;

import java.util.Objects;

public class Film {
    private int filmNr;
    private String filmSkaper;
    private String tittel;
    private int utgivelse;
    private Sjanger sjanger;
    private String filmSelskap;

    public Film() {
        this(0,"","",0,null,"");
    }

    public Film(int filmNr, String filmSkaper, String tittel, int utgivelse, Sjanger sjanger, String filmSelskap) {

        this.filmNr = filmNr;
        this.filmSkaper = filmSkaper;
        this.tittel = tittel;
        this.utgivelse = utgivelse;
        this.sjanger = sjanger;
        this.filmSelskap = filmSelskap;

    }

    public void setFilmNr(int filmNr) {
        this.filmNr = filmNr;
    }
    public int getFilmNr() {
        return filmNr;
    }

    public void setFilmSkaper(String filmSkaper) {
        this.filmSkaper = filmSkaper;
    }
    public String getFilmSkaper() {
        return this.filmSkaper;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }
    public String getTittel() {
        return this.tittel;
    }

    public void setUtgivelse(int utgivelse){
        this.utgivelse = utgivelse;
    }
    public int getUtgivelse() {
        return this.utgivelse;
    }

    public void setSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }
    public Sjanger getSjanger() {
        return this.sjanger;
    }

    public void setFilmSelskap(String filmSelskap) {
        this.filmSelskap = filmSelskap;
    }
    public String getFilmSelskap() {
        return this.filmSelskap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Film film = (Film) o;
        return filmNr == film.filmNr && utgivelse == film.utgivelse && Objects.equals(filmSkaper, film.filmSkaper) && Objects.equals(tittel, film.tittel) && Objects.equals(sjanger, film.sjanger) && Objects.equals(filmSelskap, film.filmSelskap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmNr, filmSkaper, tittel, utgivelse, sjanger, filmSelskap);
    }
}
