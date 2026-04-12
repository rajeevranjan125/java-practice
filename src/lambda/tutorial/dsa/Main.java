package lambda.tutorial.dsa;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}

public class Main {

    public Node convertArrToLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);

            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public int lengthOfLL(Node head) {

        int count = 0;

        Node temp = head;

        while (temp != null) {

            count++;
            temp = temp.next;
        }

        return count;
    }

    public int checkElement(Node head, int k) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == k) return k;
            temp = temp.next;
        }

        return -1;
    }

    public Node deleteFromHead(Node head) {
        if (head == null) return head;

        head = head.next;

        return head;
    }

    public Node deleteFromTail(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node deleteAtK(Node head, int k) {

        if (head == null) return null;

        if (k == 1) {
            head = head.next;

            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;

        while (temp != null) {

            count++;

            if (k == count) {

                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public Node insertAtHead(Node head, int element) {

        Node newNode = new Node(element);

        newNode.next = head;

        return newNode;
    }

    public Node insertAtTail(Node head, int element) {

        if (head == null) return new Node(element);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(element);

        temp.next = newNode;

        return head;
    }

    public Node insertAtK(Node head, int ele, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(ele);
            } else {
                return null;
            }
        }

        if (k == 1) {
            return new Node(ele, head);
        }

        Node temp = null;
        int c = 0;

        while (temp != null) {

            c++;

            if (c == (k - 1)) {
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }


    public static void main(String[] args) {

        Main m = new Main();

        int[] arr = new int[]{12, 5, 2, 6, 7};

        Node head = m.convertArrToLL(arr);

//        ------actual operations-------

//        System.out.println(m.checkElement(head, 7));
        Node newHead = m.insertAtTail(head, 11);

        m.printLL(newHead);
    }
}