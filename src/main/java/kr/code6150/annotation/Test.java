package kr.code6150.annotation;

public class Test {



    @TestAnnotation("test1 function")
    public void test1() {
        System.out.println("test1 call");
    }
    @TestAnnotation("test2 function")
    public void test2() {
        System.out.println("test2 call");
    }
    public void test3() {
        System.out.println("test3 call");
    }

}
