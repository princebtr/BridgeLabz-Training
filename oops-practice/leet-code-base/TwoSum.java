class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]+nums[j] == target && i != j){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}