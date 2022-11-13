package homework2;

public class MassNegative {
    public static void main(String[] args) {
        Mass();
    }
    static void Mass(){
        int[] myArray = new int[10];
        int sum = myArray.length*2;
        for (int i = 0; i <= sum; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
