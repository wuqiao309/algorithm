package wq.demos.algorithm;

public class SaoCaozuo {
    /**
     * 有序数组，每个元素最多两次，最终长度
     * <p>
     * 时间复杂度为：O(n)
     * 空间复杂度为：O(1)
     */
    public int removeDuplicates(int[] nums) {
        // 新数组的长度，逐渐增长
        int length = 0;

        for (int num : nums) {
            // 数组长度不够2，或者当前数字与新数组倒数第二个值不同时
            if (length < 2 || num != nums[length - 2])
                // 将新数组延长
                nums[length++] = num;
        }
        return length;
    }
}
