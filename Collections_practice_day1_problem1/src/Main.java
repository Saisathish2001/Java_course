import java.util.Arrays;

//problem1: Find the second largest element* in an array
public class Main {
    public static void main(String[] args) {
        //problem1: Find the second largest element in an array
        int[] array = {12, 3, 5, 6, 7, 310, 4, 67};
        FindSecondLargest s =new FindSecondLargest();
        int n=s.findSecondLargest(array);
        System.out.println("Second largest element: " + n);
        System.out.println("----------------------------------");

        //problem 2:Check if an array is *sorted & rotated*

          /*Array	Explanation   [3, 4, 5, 1, 2]	Sorted → rotated ✅
          [1, 2, 3, 4, 5]  Sorted but not rotated (still valid in most problems)
          [2, 3, 4, 5, 1]  Sorted & rotated ✅
           */
        int[] sort_array = {21, 39, 54, 87, 19, 20};
        SortedAndRotated sorted_obj= new SortedAndRotated();

        if (sorted_obj.isSortedAndRotated(sort_array)) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted and rotated");
        }
        System.out.println("----------------------------------");

        //problem 3: Find the *maximum subarray sum (Kadane’s Algorithm)*
        int[] maxSort_array = {-21, 39, -54, 87, 19, -20};
        MaxSubarraySum maxSubarray = new MaxSubarraySum();
        int max_sub_array_sum = maxSubarray.maxSubArraySum(maxSort_array);
        System.out.println("Max Sub Array Sum: " + max_sub_array_sum);
        System.out.println("----------------------------------");

        //Additional: Find the *maximum subarray

        System.out.println("Max Sub Array Sum: " + Arrays.toString(maxSubarray.maxSubArray(maxSort_array)));

    }
}


