import java.util.*;

public class Q2 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int team = input.nextInt();
        int numberTeam = input.nextInt();
        int arr[] = new int[team];
        int nums[] = new int[team * numberTeam];
        int teamIndex = 0;
        for(int index=1;index<=team;index++) {
            for(int indexTeam=1;indexTeam<=numberTeam;indexTeam++) {
                int num = input.nextInt();
                nums[teamIndex] = num;
                teamIndex++;
            }
        }
        teamIndex = 0;
        for(int index=0;index<nums.length;index+=numberTeam) {
            int numberTeamIndex=0;
            int max = nums[index+numberTeamIndex];
            for(;numberTeamIndex<numberTeam;numberTeamIndex++) {
                max = Math.max(max, nums[index+numberTeamIndex]);
            }
            arr[teamIndex] = max;
            teamIndex++;
        }
        int sum = 0;
        String mod = "";
        for(int index=0;index<arr.length;index++) {
            sum += arr[index];
        }
        for(int index=0;index<arr.length;index++) {
            if(sum % arr[index] == 0) {
                if(index != arr.length-1) {
                    mod += arr[index] + " ";
                } else {
                    mod += arr[index];
                }
            }
        }

        System.out.println(sum);
        if(mod.length() == 0) {
            System.out.println("-1");
        } else{
            System.out.println(mod);
        }

    }
}
