import java.util.*;

class Q1 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int arr[] = new int[count];
        for(int index=0;index<arr.length;index++) {
            arr[index] = input.nextInt();
        }
        Arrays.sort(arr);

        int maxWorst = 0;
        int minPass = 0;
        boolean checkWorst = false;
        boolean checkPass = false;
        for(int index=0;index<arr.length;index++) {
            if(arr[index] < 60 && maxWorst == 0) {
                maxWorst = arr[index];
                checkWorst = true;
            } else if(arr[index] < 60) {
                maxWorst = Math.max(maxWorst, arr[index]);
            } else if(arr[index] >= 60 && minPass == 0) {
                minPass = arr[index];
                checkPass = true;
            } else {
                minPass = Math.min(minPass, arr[index]);
            }
        }

        // output the results
        for(int index=0;index<arr.length;index++) {
            System.out.print(arr[index]);
            if(index != arr.length-1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        if(checkWorst) {
            System.out.println(maxWorst);
        }

        if(!checkWorst) {
            System.out.println("best case");
        }

        if(checkPass) {
            System.out.println(minPass);
        }

        if(!checkPass) {
            System.out.println("worst case");
        }

    }
}
