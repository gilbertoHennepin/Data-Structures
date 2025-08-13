
public class Main {
    public static void main(String[] args) {
        int[] heights = {198, 185, 210, 176, 195};
        bubbleSortDescending(heights);

        System.out.print("Sorted heights in descending order: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            for (int counter2 = 0; counter2 < n - 1 - counter1; counter2++) {
                if (arr[counter2] < arr[counter2 + 1]) { // Change comparison to descending order
                    int temp = arr[counter2];
                    arr[counter2] = arr[counter2 + 1];
                    arr[counter2 + 1] = temp;
                }
            }
        }
    }
}
