public class SortedAndRotated {
    public boolean isSortedAndRotated(int[] a) {

        int count = 0;
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                count++;
            }
        }

        // Check last and first element
        if (a[n - 1] > a[0]) {
            count++;
        }

        return count <= 1;
    }
}
