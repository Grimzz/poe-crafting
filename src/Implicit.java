import java.util.ArrayList;
import java.io.*;

public class Implicit {
	// private fields
	private String name, effect;
	private int itemLvl;
	private ArrayList<Weight> rollTags;

	// non-default constructor that assigns values and initializes 'weights'
	Attribute(String name, int ilvl, String effect){ 
		this.name = name;
		itemLvl = ilvl;
		this.effect = effect;
		rollTags = new ArrayList<Weight>();
	}

	/**
	* Receives a String holding a tag and tag value as input. Splits up the input String
	* and then adds that to the rollTags ArrayList.
	* Example: addRollTag("ring 1000"); would then turn into: 
	* rollTags.add(new Weight("ring", 1000));
	*/
	public boolean addRollTag(String input){
		String[] temp = input.split(" ");
		try {
			rollTags.add(new Weight(temp[0],Integer.parseInt(temp[1])));
			return true;
		} catch (IndexOutOfBoundsException e){
			e.getMessage();
			return false;
		}
	}
}