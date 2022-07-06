public class Stack {
    public Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public int pop() {
        if (head == null) {
            return 0;
        } else {
            int value = head.value;
            head = head.prev;
            return value;
        }
    }

    public void printme() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value);
                if (node.prev != null) {
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
            System.out.println();
        }
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        head = reverseHead(head);
    }

    public Node reverseHead(Node node) {
        Node newNode;
        Node newHead = null;
        while (true) {
            if (newHead == null) {
                newHead = new Node(node.value, null);
            } else if (node.prev == null) {
                newNode = new Node(node.value, newHead);
                newHead = newNode;
                break;
            } else {
                newNode = new Node(node.value, newHead);
                newHead = newNode;
            }
            node = node.prev;
        }
        return newHead;
    }
}
