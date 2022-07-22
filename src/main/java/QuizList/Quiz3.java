package QuizList;

public class Quiz3 {
    public static void main(String[] args){
        SolutionQuiz3 method = new SolutionQuiz3();
        String  a = "adcde";
        String b  = "abcd";
        System.out.println(method.solution(b));
    }

}



class SolutionQuiz3 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length%2==0){
            answer= s.substring(length/2-1,length/2+1);
        }else{

            answer= s.substring(length/2,length/2+1);
        }

        return answer;
    }
}