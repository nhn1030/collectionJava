package util;

public class GList <T> {
// 참조가 가능할 수 있도록 wrapper 형식이거나, 클래스 형식으로만 가능 값 형식 x

    private Object[] nums;
    private int current;

    public GList() {
        nums = new Object[3];
        current = 0;
    }
    public void add(T num) {
        nums[current] = num;
        current++;


    }

    public void clear() {
        current = 0;

    }

    public int size() {
        return current;

    }

    public T get(int index) {

        if (current < index)
            throw new IndexOutOfBoundsException();
        return (T)nums[index];
    }
}

