public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 9, 1, 0, 2, 4, 6, 8};
        HeapSort.sort(array);
        for (int item: array) {
            System.out.print(item + " ");
        }

    }

}