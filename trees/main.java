import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        TreesTraversal traversal = new TreesTraversal();
        /*TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);*/
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
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
        int smallestNo = kthSmallest.kthSmallest(root, 2);
        System.out.println("Kth smallest -> "+smallestNo);

        SizeOfTree sizeOfTree = new SizeOfTree();
        int treeSize = sizeOfTree.sizeOfTree(root);
        System.out.println("treeSize -> "+treeSize);

        MinDepth  minDepth = new MinDepth();
        int minimumDepth = minDepth.minDepth(root);
        System.out.println("Minimum Depth -> "+minimumDepth); 

        NthNode nthNode = new NthNode();
        TreeNode node = nthNode.nthNode(root,1);
        System.out.println("nth Node -> "+node.data);

        BoundaryTraversal boundaryTraversal = new BoundaryTraversal();
        List<Integer> result = boundaryTraversal.boundaryTraversal(root);
        System.out.println("boundaryTraversal -> "+result);

        SizeOfTreeUsingLevelOrder sizeOfTreeUsingLevelOrder = new SizeOfTreeUsingLevelOrder();
        int treeSizeUsingLevelOrder = sizeOfTreeUsingLevelOrder.sizeOfTreeUsingLevelOrder(root);
        System.out.println("size of tree using level order traversing -> "+treeSizeUsingLevelOrder);

        CountLeafNode countLeafNode = new CountLeafNode();
        int leafNodeCount = countLeafNode.countleafNode(root);
        System.out.println("Leaf node count -> "+leafNodeCount);

        ReverseLevelOrder reverseLevelOrder = new ReverseLevelOrder();
        List<List<Integer>> reverseLevelOrderList = reverseLevelOrder.reverseLevelOrder(root);
        System.out.println("reversed level order -> "+reverseLevelOrderList);

        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();
        List<List<Integer>> zigzagOrder = zigZagTraversal.zigzagTraversal(root);
        System.out.println("zig zag traversal -> "+zigzagOrder);

        LevelAverage levelAverage = new LevelAverage();
        List<Double> averages = levelAverage.levelAverage(root);
        System.out.println("levelAverage -> "+averages);
    }
}
