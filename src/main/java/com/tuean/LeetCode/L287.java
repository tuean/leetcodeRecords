package com.tuean.LeetCode;

public class L287 {

    // https://blog.csdn.net/wr339988/article/details/53617914
    // https://blog.csdn.net/monkeyduck/article/details/50439840

    // todo Floyd判圈算法 这个算法强的一匹

    public static int findDuplicate(int[] nums) {

        if(nums != null && nums.length > 1){

            int slow = 0;
            int fast = 0;
            int t    = 0;

            // 重复数据表示有环 现在求两个快慢指针在环中相遇的位置
            // 并不一定是需要的值
            while(true){
                slow = nums[slow];
                fast = nums[nums[fast]];
                if(slow == fast){
                    break;
                }
            }

            // slow 是相遇的位置
            // 另一个指针从头开始 两者相遇的位置就是重复的值

            // A: 重复数
            // B: slow 即相遇的点
            // a: 一开始都走了a步后进入换
            // x: 慢指针走了x步后与快指针相遇
            // L: 每圈长度
            // k1: 慢指针走的圈数
            // k2: 快指针走的圈数
            // 2[a + (k1 * L + x)] = a +(k2 * L + x) => a = CL + b


            // 环的入口既是重复的值

//            两个指针同时从直线起点开始，假设在x处第一次汇合，
//            xo之间距离为x，那么快指针走过的路程为a+c+x,慢指针走过的路程为a+x，
//            所以a+c+x=2(a+x),所以c＝a＋x，
//            也就是SO之间的距离等于xo，所以令快指针从起点开始一次一步，慢指针从x开始，同时前进，则必会在O处相遇！


            // 画图可知 起点到重复点的距离 = 周长 - 快指针到相遇点的距离
            // so 从0 开始的新的指针到起点时， 另一个指针也刚到起点

            while(true){
                slow = nums[slow];
                t = nums[t];
                if(slow == t){
                    break;
                }
            }
            return slow;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
    }
}
