package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    // [A->B->C]
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node x = this;
        str.append("[");
        while (x != null){
            str.append(x.item);
            if(x.next != null) {
                str.append("->");
            }
            x = x.next;
        }
        str.append("]");
        return str.toString();
    }
}
