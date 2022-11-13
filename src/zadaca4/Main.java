package zadaca4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner myInput = new Scanner( System.in );
		int n;
		int paricka;
		Brojach brojac1 = new Brojach();


		System.out.print("Vnesi kolku pati da se frli parickata: ");
		n = myInput.nextInt();

		for (int i=0; i<n; i++) {
			Random r = new Random();
			paricka = (int)Math.round(Math.random());
			System.out.println(paricka);
			brojac1.zBrojach(paricka);
		}

		System.out.println("Padnalo pismo: " + brojac1.pismo + " pati");
		System.out.println("Padnalo glava: " + brojac1.glava + " pati");
		brojac1.rBrojach();

	}

}
