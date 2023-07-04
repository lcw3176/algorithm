package two;

import java.util.*;

public class 올바른_괄호 {

    public boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char i : s.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == '(' && i == ')'){
                stack.pop();
            } else {
                stack.push(i);
            }
        }

        return stack.isEmpty();
    }
}
