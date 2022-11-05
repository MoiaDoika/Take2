public class FORI {
    public static void main(String[] args) {
        ForI();
        ForEach();
        Continue();
    }

    static void ForI(){
        int a = 1;
        for (int i = 0; i < 10; i++) {
            a += 2;
        }
        System.out.println(a);

    }
   
   static void ForEach(){
       int[]numbers = {5,10,11,3,8};
       for (int i = 0; i < numbers.length; i++) {
           System.out.println(numbers[i]);//for i первый вариант как пройти по всему массиву
       }
       System.out.println("----------------------------");
       for (int number : numbers) {//начал указывается тип данных потом имя новой переменной и название массива по которому мы хотим пройтись
           System.out.println(number);//for each второй вариант как пройти по всему массиву
       }
   }
    static void Continue(){//работа с continue
            int j= 0;
            while(j<10){
                if (j % 2 !=0){//если j делится на 2 ноне равно 0, то мы увеличиваем на единицу
                    j++;
                    continue;//в случае если тут 1,3,5,7 то continue позволяет вывести сообщение на экран и продолжает работу(тоесть выходит и заходит обратно)
                }else if (j == 8){
                    break;//break заканчивает цикл по условию если j равен 8
                }
                System.out.print(j++ + " ");
            }
    }
}
