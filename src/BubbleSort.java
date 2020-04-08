public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int j = 0; j < list.length - 1 && needNextPass; j++) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1 - j; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
