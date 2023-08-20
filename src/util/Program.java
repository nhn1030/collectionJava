package util;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //GList <Integer> list = new GList(); // 꺾음쇄가 들어감으로써, 제네릭을 사용한다고 명명
        // intList 자료형의 참조 변수인 list를 생성

        List<Integer> list = new ArrayList<>();

        list.add(3);
        // 인스턴스 메서드 add 사용 0번째 위치에 3을 저장

        list.add(5);
        // 인스턴스 메서드 add 사용 1번째 위치에 5를 저장

        list.add(5);

        list.add(6);


        int size = list.size();
        // main 함수 내부에 정수형 size를 생성 인스턴스 메서드 size의 값을 대입

        System.out.printf("size : %d\n", size);
        // size의 값을 출력하는 기능 3과 5가 배열에 저장되었으니 size는 2가 나올 것

        list.clear();
        // clear 메서드 사용

        size = list.size();
        // 배열의 인덱스가 0번째로 초기화 되었기 때문에 0을 반환
        // 실제로는 0, 1번째 인덱스에 3과 5가 인덱스의 요소로 저장되어 있으며,
        // 다음 add 메서드 호출 시 새로운 값으로 덮어쓰게 될 것

        System.out.printf("size : %d\n", size);

        list.add(7);
        int num = list.get(0);
        System.out.printf("num : %d\n", num);

////        num = list.get(2);
//        // 해당 메서드는 index 값이 list의 current 값 보다 크기 때문에
//        // IndexOutOfBoundsException 예외를 반환한다.
//        System.out.printf("num : %d\n", num);

    }
}
