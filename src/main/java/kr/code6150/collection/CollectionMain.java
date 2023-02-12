package kr.code6150.collection;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {
        //List, Set, Map

        //제네릭 - 클래스만 넣을 수 있다.
        //int, double, float, long, byte, shor, boolean, char (x)
        //implementation

        //dictionary
        //[key] - [value]

        Map<String, Integer> map = new HashMap<>();
        map.put("연필", 500);
        map.put("지우개", 1000);

        System.out.println(map.get("김밥"));

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");

    }

}
