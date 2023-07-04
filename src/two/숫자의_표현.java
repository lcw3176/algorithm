package two;

public class 숫자의_표현 {

    public int solution(int n) {
        int count = 0;
        int startNumber = 1;

        while(true){
            int sum = 0;
            int i = startNumber;

            while(sum <= n){
                sum += i++;

                if(sum == n){
                    count++;
                    break;
                }
            }

            if(startNumber / 2 >= n){
                break;
            }

            startNumber++;
        }

        return count;
    }
}
