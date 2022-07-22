package QuizList;
import Test123.Subway;

import java.util.*;;

public class Quiz24 {
    public static void main(String[] args){
        SolutionQuiz24 method = new SolutionQuiz24();
        SolutionQuiz24_2 method2 = new SolutionQuiz24_2();
        SolutionQuiz24_3 method3 = new SolutionQuiz24_3();
        long n = 118372;   // 873211
        long n1 = 4512;    // 5421
//        long answer = method.solution(n);
//        System.out.println(answer);
        long answer = method3.solution(n);
        System.out.println(answer);

    }
}



class SolutionQuiz24 {
    public long solution(long n) {

        String str = String.valueOf(n);  // 문자로 변환
        String strArray[] = str.split(""); // 배열로 변환
        int[] array = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray(); // 의미를 잘모르겟다
        // long으로 바꾸는 것을 못찾아 int로 바꾸고 변환
        // stream은  array , list , array_list 를 형을 구에받지 않고 바꿔준다. ;;


        //https://gogoma.tistory.com/36

        for(int i = 0; i < array.length; i++){
             for(int j = i+1; j < array.length; j++){
                 if(array[i] < array[j]){
                     int temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }
             }
         }

        str = Arrays.toString(array).replaceAll("[^0-9]","");
        // 스트링으로 치환


        return Long.parseLong(str); // 롱으로 변환환
    }
}


class SolutionQuiz24_2{
    public long solution(long n) {
        char[] sort = String.valueOf(n).toCharArray(); // Spring형식을  char배열로 변환.
        int tmp = 0;
        for(int i=0; i<sort.length; i++) {
            for(int j=i+1; j<sort.length; j++) {
                if(sort[i] < sort[j]) {
                    tmp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = (char) tmp;
                }
            }
        }
        System.out.println(sort);
        return Long.parseLong(String.valueOf(sort));
    }

}

class SolutionQuiz24_3{
    public long solution(long n){
        long  answer = 0;
        String str = String.valueOf(n);
        char[] sorts = str.toCharArray();


        for(int i=0; i<sorts.length; i++){
            for(int j = i+1; j<sorts.length; j++){
                if(sorts[i] < sorts[j]){
                    char num = sorts[i];
                    sorts[i] = sorts[j];
                    sorts[j] = num;
                }
            }

        }
        System.out.println(sorts);
        str = String.valueOf(sorts);
        answer = Long.parseLong(str);





        return answer;
    }
}