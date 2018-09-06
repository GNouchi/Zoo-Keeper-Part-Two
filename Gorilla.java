package folderOne.zookeeper;

public class Gorilla extends Mammal{
	public void eatBananas() {
		this.setEnergy(this.getEnergy() +10);
		System.out.println("The gorilla is satisfied, energy level increased (+10)");
	}
//temp added for readability
	public void climb() {
		this.setEnergy(this.getEnergy() -10);
		int temp = this.getEnergy();
		if (temp < 0 ) {
			this.setEnergy(0);
			System.out.println("The gorilla tried climbing the tree, but ran out of energy");		
			this.displayEnergy();			
		}
		else {
			System.out.println("The gorilla has climbed a tree, energy level decreased (-"+temp+")");		
		}
	}
	public void throwSomething() {
		this.setEnergy(this.getEnergy() -10);
		int temp = this.getEnergy();
		if (temp < 0 ) {
			this.setEnergy(0);
			System.out.println("The gorilla tried throwing something,but ran out of energy");		
			this.displayEnergy();
		}
		else {
			System.out.println("The gorilla has thrown something, energy level decreased (-"+temp+")");
		}
	}
}


