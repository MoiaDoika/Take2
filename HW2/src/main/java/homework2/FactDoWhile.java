package homework2;

public class FactDoWhile {
    public static void main(String[] args) {
        System.out.println(FactorDoWhile(4));
    }
    static int FactorDoWhile(int n){
        int result = 1;
        int i = 0;
        do{i++;result *= i;
        }
        while (i < n);
        return  result;
    }
    }
