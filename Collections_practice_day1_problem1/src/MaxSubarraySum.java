import java.util.Arrays;

public class MaxSubarraySum{


    public int maxSubArraySum(int[] a) {

        int currentSum = a[0];
        int maxSum = a[0];

        for (int i = 1; i < a.length; i++) {

            // Decide whether to extend the subarray or start new
            currentSum = Math.max(a[i], currentSum + a[i]);

            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public int[] maxSubArray(int[] a) {

        int currentSum = a[0];
        int maxSum = a[0];

        int start = 0;        // temp start
        int bestStart = 0;   // best subarray start
        int bestEnd = 0;     // best subarray end

        for (int i = 1; i < a.length; i++) {

            if (a[i] > currentSum + a[i]) {
                currentSum = a[i];
                start = i;
            } else {
                currentSum = currentSum + a[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = start;
                bestEnd = i;
            }
        }

        return Arrays.copyOfRange(a, bestStart, bestEnd + 1);
    }
}


