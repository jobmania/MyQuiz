package QuizList;

public class Quiz2 {
    public static void main(String[] args){
        SolutionQuiz2 method = new SolutionQuiz2();
        int a = 3;
        int b = 4;
        String answer = method.solution(b);
        System.out.println(answer);


    }

}


class SolutionQuiz2 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}