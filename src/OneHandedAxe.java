import java.util.ArrayList;

public class OneHandedAxe {
	private ArrayList<Weight> rolls;
	// these are all the identifier tags that apply to a One Handed Weapon
	private static String[] keyWords = {"axe", "one_hand_weapon", "weapon", "default"};
	private static String name = "One-Handed Axe";
	private int poolSize; // the cumulative value of all the possible Implicits

	OneHandedAxe(){
		poolSize = 0;
	}

	/**
	* Receives a String holding a tag and tag value as input. Splits up the input String
	* and then adds that to the rolls ArrayList.
	* Example: addRoll("AddedChaosDamageCorrupted1 0); would then turn into: 
	* rollTags.add(new Weight("AddedChaosDamageCorrupted1", 0));
	* temp[0] refers to the 
	*/
	public boolean addRoll(String input){
		String[] temp = input.split(" ");
		String ID = temp[0];
		int weight = Integer.parseInt(temp[1]);

		try {
			rolls.add(new Weight(ID, weight));
			poolSize += weight;
			return true;
		} catch (IndexOutOfBoundsException e){
			e.getMessage();
			return false;
		}
	}

	public boolean contains(String ID){
		for (int i = 0; i < keyWords.length; i++){
			if (ID.equals(keyWords[i]))
				return true; //if the incoming ID matches ANY of our classes ID's, we return true
		}
		return false; // if not, false
	}
}