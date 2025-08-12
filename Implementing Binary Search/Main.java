
public class BinarySearchChallenge {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 20, 30, 40, 50};
        int target = 20; 
        
        
        boolean multiple = hasMultipleOccurrences(arr, target);
        System.out.println("Has Multiple Occurrences: " + multiple);
    }

   
    public static boolean hasMultipleOccurrences(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

      
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                
                int leftIndex = mid - 1;
                while (leftIndex >= 0 && arr[leftIndex] == target) {
                    return true;
                }

                
                int rightIndex = mid + 1;
                while (rightIndex < arr.length && arr[rightIndex] == target) {
                    return true; 
                }

               
                return false;
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        
        return false;
    }
}



