import java.util.ArrayList;
import java.io.*;

public class Implicit {
	private String name;
	private int itemLvl;
	private String effect;
	private ArrayList<Weight> rollTags;

	Implicit(String name, int ilvl, String effect){
		this.name = name;
		this.itemLvl = ilvl;
		this.effect = effect;

		rollTags = new ArrayList<>();
	}

	public ArrayList<Weight> getTags(){
		return rollTags;
	}

	public String toString(){
		return name + itemLvl + effect;
	}
}