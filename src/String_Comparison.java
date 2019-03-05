import java.util.Scanner;

public class String_Comparison {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = l.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = l.nextLine();


        if (str1.length() > str2.length())
            System.out.println( "Длиннее первая строка:\n" + str1);
        else if (str1.length() < str2.length())
            System.out.println( "Длинее вторая строка:\n" + str2);
        else
            System.out.println( "Строки равны по длине");

    }
}