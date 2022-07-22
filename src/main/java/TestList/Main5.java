package TestList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;


public class Main5 {
    public static void main(String[] args) {

        Main5Quiz method = new  Main5Quiz();
        String[] arr = {"coke", "water", "glass", "dog", "dog",  "yogurt", "vitamin"};
        int n = 2;
        System.out.println(Arrays.toString(method.solution(arr, 2)));
        // 중복되어있는 이름을 지우고 문자의 n+1번째 알파벳순서대로 행렬을 재정렬하시오
        // 답은 [glass, yogurt, coke,  vitamin, water] dog는 중복되어 삭제.
    }
}

class Main5Quiz {
    public String[] solution(String[] arr, int n) {
        String[] answer = {};


        ArrayList<String> strList = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : arr)
        { map.put(name, map.getOrDefault(name, 0) + 1); }  // 해쉬함수 디폴트값입력 0 여기서는 있으면 +1

        for (String key : map.keySet())      // 모든 키를 불러온다.
        {  if (map.get(key) == 1) {            // 키의 값이 1이면 1명, 1초과면 중복자,
            strList.add(key);               // 중복제거해서 리스트 넣어주기
                 }
        }

        int many = strList.size();  //리스트 크기
        String arr123[] = strList.toArray(new String[many]); // {apple , watermelon~~~}
       // 중복 제거한 리스트 스트링 배열로 바꿔주기

        char[] word = new char[arr123.length];
        for (int i = 0;i<arr123.length;i++){
            for(int j=0; j<arr123[i].length();j++){
                word[i] = arr123[i].charAt(n) ;
            }
        }            // n번째숫자 char 에 넣어주기
                    // 각 배열의 문자에 대한 char 행렬

        for(int i=0; i<arr123.length; i++){
            for(int j =i+1; j<arr123.length;j++){
                if(word[i]>word[j]){  // n+1번째 자리의 행렬의 오름차순
                    char temp = word[i];
                    word[i]=word[j];
                    word[j] = temp;

                    String tempString = arr123[i];
                    arr123[i] = arr123[j];
                    arr123[j]= tempString;
                }
            }
        }

        return arr123;
    }
}
