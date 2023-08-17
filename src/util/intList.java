package util;

public class intList {


    private int[] nums;
    // 정수 배열 멤버 변수 nums를 정의함
    private int current;
    // 정수 변수인 current를 선언하여 현재 배열에 저장된 요소의 수를 추적
    public intList() {
        nums = new int[3];
        current = 0;

        // intList 생성자 메서드. nums를 3개의 정수 배열 변수로 초기화하고, current 값을 0으로 초기화 함
    }
    public void add(int num) {
        nums[current] = num;
        current++;

        // 정수 값을 받아 배열에 추가하는 메서드임
        // nums의 [current] 번째에 해당하는 위치에 num을 저장하게 됨
        // 저장한 후 current 값을 증가 시켜 저장소 위치를 이동시킴
    }

    public void clear() {
        current = 0;
        // clear 메서드는 배열 내의 모든 요소를 없애주는 기능을 하는 것 같지만 그렇지않음
        // 배열의 인덱스 정보를 나타내는 [current]를 0의 위치로 초기화 함으로
        // 배열의 인덱스가 0번째 부터 다시 값을 받을 수 있게함
    }

    public int size() {
        return current;

        // size메서드는 current를 반환하여, 현재까지 생성된 current의 인덱스 정보를 통해
        // 배열의 size를 계산해주는 메서드임.
        // size는 current와 동일함

    }

    public int get(int index) {

        if (current < index)
            throw new IndexOutOfBoundsException();
        return nums[index];
    }

    // get은 정수 배열의 인덱스 요소를 가져오는 메서드
    // 외부에서 받아온 매개 값을 이용하여
    // 만약, current 값이 매개변수인 index 보다 작다면
    // IndexOutOfBoundsException 예외를 던진다.
    // 아니라면 nums[index] index번째의 요소를 return한다.


}

