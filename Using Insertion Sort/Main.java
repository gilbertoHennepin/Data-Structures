
public class Main {
    public static void main(String[] args) {
        // Sample list of test scores
        int[] testScores = {85, 92, 78, 96, 89, 73, 91};
        
        // Call the method to sort in descending order
        selectionSortDescending(testScores);
        
        // Print the sorted scores
        System.out.print("Test scores sorted in descending order: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            // Find the maximum element in the unsorted part of the array
            int maxIndex = counter1;
            for (int counter2 = counter1 + 1; counter2 < n; counter2++) {
                if (arr[counter2] > arr[maxIndex]) {
                    maxIndex = counter2;
                }
            }
            // Swap the found maximum element with the first element of the unsorted part
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[counter1];
            arr[counter1] = temp;
        }
    }
}


