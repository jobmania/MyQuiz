package TestList;
import java.util.Arrays;
import java.util.*;

public class Main4 {
    public static void main(String[] args){
        QuizMain4 method = new QuizMain4();
        int a = 718253;  //"3+5+2+8+1+7=26"
        System.out.println(method.solution(a));
    }
}

class QuizMain4 {
    public String solution(int n){

        int sum= 0;
        String str = String.valueOf(n);
        char[] sorts = str.toCharArray();

        for(int i = 0 ;i<sorts.length/2; i++){
            char temp = sorts[i];
            sorts[i] =  sorts[sorts.length-i-1];
            sorts[sorts.length-i-1] = temp;
        }
        for (char sort : sorts) {
            sum += sort- '0';
        }
        String sumToString = Integer.toString(sum);

        String answer = "";
        for (int i = 0 ; i< sorts.length;i++){
            if(i== sorts.length-1){
                answer += sorts[i]+"="+sumToString;
            }else {
                answer += sorts[i]+"+";
            }
        }
        return answer;
    }
}