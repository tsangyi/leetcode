import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 * DFS
 *
 * @author tsangyi
 */
public class Solution17 {

    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        //  手机数字对应的字母
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //  迭代处理
        backTracking(digits, numString, 0);
        return list;
    }

    StringBuilder temp = new StringBuilder();

    private void backTracking(String digits, String[] numString, int num) {
        //  深度记录结果
        if (num == digits.length()) {
            list.add(temp.toString());
            return;
        }
        //str 表示当前num对应的字符串
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            //  递归
            backTracking(digits, numString, num + 1);
            //  剔除末尾的继续尝试
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     *
     *
     *  
     *
     * 示例 1：
     *
     * 输入：digits = "23"
     * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * 示例 2：
     *
     * 输入：digits = ""
     * 输出：[]
     * 示例 3：
     *
     * 输入：digits = "2"
     * 输出：["a","b","c"]
     *  
     *
     * 提示：
     *
     * 0 <= digits.length <= 4
     * digits[i] 是范围 ['2', '9'] 的一个数字。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

}
