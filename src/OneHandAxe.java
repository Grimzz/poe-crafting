import java.util.ArrayList;

public class OneHandAxe extends Item {
	private ArrayList<Weight> potRolls;
	// these are all the identifier tags that apply to a One Handed Weapon
	private static String[] tags = {"axe", "one_hand_weapon", "weapon", "default"};
	private static String name = "One Hand Axe";
	private int poolSize; // the cumulative value of all the possible Implicits

	OneHandAxe(){
		poolSize = 0;
		addRoll("AddedChaosDamageCorrupted1 200");
	}
}