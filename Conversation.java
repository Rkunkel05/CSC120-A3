/* 
   Filename: Conversation.java
Description: Creates class Conversation that asks for how many rounds the chatbot will talk for. The chatbot
checks for pronouns and mirrors them, or if there are no pronouns, replies with a canned response. Prints a 
transcript of the conversation once the rounds are over
     Author: Rachel Kunkel
       Date: 13 February 2024  
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

class Conversation {
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);
        // Get user input for number of rounds
        System.out.println("How many rounds of conversation do you want?: ");
        int a = input.nextInt();
        // Makes a list to store the conversation in 
        List < String > conversation = new ArrayList < > ();


        //list of canned responses 
        String[] cannedResponses =  {
          "Hm...", 
          "Cool!", 
          "Interesting!", 
          "Fascinating!", 
          "Huh"
        };

        String intro;
        // Start conversation
        intro = "Hello! Welcome to the chatbot. What would you like to talk about?";
        conversation.add(intro);
        System.out.println(intro);
        Scanner userInput = new Scanner(System.in);
        // Initlizes a random int for the canned response
        int randomNum;
        // Conversation continues while the user's request for conversation rounds is > 0
        while (a > 0) {
            // Convo refers to what the user inputs (their conversation) - made lowercase for convenience
            String convo = userInput.nextLine().toLowerCase();
            // adds the chatbot's welcome to the transcript (conversation) list
            conversation.add(convo);
            // Chatbot string refers to what the chatBot is saying
            String chatBot = convo;
            // Splits the chatBot string by white space so each word is isoalted, split_Chatbot is the user's split input
            String[] split_chatBot = convo.split("\\s+");
            boolean pronouns = false;
            String response;
            // Establishes i as 0, and adds to i with each loop. Loops through so long as i is less than the length of split_chatBot.
            for (int i = 0; i < split_chatBot.length; i = i + 1) {
                // Checks to see what pronouns are in the sentence and replaces them with mirrored ones
                if (split_chatBot[i].equals("i")) {
                    split_chatBot[i] = "you";
                    pronouns = true;
                } else if (split_chatBot[i].equals("me")) {
                    split_chatBot[i] = "you";
                    pronouns = true;
                } else if (split_chatBot[i].equals("my")) {
                    split_chatBot[i] = "yours";
                    pronouns = true;
                } else if (split_chatBot[i].equals("you")) {
                    split_chatBot[i] = "I";
                    pronouns = true;
                } else if (split_chatBot[i].equals("yours")) {
                    split_chatBot[i] = "mine";
                    pronouns = true;
                }
                // check to see if pronouns are in sentence, and if they are, changes am/are to correspond correctly
                if (convo.contains("you") || convo.contains("i")); {
                  if (split_chatBot[i].equals("am")) {
                      split_chatBot[i] = "are";
                      pronouns = true;
                  } else if (split_chatBot[i].equals("are")) {
                      split_chatBot[i] = "am";
                      pronouns = true;
                    }
                }
            }
            // if pronouns is true, join together split_chatBot, keeping spaces, and prints it out. Decreases a by 1.
            if (pronouns) {
                chatBot = String.join(" ", split_chatBot);
                System.out.println(chatBot);
                conversation.add(chatBot);
            }
            // If there are no pronouns, replies with a random canned response
            else {
                // Generates a random number 1-5
                randomNum = (int)(Math.random() * 4) + 1;
                // selects a random number from the list cannedResponses and prints it
                response = cannedResponses[randomNum];
                System.out.println(response);
                // adds the canned response to the transcript list
                conversation.add(response);
            }
            a = a - 1;
            System.out.println(""); 
        }
        System.out.println("Thanks for chatting! \n");
        System.out.println("Transcript:");
        for (String topic: conversation) {
            // for each item in the conversation, print it out on its own line (\n)
            System.out.println(topic);
        }
        userInput.close();
        input.close();
    }
}