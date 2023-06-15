package one;

public class 자릿수더하기 {

    public int solution(int n) {
        String value = Integer.toString(n);
        int answer = 0;

        for(char i : value.toCharArray()){
            answer +=  Character.getNumericValue(i);
        }

        return answer;
    }
}
