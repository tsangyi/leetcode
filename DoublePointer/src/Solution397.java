/**
 * 整数替换
 *
 * @author tsangyi
 */
public class Solution397 {

    public static void main(String[] args) {

        integerReplacement(3, 0);

    }

    public static int integerReplacement(int n, int count) {
        if (n % 2 == 0) {
            if (n == 2) {
                System.out.println(count + 1);
                return count + 1;
            }
            integerReplacement(n / 2, count + 1);
        } else {
            integerReplacement(n + 1, count + 1);
        }
        return n;
    }
}
