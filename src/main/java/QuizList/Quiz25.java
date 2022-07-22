package QuizList;

public class Quiz25 {
    public static void main(String[] args){
        SolutionQuiz25 method = new SolutionQuiz25();

        long a = 121;
        long b = 3;

        long answer = method.solution(a);
        System.out.println(answer);

    }

}


class SolutionQuiz25 {
    public long solution(long n) {
        long answer = 0;  //제곱근은 double 써야함 / 실수이기때문!
        double sqrt = Math.sqrt(n);

        if(sqrt%1!=0){
            return -1;
        }

        answer = (long)Math.pow(sqrt+1,2);


        return answer;
    }
}