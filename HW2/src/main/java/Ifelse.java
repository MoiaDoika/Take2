public class Ifelse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (a > b) {//в случае если а больше б мы выводим
            System.out.println("A is a greater than B");//первый вариант правда
        } else {//или мы выводим
            System.out.println("B is greater");//второй вариант ложь
        }

        if(a == 10){
            System.out.println("A = 10");//правда
        }if (b ==5){
            System.out.println("B = 5");//правда
        }  if (a<b){
                System.out.println("false");//ложь
            }if (a==b){
            System.out.println("false2");//ложь
        }if(a>b){
            System.out.println("true!");//правда
        }


        if (a<b){//проверка если работает до того момента пока не будет хоть одной истины
            System.out.println("a<b");//ложь
        }else if(a==b){
            System.out.println("a=b");//ложь
        }else if(a>b){
            System.out.println("a>b");//истина
        }else{
            System.out.println("true");//код не выполняется так-как истина уже найдена
        }


        // тернарный оператор
        int y = 10;
        int x = (y>5)?(2+y):(3+y);//в первых скобках условие, в остальных выполнение выводы под тру либо фолс
        System.out.println(x);
        int z = x==12 ? 33:22;// скобочки не обязательны
        int o = x==12 ? y==10 ? 55 : 33:22;//так лучше не записывать
        int p = (x==12) ?//если
                (y==10 ? 55 : 33)//то выполняется это
                :22;//или это
        //так намного читабельней
        System.out.println(o);
    }
}
//  if - можно перевести как если
