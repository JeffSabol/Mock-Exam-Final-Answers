import java.util.*;
import java.io.*;

public class Money {

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("money.txt");
        Scanner fileIn = new Scanner(file);
        countMoney(fileIn);
    }

    public static void countMoney(Scanner sc){
        int num = 0;
        String bill = "";
        int total = 0;
        boolean flag = false;
        while(sc.hasNext()) {
            if (!flag) {
                num = sc.nextInt();
                flag = true;
            }
            else {
                flag = false;
                bill = sc.next();
                switch (bill) {
                    case "bucks":
                        total += num;
                        break;
                    case "fives":
                        total += num * 5;
                        break;
                    case "tens":
                        total += num * 10;
                        break;
                    case "twenties":
                        total += num * 20;
                        break;
                    case "fifties":
                        total += num * 50;
                        break;
                    case "hundreds":
                        total = num * 0;
                        System.out.println("Bills over 50 not taken! Set total to 0."); //Sets total to 0 for security
                        break;
                    default:
                        total = 0;
                        System.out.println("Invalid input. Set total to 0."); //Sets total to 0 for security
                        break;
                }
            }
        }
        System.out.println("Total money: $" + total);
    }

}
