package no.hvl.data102.filmarkiv.impl;

public class Film {
    private int filmNr;
    private String filmSkaper;
    private String tittel;
    private int utgivelse;
    private Enum sjanger;
    private String filmSelskap;

    public Film() {
        this(0,"","",0,"","");
    }

    public Film(int filmNr, String filmSkaper, String tittel, int utgivelse, Enum sjanger, String filmSelskap) {

        this.filmNr = filmNr;
        this.filmSkaper = filmSkaper;
        this.tittel = tittel;
        this.utgivelse = utgivelse;
        this.sjanger = sjanger;
        this.filmSelskap = filmSelskap;

    }

}
