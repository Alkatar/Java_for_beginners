import java.util.Scanner;

public class Input_String {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = l.nextLine();

        System.out.println( "Вы ввели:\n" + str);

    }
}