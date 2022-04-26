package tree;//package tree;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//
//class Node {
//    String data;
//    Node left;
//    Node right;
//}
//
//class Tree {
//
//    Node root;
//
//    public void setRoot(Node root) {
//        this.root = root;
//    }
//
//    public Node getRoot() {
//        return root;
//    }
//
//    public Node makeNode (Node left, String data, Node right) {
//        Node node = new Node();
//        node.left = left;
//        node.right = right;
//        node.data = data;
//        return node;
//    }
//
//    public void preorder (Node node) {
//        if (node != null && !node.data.equals(".")) {
//            System.out.print(node.data);
//            preorder(node.left);
//            preorder(node.right);
//        }
//    }
//    public void inorder (Node node) {
//        if (node != null && !node.data.equals(".")) {
//            inorder(node.left);
//            System.out.print(node.data);
//            inorder(node.right);
//        }
//    }
//    public void postorder (Node node) {
//        if (node != null && !node.data.equals(".")) {
//            postorder(node.left);
//            postorder(node.right);
//            System.out.print(node.data);
//        }
//    }
//}
//
///**
// A B C
// B D .
// C E F
// E . .
// F . G
// D . .
// G . .
// */
//public class BackTree1991 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int brSize = Integer.parseInt(br.readLine());
//        String[] brArr = {};
//        Tree tree = new Tree();
//        HashMap<String,Node> nodeMap = new HashMap<>();
//
//        for (int i=0; i < brSize; i++) {
//            brArr = br.readLine().split(" ");
//            Node rootNode;
//
//            if (nodeMap.get(brArr[0]) != null) {
//                rootNode = nodeMap.get(brArr[0]);
//            } else {
//                Node node = new Node();
//                node.data = brArr[0];
//                nodeMap.put(brArr[0], node);
//                rootNode = node;
//            }
//
//            Node nodeLeft = new Node();
//            nodeLeft.data = brArr[1];
//
//            Node nodeRight = new Node();
//            nodeRight.data = brArr[2];
//
//            rootNode.left =  nodeLeft;
//            rootNode.right = nodeRight;
//
//            nodeMap.put(brArr[1], nodeLeft);
//            nodeMap.put(brArr[2], nodeRight);
//            Node makeNode = tree.makeNode(nodeLeft, rootNode.data, nodeRight);
//
//            if (i == 0) {
//                tree.setRoot(makeNode);
//            }
//        }
//
//        tree.preorder(tree.getRoot());
//        System.out.println();
//        tree.inorder(tree.getRoot());
//        System.out.println();
//        tree.postorder(tree.getRoot());
//    }
//}
