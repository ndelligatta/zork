import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class CommandChecker {

    public static void main(String[] args) {

        String input = "";
        System.out.print("Enter command: ");
        Scanner s = new Scanner(System.in);
        input = s.next();

        String[] commands = new String[]{"take", "north", "east", "south", "west", "read", "exit"};
        List<String> commList = Arrays.asList(commands);

        if (commList.contains(input))
            System.out.println(input);
        else {
            System.out.println("Invalid command: " + input);

        }

    }
}