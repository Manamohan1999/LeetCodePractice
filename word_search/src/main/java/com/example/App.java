package com.example;

import main.java.com.example.Solution;

/**
 * Hello world!
 *
 */
public class App1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(new Solution().exist(board, word));
    }
}
