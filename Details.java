import java.util.ArrayList;
import java.util.Scanner;

public class Details {

  // Instance variables
  private Scanner reader;
  private ArrayList<String> partsOfSpeech;
  private ArrayList<String> definition;

  // Constructor
  public Details(Scanner read) {
    reader = read;
    partsOfSpeech = new ArrayList<String>();
    definition = new ArrayList<String>();
  }

  // Method that adds Parts of Speech
  public void addPOS() {
    System.out.print("Add a Part of Speech: ");
    partsOfSpeech.add(reader.nextLine());
  }

  // Method that adds definition
  public void addDefinition() {
    System.out.print("Add a definition: ");
    definition.add(reader.nextLine());
  }
}