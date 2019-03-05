import java.util.Scanner;

public class Removing_Spaces {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = l.nextLine();
        String result = str.replaceAll("\\s","");
        System.out.println( "Строка без пробелов:\n" + result);

    }
}