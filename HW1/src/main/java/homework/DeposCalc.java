package homework;

import java.util.Arrays;

public class DeposCalc {
    public static void main(String[] args) {//Передаем значения в аргументы (12тыс,7%,5лет)
        System.out.println("Сумма депозита "+ args[0]);
        System.out.println("Процент "+args[1]);
        System.out.println("Срок депозита "+ args[2]+" лет.");
        int[]array = Arrays.asList(args).stream().mapToInt(Integer::parseInt).toArray();
        double impact = 0;
        for (int i = 1; i < array[2]; i++) {
            impact = array[0]*array[1]*array[2]/100;
            String result = String.format("%.2f",impact);
            System.out.println("Начисленный процент "+ result);
        }
        args[0] += impact;
        System.out.println(args[0]);
    }
}
