
import java.util.Scanner;

public class Comparison_with_Const {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Введите число t и нажмите Enter:");

        float t = l.nextFloat();

        float x = 5;
        float y = 6;
        float z = 18;

        if (t==x || t==y || t==z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}