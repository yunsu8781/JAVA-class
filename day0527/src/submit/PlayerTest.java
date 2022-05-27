package submit;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player[] party = new Player[3];
		
		for (int i = 0; i < party.length; i++) {
			party[i] = new Player("player" +(i+1));
		}
		for (int i = 0; i < party.length; i++) {
			System.out.println();
		}
		
	}
}
