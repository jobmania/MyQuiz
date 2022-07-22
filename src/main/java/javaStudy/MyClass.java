package javaStudy;

public class MyClass {

    public void method1(){
        System.out.println("m1:입출구가 없는 변수형");
    }

    public void method2(int x){
        System.out.println(x+"m2;입구있고 출구 없다");
    }
    public int method3(){
        System.out.println("m3;입구가 없고 출구 있따.");
        return 10;
    }

    public void method4(int x, int y){
        System.out.println(x+y+"m4;입구가 2개지요");
    }
    public int method5(int y){
        System.out.println(y+"m5;입출구 1개씩 존재");
        return y*2;
    }
}
