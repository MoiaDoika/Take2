package homework2;

public class Root {
    public static void main(String[] args) {
        Groot(4,3);
    }
    static void Groot(int x,int n){
        int j = 1;
        for(int i=0;i<n;i++) j*=x;
        System.out.println(j);
    }
}
