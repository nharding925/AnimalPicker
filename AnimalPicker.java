import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        //keep asking until valid input
        while (!choice.equals("dog") && !choice.equals("cat") && !choice.equals("fish") && !choice.equals("bunny")) {
            //user input
            System.out.println("Which animal would you like to see? (dog/cat/fish/bunny)");
            choice = scanner.nextLine().toLowerCase();

            //error message
            if (!choice.equals("dog") && !choice.equals("cat") && !choice.equals("fish") && !choice.equals("bunny")) {
                System.out.println("Error: Invalid option. Please enter 'dog', 'cat', 'fish', or 'bunny'.");
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
        } else if (choice.equals("bunny")) {
    } System.out.println(
        "             ,\n" +
        "            /|      __\n" +
        "           / |   ,-~ /\n" +
        "          Y :|  //  /\n" +
        "          | jj /( .^\n" +
        "          >-\"~\"-v\"\n" +
        "         /       Y\n" +
        "        jo  o    |\n" +
        "       ( ~T~     j\n" +
        "        >._-' _./\n" +
        "       /   \"~\"  |\n" +
        "      Y     _,  |\n" +
        "     /| ;-\"~ _  l\n" +
        "    / l/ ,-\"~    \\\n" +
        "    \\//\\/      .- \\\n" +
        "     Y        /    Y    \n" +
        "     l       I     !\n" +
        "     ]\\      _\\    /\"\\\n" +
        "    (\" ~----( ~   Y.  )\n" +
        "~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}
