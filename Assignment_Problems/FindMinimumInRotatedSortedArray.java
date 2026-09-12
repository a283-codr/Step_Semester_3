public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int middle = left + (right - left) / 2;

            // Minimum is in the right half
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } 
            // Minimum is in the left half
            else {
                right = middle;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int result = findMin(nums);

        System.out.println("Minimum Element: " + result);
    }
}