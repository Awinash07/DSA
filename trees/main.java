import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        TreesTraversal traversal = new TreesTraversal();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        //===============traversal============>
        ArrayList<Integer> inOrder = traversal.inOrderTraversalIterative(root); 
        System.out.println("in order -> "+inOrder);
        ArrayList<Integer> preOrder = traversal.PreOrderTraversalIterative(root); 
        System.out.println("pre order -> "+preOrder);
        ArrayList<Integer> postOrder = traversal.PostOrderTraversalIterative(root); 
        System.out.println("post order -> "+postOrder);
        List<Integer> levelOrder = traversal.levelOrderTraversal(root);
        System.out.println("level order -> "+levelOrder);

        //=================problems ===========>
        MaxDepth maxDepth = new MaxDepth();
        int depth = maxDepth.maxDepth(root);
        System.out.println("maxDepth -> "+depth);

        IsValidBST bst = new IsValidBST();
        boolean isValidBST = bst.isValidBST(root);
        System.out.println("validBST -> "+isValidBST);

        KthSmallest kthSmallest = new KthSmallest();
        int smallestNo= kthSmallest.kthSmallest(root, 2);
        System.out.println("Kth smallest -> "+smallestNo);

    }
}
