package TestList;
import java.util.Arrays;

public class Main3 {
    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {

        for(int i=0; i< arr1.length;i++ ){
            for(int j=0; j<arr1[i].length;j++){
                if(signs[i][j]){
                    arr1[i][j]= arr1[i][j]+arr2[i][j];
                }else {
                    arr1[i][j]=-arr1[i][j]-arr2[i][j];
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        Main3 method = new Main3();
        int[][] arr1 = {{5,7,1},{2,3,5}};  //10 8 -7  -9 8 -11
        int[][] arr2 = {{5,1,6},{7,5,6}};
        boolean[][] signs={{true,true,false},{false,true,false}};
        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
    }
}