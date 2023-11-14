import java.util.Scanner;

public class UserChatbotInteraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! I'm a simple chatbot. Type 'bye' to exit.");

        String userMessage;
        int x=5;
        while (3<x) {
            // User's turn
            System.out.print("You: ");
            userMessage = scanner.nextLine();

            if ("bye".equalsIgnoreCase(userMessage)) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break; // Exit the loop when the user says 'bye'
            }

            // Chatbot's turn
            if (userMessage.toLowerCase().contains("how are you")) {
                System.out.println("Chatbot: I'm just a computer program, but I'm doing well. Thanks for asking!");
            } else if (userMessage.toLowerCase().contains("what is your name")) {
                System.out.println("Chatbot: I'm a simple chatbot.");
            } else {
                System.out.println("Chatbot: I'm sorry, I don't understand that. Ask me 'how are you' or 'what is your name', or type 'bye' to exit.");
            }
        }

        scanner.close();
    }
}
