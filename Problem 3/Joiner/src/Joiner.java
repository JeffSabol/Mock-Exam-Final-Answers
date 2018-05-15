import java.util.*;

public class Joiner {

    public static void main(String[] args){
        String[] arr1 = {"Splinter", "Leo", "April", "Don", "Raph"};
        String[] arr2 = {"Krang", "Shredder", "Bebop"};
        System.out.println(Arrays.toString(joiner(arr1, arr2)));

    }

    public static String[] joiner(String[] a1, String[] a2){
        int length = (a1.length <= a2.length) ? a1.length : a2.length;
        String[] a3 = new String[length];
        for(int i = 0; i < a3.length; i++){
            if(a1[i].length() >= a2[i].length())
                a3[i] = a1[i]+a2[i];
            else
                a3[i] = a2[i]+a1[i];
        }
        return a3;
    }

}
