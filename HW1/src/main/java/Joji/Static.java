package Joji;

public class Static {
        public static int variable;
        public int variable2;
    //Это поле (главные характеристики класса)
/*
        public static void crash(){
                System.out.println(variable2);
                show();
        }
        К сожалению мы не можем вывести данную переменную так-как она имеет значение сразу нескольких экземпляров класса.
        К методу мы так-же обратится не можем...
        */

        public void show(){
                System.out.println("No");
                //crash();
                //Но мы можем обратится к статик методу из вне так-как он все равно общий параметр класса.

                /*Так-же через "return" можно передавать исходное значение в переменную.
                Например

                        public static int God(){
                        System.out.println("Выполняется блок кода");
                        }return 1;

                        static {
                        variable = God();
                        }
                 */
        }
}
