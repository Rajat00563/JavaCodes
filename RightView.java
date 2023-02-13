void rightViewRec(BinaryTree<Integer> root, int level) {
    if(root == null) {
        return;
    }
    if(maxLevel < level) {
        System.out.println(root.data);
        maxLevel = level;
    }
    rightViewRec(root.right, level + 1);
    rightViewRec(root.left, level + 1);
}

void leftViewIter(BinaryTree<Integer> root) {
    if(root == null) {
        return;
    }
    LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
        int size = queue.size();
        for(int i = 0; i < size; i++) {
            BinaryTree<Integer> currentNode = queue.removeFirst();
            if(i == size) {
                System.out.println(currentNode.data);
            }
            if(currentNode.left != null) {
                queue.addLast(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.addLast(currentNode.right);
            }
        }
        System.out.println();
    }
}
