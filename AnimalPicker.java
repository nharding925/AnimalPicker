import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        //keep asking until valid input
        while (!choice.equals("dog") && !choice.equals("cat")) {
            //user input
            System.out.println("Which animal would you like to see? (dog/cat)");
            choice = scanner.nextLine().toLowerCase();

            //error message
            if (!choice.equals("dog") && !choice.equals("cat")) {
                System.out.println("Error: Invalid option. Please enter 'dog' or 'cat'.");
            }
        }
        //print cat or dog
        if (choice.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        }
    }
}