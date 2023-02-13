package Tree;

public class BalancedTree {
    // int height(Node root) {
    //     if(root == null) {
    //         return 0;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return 1 + Math.max(leftHeight, rightHeight);
    // }

    // boolean isBalanced(Node root) {
    //     if(root == null) {
    //         return true;
    //     }
    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);
    //     return (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    // }

    public int isBalanced(Node root) {
        if(root == null) {
            return 0;
        }
        int leftH = isBalanced(root.left);
        if(leftH == -1) {
            return -1;
        }
        int rightH = isBalanced(root.right);
        if(rightH == -1) {
            return -1;
        }
        if(Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        else {
            return Math.max(leftH, rightH) + 1;
        }
    }
    public static void main(String args[]) {
        Height height = new Height();
    
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    
        if (tree.checkHeightBalance(tree.root, height))
          System.out.println("The tree is balanced");
        else
          System.out.println("The tree is not balanced");
      }
    }
