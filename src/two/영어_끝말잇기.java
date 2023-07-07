package two;

import java.util.*;

public class 영어_끝말잇기 {

    public int[] solution(int n, String[] words) {
        Map<String, Boolean> map = new HashMap<>();

        String before = words[0].substring(0, 1);

        for(int i = 0; i < words.length; i++){
            String key = words[i];
            String startWord = key.substring(0, 1);

            if(map.containsKey(key) || !before.equals(startWord)){
                return new int[]{i % n + 1, i / n + 1};
            }

            String lastWord = key.substring(key.length() - 1);
            map.put(key, true);
            before = lastWord;
        }

        return new int[]{0, 0};
    }
}
