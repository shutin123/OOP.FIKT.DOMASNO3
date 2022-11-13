package zadaca2;

public class Fakultet {
	String nazivNaFakultet, dekan, sediste;
	int brojNaSmerovi, brojNaStudenti;

	public Fakultet () {

	}

	public void zgolemiStudenti() {
		brojNaStudenti += 50;
		System.out.println("Broj na studenti: " + brojNaStudenti);
	}

	public int namaliStudenti(int namali) {
		return brojNaStudenti - namali;
	}

	public void nazivSediste () {
		System.out.println("Naziv na fakultet: " + nazivNaFakultet);
		System.out.println("sediste: " + sediste);
	}

}
