/** Project Euler
 *  Problem 2
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1 {
    public static void main(String[] args) {
        int[] nums1000 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1000[i] = i;
        }
        int sum = 0;
        for (int num: nums1000) {
            if ((num % 3 == 0) || (num % 5 == 0)) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}