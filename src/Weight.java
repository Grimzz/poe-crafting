public class Weight {
	// private fields that represent a spawn tag and it's weight (ring 1000)
	private int weight;
	private String tag;

	Weight(String tag, int weight){
		this.tag = tag;
		this.weight = weight;
	}

	public String getTag(){
		return tag;
	}

	public int getWeight(){
		return weight;
	}
}