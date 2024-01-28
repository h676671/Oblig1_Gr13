package java.no.hvl.data102.filmarkiv.impl;

import java.no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import java.no.hvl.data102.filmarkiv.impl.Filmarkiv;
import java.no.hvl.data102.filmarkiv.impl.Film;
import java.no.hvl.data102.filmarkiv.impl.Sjanger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FilmarkivTest {

    @Test
    void finnFilm() {
        FilmarkivADT filmarkiv = new Filmarkiv();

        Film test1 = new Film(1, "Christopher Nolan", "Interstellar", 2014, Sjanger.SCIFI, "Paramount");
        Film test2 = new Film(1, "Christopher Nolan", "Oppenheimer", 2023, Sjanger.HISTORY, "Universal");
        Film test3 = new Film(1, "Steven Spielberg", "Jurrasic Park", 1993, Sjanger.SCIFI, "Universal");

        filmarkiv.leggTilFilm(test1);
        filmarkiv.leggTilFilm(test2);
        filmarkiv.leggTilFilm(test3);

        Film resultat1 = filmarkiv.finnFilm(1);
        Film resultat2 = filmarkiv.finnFilm(2);
        Film resultat3 = filmarkiv.finnFilm(3);

        Assertions.assertEquals(test1, resultat1);
        Assertions.assertEquals(test2, resultat2);
        Assertions.assertEquals(test3, resultat3);

    }
}