package com.tuean.LeetCode.L400toL499;

public class L478 {


//    https://zxi.mytechroad.com/blog/geometry/leetcode-883-generate-random-point-in-a-circle/
//    https://leetcode.com/problems/generate-random-point-in-a-circle/discuss/154734/Short-Java-solution-!!!
//    上述两者都是相同的思路
//    在一个圆内，随机点的个数与离原点的距离的平方成正比，所以有一个Math.sqrt
//    接着使用极坐标，计算出随机点的值就ok

    double radius, x_center, y_center;
    public L478(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double len = Math.sqrt(Math.random()) * radius;
        double deg = Math.random() * 2 * Math.PI;
        return new double[]{len * Math.cos(deg) + x_center, len * Math.sin(deg) + y_center};
    }


    public static void main(String[] args) {
//        L478 obj = new L478(radius, x_center, y_center);
//        double[] param_1 = obj.randPoint();
    }
}
