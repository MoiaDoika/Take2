package homework;

import java.util.Arrays;

public class DeposCalc {
    public static void main(String[] args) {//Передаем значения в аргументы (12тыс,7%,5лет)
        System.out.println("Deposit amount "+ args[0]);
        System.out.println("Percent "+args[1]);
        System.out.println("Deposit term "+ args[2]+" years.");//выводим данные на экран
        double[]array = Arrays.asList(args).stream().mapToDouble(Double::parseDouble).toArray();//конвертируем массив аргументов в массив интов
        double impact = 0;
        for (int i = 1; i <= array[2]; i++) {//запускаем отсчет на 5 лет
            impact = ((array[0] / 100) * array[1]);//вычисляем годовую прибыль
            System.out.println("Accumulated interest per year "+impact);
            double monthSum = (int) (impact / 12);//вычисляем ежемесячную прибыль
            array[0] += impact;//вычисляем итоговую сумму в конце года
            System.out.println("Monthly impact throughout the year "+monthSum);
            System.out.println("Total amount at the end of the year "+array[0]);
            System.out.println("---------------------------------------");
        }
    }
}
