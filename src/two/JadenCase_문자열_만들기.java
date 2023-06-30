package two;


public class JadenCase_문자열_만들기 {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isUpper = true;

        for(char i : s.toCharArray()){

            if(!isUpper){
                i = Character.toLowerCase(i);
            }

            if(isUpper){
                i = Character.toUpperCase(i);
                isUpper = false;
            }

            if(Character.isWhitespace(i)){
                isUpper = true;
            }

            sb.append(i);
        }


        return sb.toString();
    }
}
