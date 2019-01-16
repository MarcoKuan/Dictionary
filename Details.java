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

  // Getter methods
  public ArrayList<String> getPOS() {
    return partsOfSpeech;
  }

  public ArrayList<String> getDefinition() {
    return definition;
  }

  // toString method
  // Ex: "[number]. ([part of speech]) [definition]"
  public String toString() {
    String message = "";

    for (int i = 0; i < definition.size(); ++i) {
      message += (i + 1) + "." + " (" + partsOfSpeech.get(i) + ") " + definition.get(i) + "\n";
    }

    return message;
  }
}