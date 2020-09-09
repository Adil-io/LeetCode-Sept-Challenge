import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

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
