package com.example;

import java.util.LinkedList;

public class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;

        //setting 4 neighbours 
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        LinkedList<int[]> list = new LinkedList<>();

        //pusing the first element 
        list.push(new int[] { entrance[0], entrance[1] });
        maze[entrance[0]][entrance[1]] = '+';

        int steps = 0;

        while (!list.isEmpty()) {
            int N = list.size();

            while (N-- > 0) {

                //use removeLast to use the FIFO feature
                int[] currentPostion = list.removeLast();

                int x = currentPostion[0];
                int y = currentPostion[1];

                //checking for exist positions
                if ((x == 0 || x == m - 1 || y == 0 || y == n - 1) && !(x == entrance[0] && y == entrance[1])) {
                    return steps;
                }

                //visiting neighbours
                for (int[] dir : directions) {
                    int new_i = x + dir[0];
                    int new_j = y + dir[1];

                    //checking for boundary conditions
                    if (new_i >= 0 && new_i < m && new_j >= 0 && new_j < n && maze[new_i][new_j] != '+') {
                        list.push(new int[] { new_i, new_j });
                        maze[new_i][new_j] = '+';
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}
