import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if (root != null) {
            q.add(root);
        }
        
        while (!q.isEmpty()) {
            Node x = q.remove();
            // Only add non-null nodes to the result
            if (x != null) {
                result.add(x.data);
                // Add children to the queue for the next level
                if (x.left != null) {
                    q.add(x.left);
                }
                if (x.right != null) {
                    q.add(x.right);
                }
            }
        }
        return result;
    }
}
