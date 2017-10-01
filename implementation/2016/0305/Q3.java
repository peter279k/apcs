import java.util.*;

class Q3 {

    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int lineNumber = input.nextInt();
        int num[] = new int[lineNumber*2];
        int countLine = 0;
        int numIndex = 0;
        for(int index=0;index<lineNumber;index++) {
            int startNum = input.nextInt();
            int endNum = input.nextInt();
            num[numIndex] = startNum;
            num[numIndex+1] = endNum;
            numIndex+=2;
        }
        int start = num[0];
        int end = num[1];
        int count = end - start;
        boolean checkCount = false;
        countLine += count;
        int currStart = 0;
        int currEnd = 0;
        for(int index=2;index<num.length;index+=2) {
            start = num[index];
            end = num[index+1];
            count = end - start;
            for(int preIndex=0;preIndex<index;preIndex+=2) {
                checkCount = false;
                int theStart = num[preIndex];
                int theEnd = num[preIndex+1];
                int setStart = 0;
                int setEnd = 0;
                int currArr[] = new int[end-start+1];
                int theArr[] = new int[theEnd-theStart+1];
                int tmpIndex = 0;
                for(int startVal=start;startVal<=end;startVal++) {
                    currArr[tmpIndex]= startVal;
                    tmpIndex++;
                }
                tmpIndex = 0;
                for(int startVal=theStart;startVal<=theEnd;startVal++) {
                    theArr[tmpIndex]= startVal;
                    tmpIndex++;
                }
                currStart = 0;
                currEnd = 0;
                for(tmpIndex=0;tmpIndex<currArr.length;tmpIndex++) {
                    for(int theTmpIndex=0;theTmpIndex<theArr.length;theTmpIndex++) {
                        if(currArr[tmpIndex] == theArr[theTmpIndex]) {
                            if(currStart == 0) {
                                currStart = currArr[tmpIndex];
                            }
                            if(currEnd == 0) {
                                currEnd = currArr[tmpIndex];
                            }
                        }
                    }
                }
            }
            countLine += (count - (currEnd - currStart));
            System.out.println(currEnd - currStart);
        }

        System.out.println(countLine);
    }
}

