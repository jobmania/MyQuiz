package QuizList;
import java.util.*;;

public class Quiz7 {
    public static void main(String[] args){
        SolutionQuiz7 method = new SolutionQuiz7();
        int [] array1 = {4,7,12};
        boolean[] array1_1 = {true,false,true};
        int answer = method.solution(array1,array1_1);
        System.out.println(answer);
    }

}


class SolutionQuiz7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum = 0;

        for(int i =0; i<signs.length;i++){
            if(signs[i]){
                sum = sum+absolutes[i];
            }else{
                sum = sum-absolutes[i];
            }
        }
        answer = sum;
        return answer;
    }
}