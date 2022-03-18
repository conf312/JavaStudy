package graph;

import sun.misc.Queue;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    class Node {
        int data;
        boolean marked;
        LinkedList<Node> adjacent;

        public void setAdjacent(LinkedList<Node> adjacent) {
            this.adjacent = adjacent;
        }

        public LinkedList<Node> getAdjacent() {
            return this.adjacent;
        }

        public Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Node[] nodes;
    public Graph(int size) {
        nodes = new Node[size];
        for (int i=0; i<size; i++) {
            nodes[i] = new Node(i);
        }
    }

    public Node[] getNodes() {
        return nodes;
    }

    /**
     두 노드의 관계를 저장하는 함수
     */
    public void addEdge(int a, int b) {

        Node n1 = nodes[a];
        Node n2 = nodes[b];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    /**
     DFS( 깊이 우선 탐색 , Depth-First Search)

     루트 노드( 혹은 다른 임의의 노드)에서 다음 분기(branch)로 넘어가기 전에,
     해당 분기(branch)를 모두 탐색하는 방법. 탐색 후에는 다시 원점으로 돌아가 다른 분기를 탐색
     */
    public void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;

        while(!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    /**
     BFS( 너비 우선 탐색 , Bread-First Search)

     루트 노드(혹은 다른 임의의 노드)에서 시작한 인접 노드를 먼저 탐색하는 방법입니다.
     */
    public void bfs(int index) throws InterruptedException {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<Node>();
        queue.enqueue(root);
        root.marked = true;

        while(!queue.isEmpty()) {
            Node r = queue.dequeue();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
            visit(r);
        }
    }

    public void visit(Node n) {
        System.out.println(n.data + " ");
    }
}