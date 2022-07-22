package QuizList;
import java.util.*;
import java.util.Collections;


public class Quiz26 {
    public static void main(String[] args){
    SolutionQuiz26 method = new SolutionQuiz26();
        int [] arr = {4,3,2,1}; // [4,3,2]
        int [] arr2 = { 10};  // [-1]
        int [] arr3 = {89,2,256,4,5}; // {89,2,1,4,5}
        int [] answer = method.solution(arr3);
        System.out.println(Arrays.toString(answer));

    }

}

class SolutionQuiz26 {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }
        int min = arr[0]; // 아무 숫자나 정함
        int answer[] = new int[arr.length-1];
        ArrayList<Integer> list = new ArrayList<Integer>();//타입설정 int타입만 사용가능

        for(int num : arr ){    // 최솟값 구하기
            if(min > num){
                min = num;
            }
        }



        for(int i =0; i<arr.length; i++){
            if(arr[i]!=min) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);

        Integer minimum = Collections.min(list);  // list중 가장 작은 수 출력함! import java.util.Collections;  해야함..
        System.out.println(minimum);                //

        for(int i = 0; i< answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;

    }
}