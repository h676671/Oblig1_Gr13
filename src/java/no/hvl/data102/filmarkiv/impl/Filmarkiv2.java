import java.no.hvl.data102.filmarkiv.impl.Film;

public class Filmarkiv2 implements FilmarkivADT {
	
	private int antall;
	private LinearNode<Film> start;
	
    private HashSet<Film> arkiv;

    /**
     * Konstruktør som oppretter et tomt film arkiv/init HashSet med Film som objekt
     */
    public Filmarkiv() {
        arkiv = new HashSet<>();
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
        arkiv.add(nyFilm);
    }

    @Override
    public boolean slettFilm(int filmnr) {
        Film film = finnFilm(filmnr);
        if (film != null) {
            arkiv.remove(film);
            return true;
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return filterFilmer(film -> film.getTittel().equals(delstreng));
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return filterFilmer(film -> film.getFilmSkaper().equals(delstreng));
    }

    @Override
    public int antall(Sjanger sjanger) {
        int antSjanger = 0;
        for (Film film : arkiv) {
            if (film.getSjanger().equals(sjanger)) {
                antSjanger++;
            }
        }
        return antSjanger;
    }

    @Override
    public int antall() {
        return arkiv.size();
    }

    private Film[] filterFilmer(FilterPredicate predicate) {
        HashSet<Film> resultater = new HashSet<>();
        for (Film film : arkiv) {
            if (predicate.test(film)) {
                resultater.add(film);
            }
        }
        return resultater.toArray(new Film[0]);
    }

    interface FilterPredicate {
        boolean test(Film film);
    }
}
