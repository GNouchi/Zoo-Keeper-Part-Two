package folderOne.zookeeper;

public class GiantBat extends Mammal{
	public GiantBat(){
		this.setEnergy(300);
	}
	public void fly() {
		this.setEnergy(this.getEnergy()-50);
		int this_energy = this.getEnergy();
		if (this_energy >0)
			System.out.println("The sound of a magestic wings flapping");			
		else {this.setEnergy(0);
			System.out.println("The sound of a bat taking off, then falling out of the sky");}
	}
	public void eatHumans() {
		this.setEnergy(this.getEnergy()+25);
		System.out.println("The sound of humans being eaten, you're next Michael Choi");
	}
	public void attackTown() {
		this.setEnergy(this.getEnergy()-100);
		int this_energy = this.getEnergy();
		if (this_energy >0)
			System.out.println("The sound of a town under seige");			
		else {this.setEnergy(0);
			System.out.println("The town was spared! The bat ran out of energy");}
	}
}
