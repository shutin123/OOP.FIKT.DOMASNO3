package zadaca2;

public class Main {

	public static void main(String[] args) {
		Fakultet obj1 = new Fakultet();
		Fakultet obj2 = new Fakultet(); 

		obj1.nazivNaFakultet = "FIKT";
		obj1.sediste = "Bitola";
		obj1.brojNaStudenti = 550;

		obj2.nazivNaFakultet = "FINKI";
		obj2.sediste = "Skopje";
		obj2.brojNaStudenti = 1550;

		obj1.zgolemiStudenti();
		obj1.namaliStudenti(15);
		obj1.nazivSediste();

		obj2.zgolemiStudenti();
		obj2.namaliStudenti(300);
		obj2.nazivSediste();


	}

}
