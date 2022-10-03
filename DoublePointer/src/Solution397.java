/**
 * 整数替换
 *
 * @author tsangyi
 */
public class Solution397 {

    public static void main(String[] args) {

        int i = func(17);
        System.out.println(i);

    }
    //  17 18 9 10 5 6 3 4 2 1

    public static int func(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + func(n / 2);
        } else {
            return 1 + Math.min(func(n + 1), func(n - 1));
        }
    }

    /**
     * 给定一个正整数 n ，你可以做如下操作：
     *
     * 如果 n 是偶数，则用 n / 2替换 n 。
     * 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
     * 返回 n 变为 1 所需的 最小替换次数 。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：n = 8
     * 输出：3
     * 解释：8 -> 4 -> 2 -> 1
     * 示例 2：
     *
     * 输入：n = 7
     * 输出：4
     * 解释：7 -> 8 -> 4 -> 2 -> 1
     * 或 7 -> 6 -> 3 -> 2 -> 1
     * 示例 3：
     *
     * 输入：n = 4
     * 输出：2
     *  
     *
     * 提示：
     *
     * 1 <= n <= 231 - 1
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/integer-replacement
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
}
