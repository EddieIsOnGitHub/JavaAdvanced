package algorithm.binary_search;

public class Example {
    public static void main(String[] args) {
        // Binary search example
        // Given the sorted array, write a function that
        // returns the index for the given element


        findTarget(0,5,8);

    }
    static int[] nums = {2, 4, 6, 8, 10, 12};
    // int target = 8;
    static void findTarget ( int start, int end, int target){
        if (start > end) {
            System.out.println("Value not found");
        }

        int middle = (start + end)/2;
        if (nums[middle] == target) {
            System.out.println("Value found at " + middle);
        }

        if (nums[middle] > target) {
            findTarget(start, middle - 1, target);
        }

        if (nums[middle] < target) {
            findTarget(middle + 1, end, target);
        }
    }
}
