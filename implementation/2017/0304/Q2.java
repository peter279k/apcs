import java.util.*;

public class Q2 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int arr[] = new int[length];
        int record[] = new int[length];
        for(int index=0;index<length;index++) {
            int num = input.nextInt();
            arr[index] = num;
            record[index] = 0;
        }
        ArrayList<Integer> friends = new ArrayList<Integer>();
        int friendGroupCount = 0;
        int index = 0;

        for(;index<length;index++){
            if(record[index] == 0) {//沒有拜訪過
                if(arr[index] == index) {//好朋友只有自己
                    friendGroupCount++;
                    record[index] = 1;
                } else {
                    int next = index;
                    while(record[next] == 0) {
                        record[next] = 1;
                        next = arr[next];
                    }
                    friendGroupCount++;
                }
            }
        }

        System.out.println(friendGroupCount);
    }
}
