package dictionary;

import java.util.*;

public class SimpleWordDictionary {
    private Map<Character, SortedSet<String>> wordsMap;

    public SimpleWordDictionary() {
        wordsMap = new TreeMap<>();
        // Initialize entries for all 26 alphabets
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            wordsMap.put(letter, new TreeSet<>());
        }
    }

    public void addWords(String[] words) {
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                wordsMap.get(firstLetter).add(word);
            }
        }
    }

    public void printAllLettersAndWords() {
        wordsMap.forEach((letter, words) -> {
            System.out.println("Letter: " + letter);
            System.out.println("Words: " + String.join(", ", words));
            System.out.println("--------------------");
        });
    }

    public void printWordsOfGivenLetter(char letter) {
        letter = Character.toUpperCase(letter);
        SortedSet<String> words = wordsMap.get(letter);

        if (words != null) {
            System.out.println("Words for letter " + letter + ": " + String.join(", ", words));
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }

    public void removeWord(String word){
        char letter=Character.toUpperCase(word.charAt(0));
        SortedSet<String> wordsSet =wordsMap.get(letter);

        // Check if the set exists and contains the word
        if (wordsSet != null && wordsSet.contains(word)) {
            wordsSet.remove(word);
            System.out.println("Word '" + word + "' removed successfully.");
        } else {
            // Throw an exception if the word doesn't exist
            throw new IllegalArgumentException("Word '" + word + "' not found in the dictionary.");
        }
    }
    public void removeAll(char ch){
        wordsMap.get(ch).clear();
    }

    public void search(String searchString) {
        System.out.println("Matching words:");
    
        char letter = Character.toUpperCase(searchString.charAt(0));
        SortedSet<String> wordsSet = wordsMap.get(letter);
    
        if (wordsSet != null) {
            for (String word : wordsSet) {
                if (word.toLowerCase().contains(searchString.toLowerCase())) {
                    System.out.println(word);
                }
            }
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }
    
    

    public static void main(String[] args) {
        SimpleWordDictionary dictionary = new SimpleWordDictionary();

        // Sample words
        String[] aWords = {"Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant"};
        String[] bWords = {"Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful"};
        String[] cWords = {"Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon"};
        String[] dWords = {"Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly"};
        String[] eWords = {"Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral"};
        String[] fWords = {"Fairy", "Flame", "Fiesta", "Frost", "Floral", "Firefly", "Fascinate", "Fable", "Feather", "Flicker"};
        String[] gWords = {"Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy", "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter"};
        String[] hWords = {"Harmony", "Heavenly", "Honey", "Harbor", "Hope", "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth"};
        String[] iWords = {"Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate", "Impulse", "Incandescent", "Ingenious", "Ineffable"};
        String[] jWords = {"Jubilant", "Jade", "Journey", "Joyful", "Jazz", "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular"};
        String[] kWords = {"Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet", "Kale", "Kudos", "Kiss", "Kittens", "Knight"};
        String[] lWords = {"Lagoon", "Luminous", "Lullaby", "Lavender", "Lively", "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac"};
        String[] mWords = {"Majestic", "Mystic", "Moonlight", "Melody", "Mirth", "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty"};
        String[] nWords = {"Nebula", "Nectar", "Nirvana", "Noble", "Nurturing", "Nautical", "Novel", "Nuance", "Nebulous", "Nestle"};
        String[] oWords = {"Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic", "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx"};
        String[] pWords = {"Peach", "Pristine", "Petal", "Panorama", "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle"};
        String[] qWords = {"Quasar", "Quaint", "Quell", "Quest", "Quiver", "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench"};
        String[] rWords = {"Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous", "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture"};
        String[] sWords = {"Serene", "Sapphire", "Serenade", "Symphony", "Sparkle", "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan"};
        String[] tWords = {"Tranquil", "Twilight", "Tender", "Tropical", "Talisman", "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure"};
        String[] uWords = {"Umbra", "Utopia", "Unwind", "Uplift", "Utter", "Umbrella", "Unique", "Upbeat", "Universe", "Unity"};
        String[] vWords = {"Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant", "Vortex", "Verdant", "Verve", "Voyage", "Virtue"};
        String[] wWords = {"Whisper", "Wander", "Wisp", "Willow", "Wavelength", "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower"};
        String[] xWords = {"Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor", "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox"};
        String[] yWords = {"Yearning", "Yonder", "Yoga", "Yummy", "Yield", "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder"};
        String[] zWords = {"Zephyr", "Zenith", "Zeal", "Zest", "Zing", "Zircon", "Zestful", "Zen", "Zeppelin", "Zany"};

        // Add words to the dictionary
        dictionary.addWords(aWords);
        dictionary.addWords(bWords);
        dictionary.addWords(cWords);
        dictionary.addWords(dWords);
        dictionary.addWords(eWords);
        dictionary.addWords(fWords);
        dictionary.addWords(gWords);
        dictionary.addWords(hWords);
        dictionary.addWords(iWords);
        dictionary.addWords(jWords);
        dictionary.addWords(kWords);
        dictionary.addWords(lWords);
        dictionary.addWords(mWords);
        dictionary.addWords(nWords);
        dictionary.addWords(oWords);
        dictionary.addWords(pWords);
        dictionary.addWords(qWords);
        dictionary.addWords(rWords);
        dictionary.addWords(sWords);
        dictionary.addWords(tWords);
        dictionary.addWords(uWords);
        dictionary.addWords(vWords);
        dictionary.addWords(wWords);
        dictionary.addWords(xWords);
        dictionary.addWords(yWords);
        dictionary.addWords(zWords);
        // Add words to the dictionary
        dictionary.addWords(xWords);

        // Print all letters and corresponding words
        System.out.println("All Letters and Words:");
        dictionary.printAllLettersAndWords();
        System.out.println();

        // Print words of a given letter
        char letterToPrint = 'a';
        System.out.println("Words for Letter " + letterToPrint + ":");
        dictionary.printWordsOfGivenLetter(letterToPrint);
    }
}
