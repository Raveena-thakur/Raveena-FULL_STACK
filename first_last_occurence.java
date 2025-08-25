public class first_last_occurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 4};
        int target = 2;

        int firstIndex = findFirstIndex(arr, target);
        int lastIndex = findLastIndex(arr, target);

        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
    }
    static int findFirstIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    static int findLastIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
