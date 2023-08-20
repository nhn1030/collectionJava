package util;

import java.util.*;

public class NewProgram {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);

        System.out.println(list.get(5));



        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(7);
        set.add(7);

        System.out.println(set.add(8));
        // set.add는 boolean type을 반환하기 때문에 중복되는 수가 아니라면
        // true를 중복된다면 false를 반환한다.

        Map<String, Integer> map = new HashMap<>();
        map.put("id", 3);





        for (int i = 0; i < list.size(); i++)
            System.out.printf("%d,",list.get(i));
    }
}
