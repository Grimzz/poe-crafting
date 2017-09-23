import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TESTDRIVER {
	ArrayList<Item> items;
	ArrayList<Implicit> implicits;

	public static void main(String[] args){
		new TESTDRIVER().run();
	}
	// this is very messy so we need to make sure it isn't missing any tags.
	// need to double check this before actual production
	public void run() {
		System.out.println("Launching PoE Vaal Helper...");
		items = new ArrayList<>(); // initialize our items ArrayList
		Item amulet = new Amulet("Amulet", "amulet default");
		Item body = new BodyArmour("Body Armour", "body_armour default");
		Item boots = new Boots("Boots", "boots default");
		Item bow = new Bow("Bow", "bow two_hand_weapon weapon default");
		Item claw = new Claw("Claw", "weapon claw one_hand_weapon default");
		Item dagger = new Dagger("Dagger", "dagger weapon one_hand_weapon default");
		Item gloves = new Gloves("Gloves", "gloves default");
		Item helmet = new Helmet("Helmet", "helmet default");
		Item onehandaxe = new OneHandAxe("One Hand Axe", "weapon one_hand_weapon axe default");
		Item onehandmace = new OneHandMace("One Hand Mace", "weapon one_hand_weapon mace default");
		Item onehandsword = new OneHandSword("One Hand Sword", "weapon one_hand_weapon sword default");
		Item quiver = new Quiver("Quiver", "quiver default");
		Item ring = new Ring("Ring", "ring default");
		Item sceptre = new Sceptre("Sceptre", "sceptre weapon one_hand_weapon no_attack_mods default");
		Item shield = new Shield("Shield", "shield default");
		Item staff = new Staff("Staff", "staff two_hand_weapon no_attack_mods weapon default");
		Item twohandaxe = new TwoHandAxe("Two Hand Axe", "axe two_hand_weapon weapon default");
		Item twohandmace = new TwoHandMace("Two Hand Mace", "mace two_hand_weapon weapon default");
		Item twohandsword = new TwoHandSword("Two Hand Sword", "sword two_hand_weapon weapon default");
		Item wand = new Wand("Wand", "weapon wand one_hand_weapons default");

		items.add(amulet);
		items.add(body);
		items.add(boots);
		items.add(bow);
		items.add(claw);
		items.add(dagger);
		items.add(gloves);
		items.add(helmet);
		items.add(onehandaxe);
		items.add(onehandmace);
		items.add(onehandsword);
		items.add(quiver);
		items.add(ring);
		items.add(sceptre);
		items.add(shield);
		items.add(staff);
		items.add(twohandaxe);
		items.add(twohandmace);
		items.add(twohandsword);
		items.add(wand);

		System.out.println("Items loaded successfully...");
		System.out.println("Loading implicit modifiers...");

		readFile(); // goto readFile method
	}

	/**
	 *
	 */
	private void readFile(){
		// file reading begins
		File file = new File("C:\\Users\\Thomas\\IdeaProjects\\PoEVaal\\src\\ImplicitList.txt");
		try {
			/*	For some reason my IDE cannot find the file when I put in the relative file path.
				Obviously this needs to be fixed before you or anyone else can run it. */
			Scanner sc = new Scanner(file);

			String line;
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}