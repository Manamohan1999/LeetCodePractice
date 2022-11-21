package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        char[][] maze = {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','.','.','+'},{'+','+','+','+','.','+','.'}};
        // char[][] maze ={{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance = {0,1};

        System.out.println(new Solution().nearestExit(maze, entrance));
    }
}
