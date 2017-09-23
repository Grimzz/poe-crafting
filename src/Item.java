import java.util.ArrayList;
import java.util.Arrays;

public abstract class Item {
	private ArrayList<Implicit> potRolls;
	private ArrayList<String> tags; // the tags that apply to the given type of weapon
	private String baseType = "";
	private int poolSize = 0;

	Item(String baseType, String tagStr){
		String[] tagArray = tagStr.split(" ");
		potRolls = new ArrayList<>();
		this.tags = new ArrayList<>(Arrays.asList(tagArray));
		this.baseType = baseType;
	}

	/**
	* Receives a String holding a tag and tag value as input. Splits up the input String
	* and then adds that to the potRolls ArrayList.
	* Example: addRoll("AddedChaosDamageCorrupted1 0); would then turn into: 
	* rollTags.add(new Weight("AddedChaosDamageCorrupted1", 0));
	*/
	public boolean addRoll(Implicit input, int weight){

		potRolls.add(input);
		poolSize += weight;

		return true;
	}

	/**
	* This method checks to see if the incoming tag is contained in our pre-defined array of 
	* item tags. If it IS, we return true, if it is NOT, we return false.
	*/
	public boolean contains(String inputTag){
		for (int i = 0; i < tags.size(); i++){
			if (inputTag.equals(tags.get(i)))
				return true; //if the incoming ID matches ANY of our classes ID's, we return true
		}
		return false; // if we get to the end of our array without any matches
	}

	public String toString(){
		String output = "";
		for (int i = 0; i < potRolls.size(); i++){
			output += potRolls.get(i).toString();
		}
		return output;
	}
}