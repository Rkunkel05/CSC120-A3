import java.util.Scanner;
import java.lang.Math;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner input = new Scanner(System.in);
    // Get user input for number of rounds
    System.out.println("How many rounds of conversation do you want?: ");
    int a = input.nextInt();
    // Start conversation
    System.out.println("Hello! Welcome to the chatbot. What would you like to talk about?");
    Scanner userInput = new Scanner(System.in);
    // Generates a random number for the response
    int randomNum;
                        // WORKING ON...
                        // Check if pronouns in sentence
                        // Mirror pronouns in response 
                        // No pronouns? -> Canned response
                        // Based on the number, selects a possibel response 
    // Conversation continues while the user's request for conversation rounds is > 0
    while (a>0) {
      String convo = userInput.nextLine();
      String chatBot = convo;
      // Checks to see what pronouns are in the sentence and replaces them with mirrored ones
      // PROBLEM: ONLY DOES THIS FOR THE FIRST WORD IT CATCHES... How to make it check over EVERY word...?
      if (convo.contains("I")) { 
        chatBot=convo.replaceAll("I", "You"); }
      else if (convo.contains("Me")) {
        chatBot=convo.replaceAll("Me", "You"); }
      else if (convo.contains("My")) {
        chatBot=convo.replaceAll("My", "Yours"); }
      else if (convo.contains("You")) {
        chatBot=convo.replaceAll("You", "I"); }
      else if (convo.contains("Yours")) {
        chatBot=convo.replaceAll("Yours", "Mine"); }
      else if (convo.contains("am")) {
        chatBot=convo.replaceAll("am", "are"); }
      else if (convo.contains("are")) {
        chatBot=convo.replaceAll("are", "am"); }
      // If there are no pronouns, replies with a random canned response
      else {
        randomNum = (int) (Math.random() * 5) + 1;
        if (randomNum == 1) {
          System.out.println("Hm...");
        }
        else if (randomNum == 2) {
          System.out.println("Cool!");
        }
        else if (randomNum == 3) {
          System.out.println("Interesting!");
        }
        else if (randomNum == 4) {
          System.out.println("Fascinating...");
        }
        else if (randomNum == 4) {
          System.out.println("Huh!");
        }  
      }
      System.out.println(chatBot);
      a = a- 1;
    }
    userInput.close();
    input.close();
    System.out.println("Thanks for chatting!");


    // make a for loop that runs for (user input) amount of rounds
    // for (x rounds) {
      // conversation loop
      // user inputs something
      // chatbot replies w/ something else (depends on punctuation, pronouns, etc.)
      // exits loop when # of rounds met
    } 
  }

  

