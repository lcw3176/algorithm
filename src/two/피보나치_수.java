package two;

import java.util.*;
public class 피보나치_수 {

    public int solution(int n) {
        List<Integer> fibbo = new ArrayList<>();
        fibbo.add(0);
        fibbo.add(1);
        int answer = 0;

        for(int i = 2; i <= n; i++){
            int value = fibbo.get(i - 1) + fibbo.get(i - 2);
            value %= 1234567;
            fibbo.add(value);
        }

        return fibbo.get(n);
    }

}
