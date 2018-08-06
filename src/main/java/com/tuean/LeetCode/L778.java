package com.tuean.LeetCode;

import java.util.PriorityQueue;

public class L778 {


    /**
     * copy from
     *      https://blog.csdn.net/huanghanqian/article/details/79258880
     *
     * @param grid
     * @return
     */
    public int swimInWater(int[][] grid) {

        int n=grid.length;
        int[][] direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visited=new boolean[n][n];
        PriorityQueue<Coordinate> pq= new PriorityQueue<>((a, b) -> a.val - b.val);
        pq.offer(new Coordinate(0, 0, grid[0][0]));
        int max = 0;
        while(!pq.isEmpty()){
            Coordinate c = pq.poll();
            visited[c.x][c.y]=true;
            max=Math.max(max, c.val);
            if (c.x == n-1 && c.y == n-1) {
                break;
            }
            for(int i=0;i<4;i++){
                int newX=c.x+direction[i][0];
                int newY=c.y+direction[i][1];
                if(newX<0||newX>=n||newY<0||newY>=n||visited[newX][newY]==true){
                    continue;
                }
                pq.offer(new Coordinate(newX, newY, grid[newX][newY]));
            }
        }
        return max;
    }

    class Coordinate{
        int x;
        int y;
        int val;
        public Coordinate(int x,int y,int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }


    public static void main(String[] args) {

    }


}
