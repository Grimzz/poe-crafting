public class TESTDRIVER{
	public static void main(String[] args){
		String[] tags = {"sword 1000", "axe 1000", "dagger 1000", "wand 1000", "bow 1000", "claw 1000", "default 0"};
		Item testItem = new Item("One Hand Axe");
		Implicit chaosDmg = new Implicit("CullingStrikeCorrupted", 1, "Culling Strike", tags);

		for (String curr: tags) { // loop through tag list
			if (testItem.contains(curr)) // if the current tag is a tag of the Item
				testItem.addRoll(chaosDmg, curr); // add that tag, with its weight, to Item
		}
	}
}