package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        int newVal = 3;
        addFirst(arr, newVal);

        System.out.println(Arrays.toString(arr));

        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);

        System.out.println(Arrays.toString(arr));
        int addValue = 5;
        addLast(arr, addValue);

        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(final int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = newValue;
    }

    public static void addFirst(int[] arr, int newVal) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = newVal;
    }
}
