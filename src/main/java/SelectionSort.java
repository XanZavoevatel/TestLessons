import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] values = {4,6,8,1,3,8,3,2};
        SelectionSort.selectionSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void selectionSort(int[] values) {
        int[] result = new int[values.length];
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            result[i] = i == 0 ? searchMin(values, minVal) : searchMin(values, result[i - 1]);
        }


        System.arraycopy(values, 0,result, 0, result.length);
    }

    public  static int searchMin(int[] arr, int minV) {
        int minValue = minV;
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }
}
