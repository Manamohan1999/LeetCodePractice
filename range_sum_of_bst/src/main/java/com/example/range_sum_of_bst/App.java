package com.example.range_sum_of_bst;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // [10,5,15,3,7,13,18,1,null,6]

        TreeNode root = new TreeNode(10);
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(15);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(13);
        TreeNode root6 = new TreeNode(18);
        TreeNode root7 = new TreeNode(1);
        TreeNode root8 = new TreeNode(6);

        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;
        root3.left = root7;
        root4.left = root8;

        System.out.println(new Solution().rangeSumBST(root, 6, 10));
    }
}
