import java.util.ArrayList;
import java.util.List;
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
    // Initlizes a random int for the canned response
    int randomNum;
    // Makes a list to store the conversation in 
    List<String> conversation = new ArrayList<>();
    // Conversation continues while the user's request for conversation rounds is > 0
    while (a>0) {
      // Convo refers to what the user inputs (their conversation)
      String convo = userInput.nextLine().toLowerCase();
      // Chatbot string refers to what the chatBot is saying
      String chatBot = convo;
      // Splits the chatBot string by white space so each word is isoalted 
      String[] split_chatBot = convo.split("\\s+");
      boolean pronouns = false;
      String response;
      // Establishes i as 0, and adds to i with each loop. Loops through so long as i is less than the length of split_chatBot.
      for (int i = 0; i < split_chatBot.length; 
           i=i+1) {
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
        // check to see if pronouns are in sentence, and if they are, changes am/are to correspond correctly
        if (convo.contains("you") || convo.contains("i")); {
          if (split_chatBot[i].equals("am")) {
            split_chatBot[i] = "are";
            pronouns = true;} 
          else if (split_chatBot[i].equals("are")) {
            split_chatBot[i] = "am"; 
            pronouns = true;} }
        }
      // if pronouns is true, join together split_chatBot, keeping spaces, and prints it out. Decreases a by 1.
      if (pronouns) {
        chatBot = String.join(" ", split_chatBot);
        System.out.println(chatBot);
        conversation.add(chatBot);
        a = a-1;}
        // If there are no pronouns, replies with a random canned response
      if (pronouns == false) {
        // Generates a random number 1-5
        randomNum = (int) (Math.random() * 5) + 1;
        if (randomNum == 1) {
          response = "Hm...";
          System.out.println(response);
          conversation.add(response);
          }
        else if (randomNum == 2) {
          response = "Cool!";
          System.out.println(response);
          conversation.add(response);
          }
        else if (randomNum == 3) {
          response = "Interesting!";
          System.out.println(response);
          conversation.add(response);
          }
        else if (randomNum == 4) {
          response = "Fascinating!";
          System.out.println(response);
          conversation.add(response);
          }
        else if (randomNum == 5) {
          response = "Huh!";
          System.out.println(response);
          conversation.add(response);
          }  
        a = a- 1;
        pronouns = false;
        }
      }
    userInput.close();
    input.close();
    System.out.println("Thanks for chatting!");
    System.out.println(conversation);
    }
    }

  

