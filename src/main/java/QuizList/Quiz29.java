package QuizList;
import java.util.*;

public class Quiz29 {
    public static void main(String[] args){
        SolutionQuiz29 method = new SolutionQuiz29();
        int a = 45; //1200  / 7
        int b =125;
        int answer = method.solution(a);
        System.out.println(answer);

    }

}


class SolutionQuiz29 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int remain = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            if(n<3){
                remain = n;
                break;
            }

            list.add(n%3) ;
            count++;


        }

        return answer;
    }
}