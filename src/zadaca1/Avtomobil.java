package zadaca1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public int pominatiKm;
	public int godinaNaProizvodstvo;
	public String registracija;


	public Avtomobil (String marka, String model, String boja, int pominatiKm, int godinaNaProizvodstvo, String registracija) {	
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodstvo = godinaNaProizvodstvo;
		this.registracija = registracija;
	}


	public void pecatiOsnovniAtributi() {
		System.out.println("Marka: " + marka);
		System.out.println("Model: " + model);
		System.out.println("Boja: " + boja);
	}

	public void pecatiPominatiKm () {
		System.out.println("Pominati kilometri: " + (pominatiKm+1520.25) + " km");
	}

}
