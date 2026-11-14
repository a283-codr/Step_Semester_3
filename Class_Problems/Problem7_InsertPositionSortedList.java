public class Problem7_InsertPositionSortedList {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 4;
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                System.out.println("Insert position: " + mid);
                return;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Insert position: " + left);
    }
}