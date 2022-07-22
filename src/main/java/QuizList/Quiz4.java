package QuizList;

public class Quiz4 {
    public static void main(String[] args){
        SolutionQuiz4 method = new SolutionQuiz4();
        int a = 3;
        int b = 5;
        System.out.println(method.solution(3,5));
    }
}

class SolutionQuiz4 {
    public long solution(int a, int b) {
        long answer = 0;
        if (b >= a){
            for(long i=a; i<b+1; i++){
                answer = answer + i;
            }
        }else {
            for(int i=b; i<a+1; i++){
                answer = answer + i;
            }
        }
        return answer;
    }
}