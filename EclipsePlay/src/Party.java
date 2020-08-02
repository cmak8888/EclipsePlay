import java.util.ArrayList;

public class Party {
	private ArrayList<Friends> people;

	public Party() {
		people = new ArrayList<Friends>();
	}

	public void addPeople() {
 people.add(new Friends("Mark", "baldwin"));
 people.add(new Friends("Jane", "jsmith"));
 people.add(new Friends("Joe", "jdoe"));
	}

	public void showPeople() {
		System.out.println("Who's Coming to the Party?");
		for (Friends person : people) {
			System.out.println(person);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Party party = new Party();
		party.addPeople();
		party.showPeople();

	}

}
