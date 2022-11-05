public class While {
    public static void main(String[] args) {
        While();
        DoWhile();
    }
    static void While(){
        byte a = 100;
        byte result = 0;
        while (a<=100){//условие
            System.out.println(a++);//в случае если параметр на момент выполнения подходит под условие то блок выполняется
        }//если бы а изначально было равно 101 то Sout a++ не был бы выполнен и ответ бы остался 101
        //сначала проверка блока на соответствие потом его выполнение
        System.out.println("------");
        System.out.println(a);//конечный ответ после выхода из цикла
        System.out.println(result);
    }

    static void DoWhile(){
        byte a = 99;
        byte result = 0;
        do{
            System.out.println(a++);//do блок выполнится еще 1 раз после проверки
        }
        while (a<=100);//условие выполнения цикла
            System.out.println("-------");
        System.out.println(a);
        System.out.println(result);
        }
    }

