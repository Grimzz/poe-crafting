import java.util.ArrayList;
import java.io.*;

public class Implicit {
	private String name;
	private int itemLvl;
	private int weight;
	private String effect;
	private ArrayList<Weight> rollTags;

	Implicit(String name, int ilvl, String effect, String[] tags){
		this.name = name;
		this.itemLvl = ilvl;
		this.effect = effect;

		rollTags = new ArrayList<>();
		// iteratively add our tags array elements to our ArrayList of rollTags
		for (String curr:tags) {
			if (curr != null)
				rollTags.add(new Weight(curr));
		}
	}

	public ArrayList<Weight> getTags(){
		return rollTags;
	}

	public String toString(){
		return name + itemLvl + effect;
	}
}