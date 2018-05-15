import java.util.*;

public class Flip {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("DDD");
        list.add("happy");
        list.add("snow");
        System.out.println(list);
        flip2(list);
        System.out.println(list);
    }
    public static void flip2(ArrayList<String> list){
        String line = "";
        for(int i = 0; i < list.size()-1; i+=2){
            line = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1, line);
        }
    }
}
