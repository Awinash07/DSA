import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversal {

    public List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.data);
            leftBoundary(root.left, result);
            addLeaves(root, result);
            rightBoundary(root.right, result);
        }
        return result;
    }

    private void leftBoundary(TreeNode node, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        while (node != null && (node.left != null || node.right != null)) {
            result.add(node.data);

            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        // Push remaining left boundary nodes to stack for later processing
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop().data);
        }
    }

    private void rightBoundary(TreeNode node, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        while (node != null && (node.left != null || node.right != null)) {
            result.add(node.data);
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        // Push remaining right boundary nodes to stack for later processing
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop().data);
        }
    }

    private void addLeaves(TreeNode root, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();

            if (current.left == null && current.right == null) {
                result.add(current.data);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
}
