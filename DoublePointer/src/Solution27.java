/**
 * 移动元素
 * 难度：简单
 * 双指针
 *
 * @author tsangyi
 * @date 2022/10/6
 */
public class Solution27 {

    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
