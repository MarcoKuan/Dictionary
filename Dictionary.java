import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
  
  // Instance variables
  private HashMap<String, Details> words;   // holds the word, part of speech, and definition
  private Scanner reader;   // gets the input from the user
  
  public Dictionary(Scanner read) {
    words = new HashMap<String, Details>();
    reader = read;
  }
  
  // Adds the word, part of speech, and definition to the hashmap
  public void addWord() {
    String word, partOfSpeech, definition;
    
    // Get user input
    System.out.print("Enter a word you wish to add: ");
    word = reader.nextLine();
    word = getFormalText(word);   // changes first letter to capital and rest to lowercase

    boolean exists = checkAllLowerCase(word);   // check if there is another version that has the same spelling

    if (exists) {
      Details wordDetails = new Details(reader);
      wordDetails.addPOS();     // gets the part of speech
      wordDetails.addDefinition();    // gets the definition
      words.put(word, wordDetails);
    } else {
      System.out.println("\nERROR: The word you entered exists. Consider adding a new definition and part of speech.\n");
      return;
    }
  }
  
  // Print each word from the key
  public void printWords() {
    int i = 1;
    
    if (!words.isEmpty()) {
      System.out.println("\t----\tWords\t----\n");
      
      for (String eachWord : words.keySet()) {
        System.out.println(i + ": " + eachWord);
        ++i;
      }
      
      System.out.println("\n\t--------------------\n");
    }
  }
  
  // Checks if the user typed a lower case version of the word
  // Returns true if it doesn't exist  |  false if it does exist
  private boolean checkAllLowerCase(String word) {
    word = word.toLowerCase();

    // Check each key by lowercasing it
    for (String eachKey : words.keySet()) {
      eachKey = eachKey.toLowerCase();   // convert to lowercase

      if (eachKey.equals(word)) {
        return false;
      }
    }

    return true;
  }

  // Returns the formal version of the text (first letter is capital and the rest is lowercased)
  private String getFormalText(String word) {
    word = word.toLowerCase();    // converts all to lowercase
    word = word.substring(0, 1).toUpperCase() + word.substring(1);    // changes first letter to capital

    return word;
  }
}