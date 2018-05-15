import java.util.*;
import java.io.*;

public class Index {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner fileIn = new Scanner(new File("compare.txt"));
        matchIndex(fileIn);
    }

    public static void matchIndex(Scanner sc){
        String firstLine = sc.nextLine();
        int c = 1;

        while(sc.hasNextLine()){
            String indexes = "";
            c++;
            String newLine = sc.nextLine();
            for(int i = 0; i < newLine.length(); i++){
                if(newLine.charAt(i) == firstLine.charAt(i))
                    indexes += i + " ";
            }
            System.out.println("target and " +c+ ": " + ((indexes == "") ? "none" : indexes));
        }
    }
}
