import java.util.HashMap;
import java.util.ArrayList;

public class AnimalHipster {

	public AnimalHipster() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals) {
		ArrayList<String> animalHipsters = new ArrayList<String>();
		for (String person : network.keySet()) {
			String personAnimal = favoriteAnimals.get(person);
			boolean foundFriendAnimal = false;
			for (String friend : network.get(person)) {
				if (personAnimal.equals(favoriteAnimals.get(friend))) {
					System.out.println(person + " has friend " + friend + " with pet");
					foundFriendAnimal = true;
					break;
				}
			}
			if (!foundFriendAnimal) {
				System.out.println("Person: " + person + "is hipster");
				animalHipsters.add(person);
			}
		}
		return animalHipsters;
	}
}
