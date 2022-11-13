package zadaca3;

public class PC {
	int memorija, hardDisk;
	String tipNaMemorija, golemina = "GB";

	public PC () {
		this.memorija = 2;
		this.tipNaMemorija = "DDR2";
		this.hardDisk = 160;
	}

	public void zgolemiM (int zgolemiMemorija, int novHardDisk) {
		System.out.println("Memorijata bese: " + this.memorija + " " + this.golemina + ", sega iznesuva: " + (this.memorija+zgolemiMemorija) + " " + golemina + ".");
		System.out.println("Tipot na memorijata e: " + this.tipNaMemorija +".");
		System.out.println("HD ima golemina od: " + (this.hardDisk+novHardDisk) + " " + this.golemina + ". Prethodno iznesuvase: " + this.hardDisk + " " + golemina + ".");

	}


}


