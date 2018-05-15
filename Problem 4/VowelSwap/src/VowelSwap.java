import java.util.Arrays;

public class VowelSwap {

    public static void main(String[] args) {
    char[] numbers = {'r','t','a','o','p','u'};
    System.out.println(Arrays.toString(numbers));
    vowelsBeforeConsonants(numbers);
    System.out.println(Arrays.toString(numbers));
    }

    public static void vowelsBeforeConsonants(char[] arr){
        char temp;
        boolean done = false;

        for(int pass = 1; pass < arr.length; pass++) {
            for (int i = arr.length-1; i > 0; i--) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
    }
}
