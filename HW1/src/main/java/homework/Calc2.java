package homework;
import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetic mean calculator!");
        System.out.println("Enter number of numbers");
        int size = scanner.nextInt();//задаем количество элементов в массиве
        int[] numbers = new int[size];//передаем количество в массив
        System.out.println("Enter numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();//Заполняем массив нулевыми значениями
        }
       for (int i = 0; i < size; i++) {//заполняем из консоли
          double average = 0;//создание переменной ответ
            if (numbers.length > 0)//действие начинается если массив не пустой
            {
                double sum = 0;
                for (int j = 0; j < numbers.length; j++) {
                    sum += numbers[j];//вычисляем сумму всех элементов массива
                }
                average = sum / numbers.length;//сумму делим на количество элементов
           }System.out.println("Answer: "+average);
        }
    }
}
