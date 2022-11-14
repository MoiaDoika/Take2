package homework2;
import java.lang.Math;
import com.google.common.primitives.Ints;


public class ArraysNeg {
    public static void main(String[] args) {
        Arrays(5);

    }
    static int[] Arrays(int n){
        int[] myArray = new int[n];
        int min =0;
        int max = 100;
        int mon = 0;
        int range = max - mon + 1;
        for (int i = 0; i < myArray.length; i++) {
            int rand = (int)(Math.random() * range) + mon;
            myArray[i]= rand;
            for (int j = 0+1; j < myArray.length ; j++) {
                if(rand>myArray[j]){
                   min = rand;
                }
            }System.out.println(min);
        }return myArray;
    }
}

