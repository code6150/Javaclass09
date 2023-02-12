package kr.code6150.annotation;

import java.lang.reflect.Method;

public class AnnoMain {

    public static int total(int... x) {
        int total = 0;
        for(int i : x) {
            total += i;
        }
        return total;
    }



    public static void main(String[] args) {

        // variable argument[가변인자] = 인자의 수가 변함이 있다.
        // 가변인자는 반드시 매개변수의 가장 끝에 위치해야 한다.
        try {
            Method method = Test.class.getDeclaredMethod("test1", Integer.class,String.class, Double.class);
            System.out.println(method.getName());
        } catch (NoSuchMethodException nsme) {
            throw new RuntimeException(nsme);
        }
        System.out.println(total(10,10));

    }
//        //reflection (리플렉션)
//        Method[] methods = Test.class.getMethods();
//
//        for(Method method: methods) {
//            //Optional#isPreasent() : ~가 있는 경우??
//            //Runtime
//            if(method.isAnnotationPresent(TestAnnotation.class)) {
//                //함수는 기본저그올 첫 번째 인자로 클래스 자기 자신을 가진다.
//                method.invoke();
//            }
//        }

}
