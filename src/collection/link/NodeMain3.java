package collection.link;

import java.util.LinkedList;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        final LinkedList<Object> objects = new LinkedList<>();

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

        printAll(first);

        Node lastNode = getLastNode(first);

        System.out.println(lastNode);

        int index = 2;
        final Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        add(first,"D");
        System.out.println(first);

        add(first,"E");
        System.out.println(first);

        add(first,"F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println("x.item = " + x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static void add(final Node node, final String param) {
        final Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

}
