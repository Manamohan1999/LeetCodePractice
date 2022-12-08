package com.example.leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        findLeaf(root1, list1);
        findLeaf(root2, list2);

        // List<String> l1 =
        // list1.stream().map(String::valueOf).collect(Collectors.toList());
        // List<String> l2 =
        // list2.stream().map(String::valueOf).collect(Collectors.toList());
        String str1 = String.join(",", list1);
        String str2 = String.join(",", list2);
        return str1.equals(str2);
    }

    private void findLeaf(TreeNode root, List list) {
        if (root == null)
            return;

        findLeaf(root.left, list);

        if (root.left == null && root.right == null)
            list.add(String.valueOf(root.val));

        findLeaf(root.right, list);
    }
}
