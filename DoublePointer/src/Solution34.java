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
        int length = nums.length;


        int left = 0;
        int right = length - 1;

        search(nums, target, left, right);
        return nums;
    }


    public static int[] search(int[] nums, int target, int left, int right) {

        if (nums[left] < target) {
            left = left / 2;
            search(nums, target, left, right);
        }
        if (nums[left] > target) {
            right = right / 2;
            search(nums, target, left, right);
        }

        return nums;
    }


}
