import java.no.hvl.data102.filmarkiv.impl.Film;

public class Filmarkiv2 implements FilmarkivADT {
	
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2() {
		antall = 0;
		start= null;
	}
	
	@Override
	public Film finnFilm(int nr) {
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
}
	
	@Override
	public boolean slettFilm(int filmnr) {
		return false;
	}
	public Film[] søkTittel(String delstreng) {
		return null;
	}
	
	@Override
	public Film[] sølProdusent(String delstreng) {
		return null;
	}
	
	@Override
	public int antall(Sjanger sjanger) {
		return 0;
	}
	@Override
	public int antall() {
		return antall;
	}
	
	private LinearNode<Film> finnNode(int filmnr){
		return null;
	}
	
}	
