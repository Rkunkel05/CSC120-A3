import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner input = new Scanner(System.in);
    // Get user input for number of rounds
    System.out.println("How many rounds of conversation do you want?: ");
    int a = input.nextInt();
    input.close();
    // Start conversation
    System.out.println("Hello! Welcome to the chatbot. What would you like to talk about?");
    // Conversation continues while the user's request for conversation rounds is > 0
    while (a>0); {
      Scanner userInput = new Scanner(System.in);
      String convo = userInput.nextLine();
      System.out.println("Hm..."); // Won't print chatbot's response
      a = a- 1; // Doesn't seem to actually change a...
      userInput.close(); // Probably need to close this outside of the while loop...?
    }


    // make a for loop that runs for (user input) amount of rounds
    // for (x rounds) {
      // conversation loop
      // user inputs something
      // chatbot replies w/ something else (depends on punctuation, pronouns, etc.)
      // exits loop when # of rounds met
    } 
  }

  

