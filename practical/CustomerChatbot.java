import java.util.Scanner;

public class CustomerChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.println("=================================");
        System.out.println(" Welcome to Customer Care Chatbot ");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nYou: ");
            userInput = sc.nextLine().toLowerCase();

            // Greetings
            if (userInput.contains("hello") || userInput.contains("hi")) {

                System.out.println("Bot: Hello! How can I help you today?");
            }

            // Product Information
            else if (userInput.contains("product")) {

                System.out.println("Bot: We provide laptops, mobiles, and accessories.");
            }

            // Price Inquiry
            else if (userInput.contains("price")) {

                System.out.println("Bot: Prices start from ₹10,000 depending on the product.");
            }

            // Delivery Information
            else if (userInput.contains("delivery")) {

                System.out.println("Bot: Delivery usually takes 3 to 5 business days.");
            }

            // Payment Options
            else if (userInput.contains("payment")) {

                System.out.println("Bot: We accept UPI, Credit Card, Debit Card, and Net Banking.");
            }

            // Contact Support
            else if (userInput.contains("support")) {

                System.out.println("Bot: You can contact support at support@gmail.com");
            }

            // Exit Condition
            else if (userInput.contains("bye")) {

                System.out.println("Bot: Thank you for visiting. Have a nice day!");
                break;
            }

            // Unknown Queries
            else {

                System.out.println("Bot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}