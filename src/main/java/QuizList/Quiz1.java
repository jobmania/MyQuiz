package QuizList;
import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(5); //콘솔창에 숫자 작성
        int b = sc.nextInt(3); //콘솔창에 숫자 작성

        for (int i = 0; i < b; i++) { //띄어쓰기 구간
            for (int j = 0; j < a; j++) { //별 체크구간
                System.out.print("*"); //print = 띄어쓰기가 안됨
            }
            System.out.println(); // println = 띄어쓰기
        }


    }
}

//            System.out.println("*".repeat(a));
