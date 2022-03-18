//package tree;
//
///**
//       (1)
//     ↙    ↘︎
//   (2)    (3)
//   ↙ ↘
// (4) (5)
//
// Preorder 전위 순회 (root -> left -> right): 1,2,4,5,3
// Inorder 중위 순회 (left -> root -> right): 4,2,5,1,3
// Postorder 후위 순회 (left -> right -> root): 4,5,2,3,1
// */
//class Node {
//    int data;
//    Node left;
//    Node right;
//}
//
//class BinaryTree {
//
//    public Node makeNode(Node left, int data, Node right) {
//        Node node = new Node();
//        node.left = left;
//        node.right = right;
//        node.data = data;
//        return node;
//    }
//
//    public static void preorder(Node node) {
//        if (node != null) {
//            System.out.print(" -> " + node.data);
//            preorder(node.left);
//            preorder(node.right);
//        }
//    }
//
//    public static void inorder(Node node) {
//        if (node != null) {
//            inorder(node.left);
//            System.out.print(" -> " + node.data);
//            inorder(node.right);
//        }
//    }
//
//    public static void postorder(Node node) {
//        if (node != null) {
//            postorder(node.left);
//            postorder(node.right);
//            System.out.print(" -> " + node.data);
//        }
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Node n4 = tree.makeNode(null,4,null);
//        Node n5 = tree.makeNode(null,5,null);
//        Node n2 = tree.makeNode(n4,2,n5);
//        Node n3 = tree.makeNode(null,3,null);
//        Node n1 = tree.makeNode(n2,1, n3);
//
//        tree.preorder(n1);
//        System.out.println();
//        tree.inorder(n1);
//        System.out.println();
//        tree.postorder(n1);
//        System.out.println();
//    }
//}