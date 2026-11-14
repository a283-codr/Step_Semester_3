public class Problem9_PairSumSortedArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8, 9, 11};
        int target = 10;
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("Pair: " + numbers[left] + " and " + numbers[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}