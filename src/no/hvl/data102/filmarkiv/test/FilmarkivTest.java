import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

class FilmarkivTest {


    @Test
    void finnFilm() {

        FilmarkivADT filmarkiv = new Filmarkiv();

        Film test1 = new Film(1,"Christopher Nolan","Interstellar",2014, Sjanger.SCIFI ,"Paramount" );
        Film test2 = new Film(2,"Christopher Nolan","Oppenheimer",2023, Sjanger.HISTORY ,"Universal" );
        Film test3 = new Film(3,"Steven Spielberg","Jurrasic Park",1993, Sjanger.SCIFI ,"Universal" );

        filmarkiv.leggTilFilm(test1);
        filmarkiv.leggTilFilm(test2);
        filmarkiv.leggTilFilm(test3);

        Film resultat1 = filmarkiv.finnFilm(1);
        Film resultat2 = filmarkiv.finnFilm(2);
        Film resultat3 = filmarkiv.finnFilm(3);

        assertEquals(test1, resultat1);
        assertEquals(test2, resultat2);
        assertEquals(test3, resultat3);


    }

    @Test
    void leggTilFilm() {

        FilmarkivADT filmarkiv = new Filmarkiv();

        Film nyFilm = new Film(6, "Ridley Scott", "Napoleon", 2023, Sjanger.HISTORY, "Sony");
        Film nyFilm2 = new Film(7, "Martin Scorsese", "Killers Of The Flower Moon", 2023, Sjanger.DRAMA, "Paramount & Apple");

        filmarkiv.leggTilFilm(nyFilm);
        filmarkiv.leggTilFilm(nyFilm2);

        Film resultat1 = filmarkiv.finnFilm(6);
        Film resultat2 = filmarkiv.finnFilm(7);

        assertEquals(nyFilm,resultat1);
        assertEquals(nyFilm2,resultat2);

    }

    @Test
    void slettFilm() {



    }

    @Test
    void soekTittel() {



    }

    @Test
    void soekProdusent() {



    }

    @Test
    void antall() {



    }

    @Test
    void testAntall() {



    }
}