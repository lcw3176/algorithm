package two;

public class 다음_큰_숫자 {

    public int solution(int n) {
        String originBinary = Integer.toBinaryString(n);
        int originCount = originBinary.length() - originBinary.replace("1", "").length();

        while(true){
            n++;

            String binary = Integer.toBinaryString(n);
            int count = binary.length() - binary.replace("1", "").length();

            if(originCount == count){
                break;
            }
        }

        return n;
    }
}
