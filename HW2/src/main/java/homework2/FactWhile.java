package homework2;

public class FactWhile {
    public static void main(String[] args) {
        System.out.println(FactorWhile(4));
    }
    static int FactorWhile(int n){
        int result = 1;
        int i = 0;
        while (i < n) {
            i++;result *= i;
        }
        return  result;
    }
}
