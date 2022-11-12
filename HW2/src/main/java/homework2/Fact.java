package homework2;

public class Fact {
    public static void main(String[] args) {
        System.out.println(Factor(28));
    }
    
    static int Factor(int n){
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
            return  result;
        }
    }

