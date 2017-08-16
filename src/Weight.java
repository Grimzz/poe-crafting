public class Weight {
	// private fields that represent a spawn tag and it's weight (ring 1000)
	private int weight;
	private String tag;

	Weight(String input){
		String[] data = input.split(" ");
		this.tag = data[0];
		this.weight = data[1];
	}

	public String getTag(){
		return tag;
	}

	public int getWeight(){
		return weight;
	}
}