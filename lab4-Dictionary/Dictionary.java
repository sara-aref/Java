import java.util.*;
import java.util.Scanner; 

public class Dictionary {
    public static void main(String [] args) {

    App dic = new App();

    Map<Character, TreeSet<String>> mapping = new TreeMap<>();

	mapping.put('A', new TreeSet<>(Arrays.asList("Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant")));
    mapping.put('B', new TreeSet<>(Arrays.asList("Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful")));
    mapping.put('C', new TreeSet<>(Arrays.asList("Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon")));
    mapping.put('D', new TreeSet<>(Arrays.asList("Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly")));
    mapping.put('E', new TreeSet<>(Arrays.asList("Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral")));
    mapping.put('F', new TreeSet<>(Arrays.asList("Fairy", "Flame", "Fiesta", "Frost", "Floral", "Firefly", "Fascinate", "Fable", "Feather", "Flicker")));
	mapping.put('G', new TreeSet<>(Arrays.asList("Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy", "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter")));
    mapping.put('H', new TreeSet<>(Arrays.asList("Harmony", "Heavenly", "Honey", "Harbor", "Hope", "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth")));
    mapping.put('I', new TreeSet<>(Arrays.asList("Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate", "Impulse", "Incandescent", "Ingenious", "Ineffable")));
    mapping.put('J', new TreeSet<>(Arrays.asList("Jubilant", "Jade", "Journey", "Joyful", "Jazz", "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular")));
    mapping.put('K', new TreeSet<>(Arrays.asList("Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet", "Kale", "Kudos", "Kiss", "Kittens", "Knight")));
    mapping.put('L', new TreeSet<>(Arrays.asList("Lagoon", "Luminous", "Lullaby", "Lavender", "Lively", "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac")));
    mapping.put('M', new TreeSet<>(Arrays.asList("Majestic", "Mystic", "Moonlight", "Melody", "Mirth", "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty")));
    mapping.put('N', new TreeSet<>(Arrays.asList("Nebula", "Nectar", "Nirvana", "Noble", "Nurturing", "Nautical", "Novel", "Nuance", "Nebulous", "Nestle")));
    mapping.put('O', new TreeSet<>(Arrays.asList("Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic", "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx")));
    mapping.put('P', new TreeSet<>(Arrays.asList("Peach", "Pristine", "Petal", "Panorama", "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle")));
    mapping.put('Q', new TreeSet<>(Arrays.asList("Quasar", "Quaint", "Quell", "Quest", "Quiver", "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench")));
    mapping.put('R', new TreeSet<>(Arrays.asList("Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous", "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture")));
    mapping.put('S', new TreeSet<>(Arrays.asList("Serene", "Sapphire", "Serenade", "Symphony", "Sparkle", "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan")));
    mapping.put('T', new TreeSet<>(Arrays.asList("Tranquil", "Twilight", "Tender", "Tropical", "Talisman", "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure")));
    mapping.put('U', new TreeSet<>(Arrays.asList("Umbra", "Utopia", "Unwind", "Uplift", "Utter", "Umbrella", "Unique", "Upbeat", "Universe", "Unity")));
    mapping.put('V', new TreeSet<>(Arrays.asList("Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant", "Vortex", "Verdant", "Verve", "Voyage", "Virtue")));
    mapping.put('W', new TreeSet<>(Arrays.asList("Whisper", "Wander", "Wisp", "Willow", "Wavelength", "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower")));
    mapping.put('X', new TreeSet<>(Arrays.asList("Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor", "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox")));
    mapping.put('Y', new TreeSet<>(Arrays.asList("Yearning", "Yonder", "Yoga", "Yummy", "Yield", "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder")));
    mapping.put('Z', new TreeSet<>(Arrays.asList("Zephyr", "Zenith", "Zeal", "Zest", "Zing", "Zircon", "Zestful", "Zen", "Zeppelin", "Zany")));
    

	Scanner input = new Scanner(System.in);

	while (true)
	{
		System.out.println("1- Print");
		System.out.println("2- Insert");
		System.out.println("3- Remove word");
		System.out.println("4- Remove all");
		System.out.println("5- Get word");
		System.out.println("6- Search");
		System.out.println("7- Exit");
		System.out.println("Choose one of the menu:");

		int choice = input.nextInt();
		input.nextLine();

		switch (choice)
		{
			case 1:
				System.out.println("The Dictionary:");
				dic.printDictionary(mapping);
				break;
			case 2:
				System.out.println("Enter the words you want to insert:");
				String[] wordsArray = input.nextLine().split("\\s+");
				TreeSet<String> wordsToInsert = new TreeSet<>(Arrays.asList(wordsArray));
				dic.insert(mapping, wordsToInsert);
				break;
			case 3:
				System.out.println("Enter the word you want to remove:");
				String word = input.nextLine();
				dic.removeWord(mapping, word);
				break;
			case 4:
				System.out.println("Enter the letter you want to remove:");
				char key = input.next().toUpperCase().charAt(0);
				dic.removeAllKey(mapping, key);
				break;
			case 5:
				System.out.print("Enter the letter to get words for:");
				key = input.next().toUpperCase().charAt(0);
				System.out.println(dic.getWords(mapping, key));
				break;
			case 6:
				System.out.print("Enter the letters you want to search:");
				String substring = input.nextLine();
				dic.search(mapping, substring);
				break;
			case 7:
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please choose number from 1 to 7.");
		}
	}
    
    }
    
    
}
