package util;

public class program {
    public static void main(String[] args) {
        intList list = new intList();
        list.add(3);
        list.add(5);


        int size = list.size();
        System.out.printf("size : %d\n", size);

        list.clear();
        size = list.size();
        System.out.printf("size : %d\n", size);

        list.add(7);
        int num = list.get(0);
        System.out.printf("num : %d\n", num);
        num = list.get(2);
        System.out.printf("num : %d\n", num);
    }
}
