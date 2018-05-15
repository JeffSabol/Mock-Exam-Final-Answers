import java.util.*;

public class Shorten {

    public static void main(String[] args){

        int[] arr = {3, 7, 7, 7, 3, 6, 6, 14};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 7, 7, 3, 6, 6, 14));
        System.out.println(list);
        shorten(list);
        System.out.println(list);
    }

    public static void shorten(ArrayList<Integer> list) {
        int index = 0;
        while(index < list.size()) {
            int next = index + 1;
            int count = 1;
            while(next < list.size() && list.get(index) == list.get(next)) {
                count++;
                list.remove(next);
            }
            if(count > 1) {
                list.set(index, count * list.get(index));
            }
            index++;
        }
    }
}
