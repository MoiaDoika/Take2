package homework2;

public class MinusHundred {
    public static void main(String[] args) {
        Hundred();
    }
    static void Hundred(){
        int result= 0;
        System.out.print(result+", ");
        for (int i = 0; i <9; i++) {
            result-=5;
            System.out.print(result+", ");
        }
    }
}
