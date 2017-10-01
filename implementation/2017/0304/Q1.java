import java.util.*;

public class Q1 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int odd = 0;
        int even = 0;
        for(int index=0;index<str.length();index++) {
            if(index % 2 == 0) {
                even += Integer.parseInt(String.valueOf(str.charAt(index)));
            } else {
                odd += Integer.parseInt(String.valueOf(str.charAt(index)));
            }
        }
        System.out.println(Math.abs(even-odd));
    }
}
