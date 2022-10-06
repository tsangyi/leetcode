/**
 * 移动元素
 * 难度：简单
 * 双指针 快慢指针
 *
 * @author tsangyi
 * @date 2022/10/6
 */
public class Solution27 {

    public static void main(String[] args) {

        int[] num = {0,1,2,2,3,0,4,2};
        int i = removeElement(num, 2);
        System.out.println(i);

    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 核心目的: 慢指针slow 区间[0,slow)内的元素为值不等于val的元素
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            // 快指针fast所指向的元素值不等于val=3
            // 将其值赋值于慢指针所在位置
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                // 赋值完毕之后，慢指针右移一位，等待下一次赋值
                slow++;
            }
        }
        return slow;
    }
}
