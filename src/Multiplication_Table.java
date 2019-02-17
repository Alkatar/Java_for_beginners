import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {


        Scanner l = new Scanner(System.in);

        System.out.println("Введите любое число и нажмите Enter:");
        int x = l.nextInt();
        System.out.println("Таблица умножения для числа " + x + ":\n");
        System.out.println(x + "*1 = " +x +"\n");
        System.out.println(x + "*2 = " +x*2 +"\n");
        System.out.println(x + "*3 = " +x*3 +"\n");
        System.out.println(x + "*4 = " +x*4 +"\n");
        System.out.println(x + "*5 = " +x*5 +"\n");
        System.out.println(x + "*6 = " +x*6 +"\n");
        System.out.println(x + "*7 = " +x*7 +"\n");
        System.out.println(x + "*8 = " +x*8 +"\n");
        System.out.println(x + "*9 = " +x*9 +"\n");
        System.out.println(x + "*10 = " +x*10 +"\n");
    }
}