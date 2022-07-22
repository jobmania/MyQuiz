package QuizList;
import java.util.Arrays;

public class Quiz14 {
    public static void main(String [] args){
        SolutionQuiz14 method = new SolutionQuiz14();
        int [] arr1 = {5,9,7,10};
        int d1 = 5;
        int [] arr2 = {2,36,1,3};
        int d2 = 1;
        int [] arr3 = {3,2,6};
        int d3 = 10;

        System.out.println(Arrays.toString(method.solution(arr3,d3)));


    }

}



class SolutionQuiz14 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                count++;
            }
        }

        if(count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }

        for(int i =0; i<answer.length;i++){
            for(int j =i+1; j<answer.length;j++){
                if(answer[i]>answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j]= temp;
                }
            }
        }

//        Arrays.sort(answer);


//         배열 import 안쓰고 풀기 오름차순


        return answer;
    }
}