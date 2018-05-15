import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.math.*;
public class HashCode {

    public static void main(String[] args) {
        String line = "7 7 77";
        System.out.println(hashCode(line));

    }

    public static String hashCode(String line) {
        Scanner sc = new Scanner(line);
        int temp;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            temp = sc.nextInt();
            list.add(temp);
            list2.add(temp);
        }
        int sum1 =0;
        for(int i = 0; i <list.size(); i++){
            list.set(i, list.get(i) / 10);
            sum1 += list.get(i);

        }
        int sum2 = 0;
        for(int i = 0; i < list2.size(); i++){
            list2.set(i, list2.get(i) % 10);
            sum2 += list2.get(i);
        }
        String total = ""+sum1+""+sum2;
        return total;
    }
}
