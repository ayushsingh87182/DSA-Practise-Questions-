class MissingNumbers {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualsum = 0;
        int assumedsum = 0;
        for(int i=0;i<=n;i++){
             actualsum += i;
        }
        for(int i=0;i<n;i++){
             assumedsum += nums[i];
        }
        int subs = actualsum - assumedsum;
        return subs;
    }
    public static void main(String[] args) {
        MissingNumbers obj = new MissingNumbers();
        int[] nums = {3, 0, 1};
        int missing = obj.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}