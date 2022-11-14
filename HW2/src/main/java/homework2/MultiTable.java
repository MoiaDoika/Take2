package homework2;

public class MultiTable {
    public static void main(String[] args) {
        Table(7);
    }
    static void Table(int x){
        int i =0;
        while(i<=10){
            int sum = x * i;
            System.out.println(x+" "+"*"+" "+i+" = "+sum);
            i++;
        }
    }
}
