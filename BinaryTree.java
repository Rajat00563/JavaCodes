void width(BinaryTree root){
    int left=0,right=0;
    BinaryTree cur=root;
    while(cur !=null){
        if(cur.left!=null)
            left+=1;
        cur=cur.left;
    }
    cur=root;
    while (cur!=null){
        if(cur.right!=null)
            right+=1;
        cur=cur.right;
    }
    System.out.println(left+right);
}


void diagonal1(BinaryTree root, int i){
    if(root==null)
        return;
    HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
    LinkedList<Integer> q =  new LinkedList<>();
    q.add(root.data);
    map.put(i,q);
    for(Map.Entry<Integer, LinkedList<Integer>> m : map.entrySet()) {
        System.out.println(m.getKey() + " " + m.getValue());
    }
   diagonal1(root.right,i);
   diagonal1(root.left,i-1);
}


class Node {
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;
     void printLeaves(Node node)
    {
        if (node == null)
            return;
        printLeaves(node.left);
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.right);
    }
    void printBoundaryLeft(Node node)
    {
        if (node == null)
            return;
        if (node.left != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        }
        else if (node.right != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }
    }
    void printBoundaryRight(Node node)
    {
        if (node == null)
            return;
        if (node.right != null) {
            printBoundaryRight(node.right);
            System.out.print(node.data + " ");
        }
        else if (node.left != null) {
            printBoundaryRight(node.left);
            System.out.print(node.data + " ");
        }
    }
     void printBoundary(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
         printBoundaryLeft(node.left);
        printLeaves(node.left);
        printLeaves(node.right);
        printBoundaryRight(node.right);
    }
     public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.printBoundary(tree.root);
    }
}

