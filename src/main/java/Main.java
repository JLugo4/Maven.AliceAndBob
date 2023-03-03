import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name(s)");
        String name1 = scanner.nextLine();
        if (name1.equals("Alice") || (name1.equals("Bob"))) {
            System.out.println("Hello " + name1 + " how are you?");
        }

    }
}
