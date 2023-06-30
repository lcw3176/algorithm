package two;

public class 최댓값과최솟값 {

    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(String i : s.split(" ")){
            int value = Integer.parseInt(i);
            min = Math.min(min, value);
            max = Math.max(max, value);
        }


        return min + " " + max;
    }

}
