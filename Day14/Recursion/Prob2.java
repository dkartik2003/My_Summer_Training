package Day14.Recursion;

public class Prob2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 50};
        int target = 50;
        int ans = returnIndex(target, arr, 0);
        System.out.println(ans);
    }

    public static int returnIndex(int target, int arr[], int index) {
        // Base case: If index exceeds the array length, element not found
        if (index >= arr.length) {
            return -1;
        }

        // If the current element is equal to the target, return its index
        if (arr[index] == target) {
            return index;
        }

        // Recursive call to search in the rest of the array
        return returnIndex(target, arr, index + 1);
    }
}
