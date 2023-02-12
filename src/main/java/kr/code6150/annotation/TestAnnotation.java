package kr.code6150.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface TestAnnotation {

    public String value() default "hello annotation";

}
