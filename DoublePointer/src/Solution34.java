/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * 二分查找
 *
 * @author tsangyi
 * @date 2022/10/3
 */
public class Solution34 {

    public static void main(String[] args) {
        int[] ints = {5, 7, 7, 8, 8, 10};
        searchRange(ints, 8);
    }

    public static int[] searchRange(int[] nums, int target) {
        System.out.println(nums.length);
        System.out.println(3 / 2);

        int left;
        int right;

        int length = nums.length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[length / 2] < target) {
                left = length / 2;
            }
        }
        return nums;
    }


    public static int[] search(int[] nums, int target, int left, int right) {
        int length = nums.length;

        for (int i = 0; i <length; i++) {
            if (nums[length / 2] < target) {
                left = length / 2;
            }
            search(nums,target,left,right);

        }
        return nums;
    }


}
