import java.util.*;

public class Q3 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        int people = input.nextInt();
        int perNumber = input.nextInt();
        int boomTime = input.nextInt();
        int luckyNumber = 0;

        int persons[] = new int[people];
        for(int index=1;index<=people;index++) {
            persons[index-1] = index;
        }

        int currIndex = 0;
        int boomIndex = 0;
        for(int index=1;index<=people;index++) {
            for(int theIndex=currIndex;theIndex<persons.length;theIndex++) {
                if(persons[theIndex] == 0) {
                    continue;
                }
                if(boomIndex == perNumber-1) {
                    System.out.println("boom: " + persons[theIndex]);
                    persons[theIndex] = 0;
                    currIndex = theIndex;
                    boomIndex = 0;
                    break;
                }
                boomIndex += 1;
                if(theIndex == persons.length-1) {
                    currIndex = 0;
                    break;
                }
            }
        }
        int countNum = 0;
        for(int index=0;index<persons.length;index++) {
            if(persons[index] != 0) {
                luckyNumber = persons[index];
                countNum += 1;
            }
        }

        // output the result
        boomIndex = 0;
        if(countNum == 1) {
            System.out.println(luckyNumber);
        } else {
            for(int theIndex=currIndex;theIndex<persons.length;theIndex++) {
                if(persons[theIndex] == 0) {
                    continue;
                }
                if(boomIndex == perNumber-1) {
                    System.out.println("boom: " + persons[theIndex]);
                    persons[theIndex] = 0;
                    currIndex = theIndex;
                    boomIndex = 0;
                    luckyNumber = persons[theIndex];
                    break;
                }
                boomIndex += 1;
                if(theIndex == persons.length-1) {
                    currIndex = 0;
                    break;
                }
            }
            System.out.println(luckyNumber);
        }
    }
}
