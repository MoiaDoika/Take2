import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        String frog = "BlackFrog";
        System.out.println(frog.length());
        // метод для нахождения длины строки
        String rabbit = "CrazyRabbit";
        //Создание переменной String
        char CrazyRabbit[] = rabbit.toCharArray();
        //Создание массива CrazyRabbit из char символов, благодаря методу toCharArray и прошлой переменной rabbit.
        System.out.println(CrazyRabbit[2]);
        //Выводим один из символов в массиве
        System.out.println(Arrays.toString(CrazyRabbit));
        //Благодаря методу Arrays выводим все символы в виде массива
        System.out.println(rabbit.isEmpty());
        // метод isEmpty определяет является ли массив пустым, либо нет
        System.out.println(rabbit.length() == 0);
        // Тоже самое но через сравнение с нулем
        String variable = "         car       ";
        System.out.println(variable);
        System.out.println(variable.trim());
        //Метод trim убирает все пробелы в начал и в конце переменной.
        System.out.println(variable.replace("c","w"));
        //Метод замены символов так машина стала войной....
        String str1 = new String(new char[]{'s','t','r','i','n','g'});
        System.out.println(str1);
        String str2 = new String(new char[]{'s','t','r','i','n','g'},3,2);
        System.out.println(str2);
        // Еще 2 варианта создания String перменной в последнем варианте мы отсчитываем 3 символа, а после уже начинаем отсчет на 2 символа на вывод.
        String button = "  ";
        System.out.println(button.isEmpty());
        System.out.println(button.isBlank());
        //Проверяем на наличие пробелов
        String zero = null;
        System.out.println(Objects.isNull(zero));
        //Проверяет на null
        System.out.println(frog.concat(" ").concat(rabbit));
        System.out.println(frog+" "+rabbit);
        //Конкатенация - соединение
        System.out.println(String.join(" - ", rabbit, frog, str1, str2));
        //Соединение всех перечисленных переменных стринг через определенный символ в одну строку.
        System.out.println(String.valueOf(3000000L));
        // изменение переменной типа лонг в перменную типа стринг
        System.out.println("string".equals("string"));
        System.out.println("String".equals("string"));
        //сравнение по эквивалентности
        System.out.println("String".equalsIgnoreCase("string"));
        System.out.println("String".toLowerCase(Locale.ROOT).equals("string".toLowerCase(Locale.ROOT)));
        //приводит все в ловер кейс и сравнивает
        String tellNumber = "380687080522";
        System.out.println(tellNumber.startsWith("380"));
        //Проверка на начинается ли с (аргумент)
        String idol = "HELL";
        System.out.println(idol.toLowerCase(Locale.ROOT));
        String idol2 = "hell";
        System.out.println(idol2.toUpperCase(Locale.ROOT));
        //Приведение типа в нижний и верхний реестр

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        // Происходит работа со Стринг пулом в первых вул случаях обе переменные ссылаются на один и тот же обьект в пуле, а в 3 случае создается новый обьект в хипи поэтому они не могут быть раны так как имеют разный хешкод
        s3.intern();
        System.out.println(s1 == s2);
        //благодаря методу интерм происходит перенос обьекта из хипа в стринг пул(оператор нью гарантирует создание обьекта именно в хипе)

        int numb = 3;
        numb++;
        System.out.println(numb);
        //инкремент
        numb--;
        System.out.println(numb);
        //дикримент

        System.out.println(2 + numb--);
// постфиксная форма как мы видим результат изменятся только после выполнение выражения 2+3=5 - получаем ответ и только потом отнимаем единицу значение намб =4
        System.out.println(2 + --numb);
        //в данной ситуации наоборот изначальное значение намб 4 и перед тем как выполнить выражение мы отнимаем единицу получается 2+(4-1) = 3
        //это называется постфиксная и префиксная форма



    }
}
