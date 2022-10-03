package Joji;
//import Joji.*; - импорт всех классов из пакета
//import Joji.Static; - импорт определенного класса
/* В каждом классе может быть только 1 класс с модификатором "public" и его назавние должно совпадать с названием файла */

import java.sql.SQLOutput;

public class StaticMain {
    public static void main(String[] args) {
        Static qwer = new Static();
        Static qwert = new Static();
        Static qwerty = new Static();

        qwer.variable = 8;
        qwerty.variable = 11;

        System.out.println(qwer.variable);
        System.out.println(qwert.variable);
        System.out.println(qwerty.variable);

        /*
        Код предоставленный выше это вид дурного тона кодера, как правильно при обозначении переменной из статик класса,
        необходимо упоминать сам класс.
         */

        Static.variable = 15;
        //Теперь мы задали общее значение для поля всех экземпляров класса.
        System.out.println(qwerty.variable);
    }
}

/*
 Несмотря на то, что мы дали разные значения всем экземплярам класса они все равно имеют одно значение в нашем случае 11.
 Сие действие как осуществляется благодаря модификатору "static".
 */