import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String responseQuestion = "Sure.";
        String responseExclamation = "Whoa, chill out!";
        String responseEmpty = "Fine. Be that way!";
        String responseDef = "Whatever";

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to ABA: Ask Bob Anything!");
            System.out.println("What would you like to ask Bob?");
            String userFeedback = scanner.nextLine();

            System.out.println("Your input: " + userFeedback);
            break;
        }while(true);
    }
}
