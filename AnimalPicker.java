import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        //keep asking until valid input
        while (!choice.equals("dog") && !choice.equals("cat") && !choice.equals("fish")) {
            //user input
            System.out.println("Which animal would you like to see? (dog/cat/fish)");
            choice = scanner.nextLine().toLowerCase();

            //error message
            if (!choice.equals("dog") && !choice.equals("cat") && !choice.equals("fish")) {
                System.out.println("Error: Invalid option. Please enter 'dog', 'cat', or 'fish'.");
            }
        }

        //print cat, dog, or fish
        if (choice.equals("dog")) {
            System.out.println("   |\\|\\\r\n" +
                                "  ..    \\       .\r\n" +
                                "o--     \\\\    / @)\r\n" +
                                " v__///\\\\\\\\__/ @\r\n" +
                                "   {           }\r\n" +
                                "    {  } \\\\\\{  }\r\n" +
                                "    <_|      <_|");

        } else if (choice.equals("cat")) {
            System.out.println("        .                .                    \r\n" +
                                "       :\"-          .-\";                    \r\n" +
                                "       |:`.`.__..__.'.';|                    \r\n" +
                                "       || :-\"      \"-; ||                    \r\n" +
                                "       :;              :;                    \r\n" +
                                "       /  .==.    .==.  \\                    \r\n" +
                                "      :      _.--._      ;                   \r\n" +
                                "      ; .--.' `--' `.--. :                   \r\n" +
                                "     :   __;`      ':__   ;                  \r\n" +
                                "     ;  '  '-._:;_.-'  '  :                  \r\n" +
                                "     '.       `--'       .'                  \r\n" +
                                "      .\"-._          _.-\".                   \r\n" +
                                "    .'     \"\"------\"\"     `.                 \r\n" +
                                "   /`-                    -'\\                \r\n" +
                                "  /`-                      -'\\               \r\n" +
                                " :`-   .'              `.   -';              \r\n" +
                                " ;    /                  \\    :              \r\n" +
                                ":    :                    ;    ;             \r\n" +
                                ";    ;                    :    :             \r\n" +
                                "':_:.'                    '.;_;'             \r\n" +
                                "   :_                      _;                \r\n" +
                                "   ; \"-._                -\" :`-.     _.._    \r\n" +
                                "   :_          ()          _;   \"--::__. `.  \r\n" +
                                "    \\\"-                  -\"/`._           :  \r\n" +
                                "   .-\"-.                 -\"-.  \"\"--..____.'  \r\n" +
                                "  /         .__  __.         \\               \r\n" +
                                " : / ,       / \"\" \\       . \\ ; bug          \r\n" +
                                "  \"-:___..--\"      \"--..___;-\"");

        } else if (choice.equals("fish")) {
            System.out.println("       .\r\n" + //
                                "      \":\"\r\n" + //
                                "    ___:____     |\"\\/\"|\r\n" + //
                                "  ,'        `.    \\  /\r\n" + //
                                "  |  O        \\___/  |\r\n" + //
                                "~^~^~^~^~^~^~^~^~^~^~^~^~");
        }
    }
}