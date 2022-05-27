package submit;

public class Player {

	String name;
	int hp;
	int mp;
	
	public Player(String name) {
	 this.name = name;
	 this.hp = 100;
	 this.mp = 100;
	}
	
	public void attack() {
		System.out.println("attack!");
	}
	
	public void defense() {
		System.out.println("defense!");

	}
}

