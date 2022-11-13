package zadaca4;

public class Brojach {
	int pismo = 0;
	int glava = 0;

	public Brojach () {

	}

	public void zBrojach(int p0g1) {

		if (p0g1 == 0) this.pismo++;
		if (p0g1 == 1) this.glava++;

	}

	public void rBrojach() {
		this.pismo=0;
		this.glava=0;
	}
}
