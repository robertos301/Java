import exceptions.StringException;

public class LinkedList {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INSERT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static LinkedList insert(LinkedList l, String data) throws StringException {
        Node newNode = new Node(data);
        newNode.next = null;

        //empty list validation
        if (data.length() > 15 || !data.matches("[a-zA-Z]+"))
            throw new StringException();
        if (l.head == null) {
            l.head = newNode;
        } else {
            Node last = l.head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
        }
        return l;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~DELETE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static LinkedList delete(LinkedList l, String data) {
        Node currentNode = l.head;
        Node previousNode = null;

        //deleted node is head case
        if (currentNode != null && currentNode.data == data) {
            l.head = currentNode.next;
            System.out.println("Node with String:" + data + " ~~~ was found and was deleted");
            return l;
        }
        //deleted node is somewhere else
        while (currentNode != null && currentNode.data != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        //if node was found elsewhere
        if (currentNode != null) {
            previousNode.next = currentNode.next;
            System.out.println("Node with String:" + data + "~~~was found and was deleted");
        }
        //if node was not found elsewhere
        if (currentNode == null) {
            System.out.println("There is no node with String:" + data + ". Delete failed");
        }
        return l;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~COUNT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int count(LinkedList l) {
        int nr = 0;
        Node currentNode = l.head;
        if (l.head == null)
            return nr;
        else {
            while (currentNode != null) {
                nr++;
                currentNode = currentNode.next;
            }
        }
        return nr;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~PRINT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void print(LinkedList l) {
        Node currentNode = l.head;
        System.out.print("Linked List: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INSERT FOR SORT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void insertAscending(LinkedList l, Node n) {
        Node currentNode;

        if (l.head == null) {
            l.head = n;
        } else {
            currentNode = l.head;
            if (currentNode != null && currentNode.data.compareTo(n.data) == 1) {
                n.next = currentNode.next;
                currentNode.next = n;
            } else {
                while (currentNode.next != null && currentNode.next.data.compareTo(n.data) == -1) {
                    currentNode = currentNode.next;
                }

                n.next = currentNode.next;
                currentNode.next = n;
            }
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~SORT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static LinkedList sort(LinkedList l) {
        LinkedList sortedLinkedList = new LinkedList();
        Node currentNode = l.head;
        if (l.head != null) {
            while (currentNode != null) {
                insertAscending(sortedLinkedList, currentNode);
                currentNode = currentNode.next;
            }
        }
        return l;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~REDUCE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//is there a more efficient way?
    public static String reduce(LinkedList l) {
        Node currentNode = l.head;
        String reducedString = "";
        while (currentNode != null) {
            reducedString = reducedString + currentNode.data;
            currentNode = currentNode.next;
        }
        return reducedString;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        try {
            insert(l, "John");
            insert(l, "Rammstein");
            insert(l, "Mozart");
            insert(l, "LimpBizkit");
            insert(l, "Chester");
        } catch (StringException le) {
            System.out.println("Inserted string is not Valid. It is either to long , contains spaces or is not composed from letters only.\n\n\n");
        }
        LinkedList.print(l);
        System.out.println();
        l.delete(l, "Mozart");
        System.out.println("List count: " + count(l));
        System.out.println(reduce(l));
        sort(l);
        System.out.println("\n~~~~~Dupa sortare~~~~~");
        l.print(l);

    }


}
