public class TESTDRIVER {

	public static void main(String[] args){
		String[] tags = {"sword 1000", "axe 1000", "dagger 1000", "wand 1000", "bow 1000", "claw 1000", "default 0"};
		Item testItem = new OneHandAxe("One Hand Axe");
		Implicit chaosDmg = new Implicit("CullingStrikeCorrupted", 1, "Culling Strike", tags);

		for (int i = 0; i < tags.length; i++){
			String[] curr = tags[i].split(" ");
			if (testItem.contains(curr[0])){
				Weight temp = new Weight(tags[i]);
				testItem.addRoll(chaosDmg, temp.getWeight());
			}
		}
		System.out.println(testItem.toString());
	}
}