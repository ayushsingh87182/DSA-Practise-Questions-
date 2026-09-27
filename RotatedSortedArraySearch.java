class RotatedSortedArraySearch {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public int search(int[] nums, int target, int i, int j) {

        if(i > j) {
            return -1;
        }

        int mid = i + (j - i) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        if(nums[i] <= nums[mid]) {

            if(nums[i] <= target && target <= nums[mid]) {
                return search(nums, target, i, mid - 1);
            }
            else {
                return search(nums, target, mid + 1, j);
            }

        }
        else {

            if(nums[mid] <= target && target <= nums[j]) {
                return search(nums, target, mid + 1, j);
            }
            else {
                return search(nums, target, i, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        RotatedSortedArraySearch searcher = new RotatedSortedArraySearch();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = searcher.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}