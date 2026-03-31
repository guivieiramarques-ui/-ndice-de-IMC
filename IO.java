import java.util.Scanner;

public class IO {
    private static Scanner scanner = new Scanner(System.in);

    public static String readln(String frase) {
        System.out.println(frase);
        return scanner.nextLine();
    }
}