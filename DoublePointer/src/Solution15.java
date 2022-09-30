import java.util.*;


/**
 * 三数之和
 * 头尾指针
 *
 * @author tsangyi
 * @date 2022/10/1
 */
public class Solution15 {

    public static void main(String[] args) {

        int[] ints = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(ints);
        System.out.println(lists.toString());


    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //  从小到大排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //  排序后第一个数大于0直接返回
            if (nums[i] > 0) {
                return result;
            }
            //  第一个数nums[i]相等直接右滑动
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //  初始化的左右 数组下标
            int left = i + 1;
            int right = nums.length - 1;
            //  左右数组下标没有相遇
            while (left < right) {
                //  三数求和
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    //  大于nums[right]往左边移动
                    right--;
                } else if (sum < 0) {
                    //  小于nums[left]往右边边移动
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right  && nums[right] == nums[right - 1]) {
                        //  nums[right]左邻相同直接--
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        //  nums[left]右邻相同直接--
                        left++;
                    }
                    //  两边继续往中间滑动
                    right--;
                    left++;
                }
            }
        }
        return result;
    }

}






    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     *
     * 你返回所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *  
     *
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 解释：
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
     * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
     * 注意，输出的顺序和三元组的顺序并不重要。
     * 示例 2：
     *
     * 输入：nums = [0,1,1]
     * 输出：[]
     * 解释：唯一可能的三元组和不为 0 。
     * 示例 3：
     *
     * 输入：nums = [0,0,0]
     * 输出：[[0,0,0]]
     * 解释：唯一可能的三元组和为 0 。
     *  
     *
     * 提示：
     *
     * 3 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

