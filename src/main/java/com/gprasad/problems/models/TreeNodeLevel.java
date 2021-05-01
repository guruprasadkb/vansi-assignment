/*
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.gprasad.problems.models;

public class TreeNodeLevel  {
    public int val;
    public TreeNodeLevel left;
    public TreeNodeLevel right;
    public TreeNodeLevel next;

    public TreeNodeLevel(int x) {
        val = x;
        left = right = next = null;
    }

    // level order traversal using 'next' pointer
    public String getLevelOrderParsedString() {
        TreeNodeLevel nextLevelRoot = this;
        String ret = "";
        while (nextLevelRoot != null) {
            TreeNodeLevel current = nextLevelRoot;
            nextLevelRoot = null;
            while (current != null) {
                ret += (current.val + ",");
                if (nextLevelRoot == null) {
                    if (current.left != null)
                        nextLevelRoot = current.left;
                    else if (current.right != null)
                        nextLevelRoot = current.right;
                }
                current = current.next;
            }
        }
        return ret;
    }
}
