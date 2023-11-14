import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hi , what is your name :");
        Scanner name = new Scanner(System.in);
        String answer = name.nextLine();
        System.out.println("Okay : " + answer);
        System.out.println("I'm your chatbot. How can I help you?  ");
        System.out.println("1: Service ");
        System.out.println("2: product");
        String service=name.nextLine();
        if(service.equals("service")){

            System.out.println("if your answer service  enter service name");
            String yourName = name.nextLine();
            System.out.println("enter your phone address : ");
            String phoneNumber = name.nextLine();
            System.out.println("enter your email address : ");
            String email = name.nextLine();
            System.out.println("good: " );

            System.out.println("do you need more help:");
        }
    }
}
