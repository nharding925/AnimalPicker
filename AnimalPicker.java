import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Which animal would you like to see? (dog/cat)");
        String choice = scanner.nextLine().toLowerCase();

        //print cat or dog
        if (choice.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } else {
            //error message
            System.out.println("Error: Invalid option. Please enter 'dog' or 'cat'.");
        }
    }
}
