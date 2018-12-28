package wq.demos.algorithm;

import java.util.HashMap;
import java.util.Map;

public class SimpleDemos {

    /**
     * 已知两数和，求两数索引
     * <p>
     * 时间复杂度：O(n)，每次查找花费 O(1) 的时间，然后只遍历了一遍
     * 空间复杂度：O(n)，最多需要存储 n 个元素
     */
    public int[] twoSum(int[] nums, int target) {
        //初始化一个Map<数字，index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // 每次迭代尝试从map中取出成对数字的索引
            Integer index = map.get(target - num);
            if (index != null) {
                return new int[]{i, index};
            }

            // 取不出酒吧当前数放进去，继续迭代
            map.put(num, i);
        }
        return null;
    }


}
