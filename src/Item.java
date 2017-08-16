import java.util.ArrayList;

public abstract class Item {
	private ArrayList<Implicit> potRolls;
	private String[] tags;
	private String baseType;
	private int poolSize;

	Item(String baseType){
		switch (baseType) {
			case "Bow": new Bow();
				break;
			case "Claw": new Claw();
				break;
			case "Dagger": new Dagger();
				break;
			case "One Hand Axe": new OneHandAxe();
				break;
			case "One Hand Mace": new OneHandMace();
				break;
			case "One Hand Sword": new OneHandSword();
				break;
			case "Sceptre": new Sceptre();
				break;
			case "Staff": new Staff();
				break;
			case "Two Hand Axe": new TwoHandAxe();
				break;
			case "Two Hand Mace": new TwoHandMace();
				break;
			case "Two Hand Sword": new TwoHandSword();
				break;
			case "Wand": new Wand();
				break;
			case "Body Armour": new BodyArmour();
				break;
			case "Boots": new Boots();
				break;
			case "Gloves": new Gloves();
				break;
			case "Helmet": new Helmet();
				break;
			case "Shield": new Shield();
				break;
			case "Amulet": new Amulet();
				break;
			case "Ring": new Ring();
				break;
			case "Quiver": new Quiver();
				break;
		}
	}

	/**
	* Receives a String holding a tag and tag value as input. Splits up the input String
	* and then adds that to the potRolls ArrayList.
	* Example: addRoll("AddedChaosDamageCorrupted1 0); would then turn into: 
	* rollTags.add(new Weight("AddedChaosDamageCorrupted1", 0));
	*/
	public boolean addRoll(Weight input){
		try {
			potRolls.add(input);
			poolSize += weight;
			return true;
		} catch (IndexOutOfBoundsException e){
			e.getMessage();
			return false;
		}
	}

	/**
	* This method checks to see if the incoming tag is contained in our pre-defined array of 
	* item tags. If it IS, we return true, if it is NOT, we return false.
	*/
	public boolean contains(String inputTag){
		for (int i = 0; i < tags.length; i++){
			if (inputTag.equals(tags[i]))
				return true; //if the incoming ID matches ANY of our classes ID's, we return true
		}
		return false; // if we get to the end of our array without any matches
	}
	public String toString(){
		String output = "";
		for (int i = 0; i < potRolls.size(); i++){

		}
	}
}