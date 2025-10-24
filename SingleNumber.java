
public class SingleNumber {
    public int singleNumber(int[] nums) {
     
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

        
            for (int j = 0; j < nums.length; j++) {
                if (i != j) { 
                    if (nums[i] == nums[j]) {
                        isDuplicate = true; 
                        break;
                    }
                }
            }

            if (!isDuplicate) {
                return nums[i];
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(sol.singleNumber(nums)); 
    }
}
