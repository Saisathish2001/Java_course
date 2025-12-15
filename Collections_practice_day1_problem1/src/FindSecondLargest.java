public class FindSecondLargest {
    public int findSecondLargest(int a[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }
}
