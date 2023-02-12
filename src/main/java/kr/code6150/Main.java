package kr.code6150;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // 0 <= x < 3 = 0 1 2
        try {
            RSP com = RSP.indexOf(2); // 0 1 2
            System.out.println("0. 가위 \n 1.바위 \n 2.보");
            System.out.print("입력 : ");
            int input = sc.nextInt();
            RSP user = RSP.indexOf(input);

            System.out.println("컴퓨터 : " + com.getKor());
            System.out.println("나 : " + user.getKor());

            if(com == user) System.out.println("비김");
            else if(user.isWinner(com)) System.out.println("이김");
            else System.out.println("짐");

        } catch (TypeNotFoundException e) {
            System.out.println("0 1 2 중에 하나만 입력하세요.");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력하세요.");
        }

    }

}

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        try {
//            sc.nextInt();
//            System.out.println("hi.");
//        } catch (InputMismatchException ime) {
//            System.out.println("숫자만 입력하세요.");
//        } catch (NullPointerException npe) {
//            System.out.println("잉기모리");
//        } finally {
//            //try-catch block 종료된 후 실행.
//            System.out.println("finally");
//        }
//        System.out.println("Program has successfully ended.");
//    }
//
//}
//    int a; // a - (인스턴스 클래스)
//    static int a; // a - (스태틱 변수)
//    class A { // A - 인스턴스 클래스

    //}

    //내부 클래스 (inner class)
    //클래스 안에 만들어진 클래스
    //GUI 어플리케이션(Swing, AWT) 이벤트 처리에 많이 사용됨.

    // 내부 클래스의 종류는 변수의 선언 위치에 따른 종류와 동일.

//    private int e; // 객체 생성시 함께 생성됨.
//    private static int o; // 프로그램이 이 코드를 읽을때 생성됨.

//    public static void main(String[] args) {
//
////        class B { //지역 클래스
////
////        }
//
//    }
