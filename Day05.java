/** All Elements in Two Binary Search Trees
 * 
 * Given two binary search trees root1 and root2.
   Return a list containing all the integers from both trees sorted in ascending order.

    Example 1:
    Input: root1 = [2,1,4], root2 = [1,0,3]
    Output: [0,1,1,2,3,4]

    Example 2:
    Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
    Output: [-10,0,0,1,2,5,7,10]

    Example 3:
    Input: root1 = [], root2 = [5,1,7,0,2]
    Output: [0,1,2,5,7]

    Example 4:
    Input: root1 = [0,-10,10], root2 = []
    Output: [-10,0,10]

    Example 5:
    Input: root1 = [1,null,8], root2 = [8,1]
    Output: [1,1,8,8]
 
    Constraints:
    Each tree has at most 5000 nodes.
    Each node's value is between [-10^5, 10^5].
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Day05 {

     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> sortedNodes = new LinkedList<Integer>();
            inOrderTraversal(root1, sortedNodes);
            inOrderTraversal(root2, sortedNodes);
            Collections.sort(sortedNodes);

            return sortedNodes;
        }

        public void inOrderTraversal(TreeNode root, List<Integer> list) {
            if(root!=null) {
                inOrderTraversal(root.left, list);
                list.add(root.val);
                inOrderTraversal(root.right, list);
            }
        }
    }

}
