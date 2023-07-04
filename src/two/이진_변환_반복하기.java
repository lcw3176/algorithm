package two;

import java.util.ArrayDeque;
import java.util.Deque;

public class 이진_변환_반복하기 {

    public int[] solution(String s) {
        int count = 0;
        int numberOfZero = 0;

        while(!s.equals("1")){
            int size = s.length();
            s = s.replace("0", "");
            size -= s.length();

            s = Integer.toBinaryString(s.length());

            numberOfZero += size;
            count++;
        }

        return new int[]{count, numberOfZero};
    }
}
