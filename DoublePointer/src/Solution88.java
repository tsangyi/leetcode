import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

/**
 * 合并两个有序数组
 * 难度：简单
 *
 * @author tsangyi
 * @date 2022/10/8
 */
public class Solution88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, nums1.length, nums2, nums2.length);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int right;
        int left;


        int j = 0;

        for (int i = 0; i < m; i++) {

            if (i < m - n) {
                left = i;
            } else {
                left  = m - n - 1;
            }

            if (nums1[left] < nums2[j]) {
                if (left == m - n - 1) {
                    nums1[m - n + j] = nums2[j];
                    j++;
                }
                continue;
            }

            //  相等移动右边指针
            if (nums1[left] == nums2[j]) {
                j++;
                continue;
            }

            if (nums1[left] > nums2[j] && nums1[left + 1] > nums2[j]) {
                nums1[m - n + j] = nums2[j];
                j++;
            }

        }
    }
}
