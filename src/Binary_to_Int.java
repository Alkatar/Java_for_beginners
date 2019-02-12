import java.util.Scanner;

public class Binary_to_Int {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Введите число в бинарном формате:");
        String Str = a.nextLine();

        int decimal = Integer.parseInt(Str, 2);

            System.out.printf("Число в десятичном формате = %d\n",decimal);
    }
}