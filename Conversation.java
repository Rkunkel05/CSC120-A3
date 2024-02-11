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
    // Conversation continues while the user's request for conversation rounds is > 0
    while (a>0) {
      // Convo refers to what the user inputs (their conversation)
      String convo = userInput.nextLine().toLowerCase();
      // Chatbot string refers to what the chatBot is saying
      String chatBot = convo;
      // Splits the chatBot string by white space so each word is isoalted
      String[] split_chatBot = convo.split("\\s+");
      // Establishes i as 0, and adds to i with each loop. Loops through so long as i is less than the length of split_chatBot.
      
      boolean pronouns = false;
      for (int i = 0; i < split_chatBot.length; i++) {
      // Checks to see what pronouns are in the sentence and replaces them with mirrored ones
        if (split_chatBot[i].equals("i")) { 
          split_chatBot[i] = "you";
          pronouns = true; }
        else if (split_chatBot[i].equals("me")) {
          split_chatBot[i] = "you"; 
          pronouns = true;}
        else if (split_chatBot[i].equals("my")) {
          split_chatBot[i] = "yours";
          pronouns = true; }
        else if (split_chatBot[i].equals("you")) {
          split_chatBot[i] = "I"; 
          pronouns = true;}
        else if (split_chatBot[i].equals("yours")) {
          split_chatBot[i] = "mine";
          pronouns = true; }
        else if (split_chatBot[i].equals("am")) {
          split_chatBot[i] = "are";
          pronouns = true;}
        else if (split_chatBot[i].equals("are")) {
          split_chatBot[i] = "am"; 
          pronouns = true;} }
      if (pronouns) {
        chatBot = String.join(" ", split_chatBot);
        System.out.println(chatBot);
        a = a-1;}

        // If there are no pronouns, replies with a random canned response
        if (pronouns == false) {
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
        a = a- 1;
        pronouns = false;
        }
      }
    userInput.close();
    input.close();
    System.out.println("Thanks for chatting!");
    }

    }

  

