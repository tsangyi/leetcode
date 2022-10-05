/**
 * 最大子数组和
 *
 * @author tsangyi
 * @date 2022/10/5
 */
public class Solution53 {

    public static void main(String[] args) {

        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(ints);
        System.out.println(max);

    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }


}
