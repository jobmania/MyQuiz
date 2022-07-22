package javaStudy;

public class StringMethodExam {

    public static void main(String[] args) {
//        String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());  // 문자 수 세기
        System.out.println(str.concat(" world")); // 문자 합치기
        System.out.println(str);
        str=str.concat(" world");
        System.out.println(str);
        System.out.println(str.substring(3)); // 글자 자르기
        System.out.println(str.substring(3,7));
    }
}
