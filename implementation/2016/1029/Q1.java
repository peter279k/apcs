import java.util.*;

public class Q1 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int arr[] = {a, b, c};
        Arrays.sort(arr);
        String msg = "";
        a = arr[0];
        b = arr[1];
        c = arr[2];
        if((a + b) <= c) {
            msg = "No";
        } else if(a * a + b * b < c * c) {
            msg = "Obtuse";
        } else if(a * a + b * b == c * c) {
            msg = "Right";
        } else if(a * a + b * b > c * c) {
            msg = "Acute";
        }

        System.out.println(a + " " + b + " " + c);
        System.out.println(msg);
    }
}
