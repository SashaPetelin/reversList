public class List {

    public static Node reverse(Node head)
    {
        Node previous = null;
        Node current = head;

        while (current != null)
        {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args)
    {
        int[] digits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Node head = null;
        for (int i = digits.length - 1; i >= 0; i--) {
            head = new Node(digits[i], head);
        }
        head = reverse(head);
        printList(head);
    }

    public static void printList(Node head)
    {
        Node index = head;
        while (index != null)
        {
            System.out.print(index.data + " ");
            index = index.next;
        }
        System.out.println();
    }
}

class Node
{
    int data;
    Node next;
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}