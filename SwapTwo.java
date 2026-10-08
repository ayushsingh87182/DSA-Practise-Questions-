import java.util.ArrayList;
public class SwapTwo {
    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Before swap: " + arr);
        swap(arr, 0, 4);
        System.out.println("After swap: " + arr);
    }
}
