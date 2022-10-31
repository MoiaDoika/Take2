package homework;
import java.util.Scanner;
//В данной программе мы нашли средне арифметическое число из 2-ух чисел
public class Calc1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прием данных из консоли
        System.out.println("Input first number");
        int a = scanner.nextInt();
        System.out.println(a +" - First number");
        System.out.println("Input second number");
        int b = scanner.nextInt();
        System.out.println(b +" - Second number");
        int c = (a + b)/2;
        System.out.println("Answer: "+ c);
        //Нахождение средне арифметического числа из 2-ух чисел
    }
}
