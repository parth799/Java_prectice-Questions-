import java.util.Scanner;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
        Node head;
        public LinkedList() {
            this.head = null;
        }
        // Insert node at end of link list.
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
                return;
            }
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        // Insert node at beginning of link list.
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        }
        // Insert node at particular position of link list.
        public void insertAtPosition(int data, int position) {
            if (position < 1) {
                System.out.println("Invalid position");
                return;
            }
            if (position == 1) {
                insertAtBeginning(data);
                return;
            }
            Node newNode = new Node(data);
            Node current = this.head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        // Delete node from particular position from link list.
        public void deleteAtPosition(int position) {
            if (this.head == null) {
                System.out.println("List is empty");
                return;
            }
            if (position < 1) {
                System.out.println("Invalid position");
                return;
            }
            if (position == 1) {
                this.head = this.head.next;
                return;
            }
            Node current = this.head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                System.out.println("Invalid position");
                return;
            }
            current.next = current.next.next;
        }
        // Display link list
        public void display() {
            Node current = this.head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public class Practice13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList list = new LinkedList();
            while (true) {
                System.out.println("1. Insert node at end of linked list");
                System.out.println("2. Insert node at beginning of linked list");
                System.out.println("3. Insert node at particular position of linked list");
                System.out.println("4. Delete node from particular position from linked list");
                System.out.println("5. Display linked list");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter data: ");
                        int data1 = sc.nextInt();
                        list.insertAtEnd(data1);
                        break;
                    case 2:
                        System.out.print("Enter data: ");
                        int data2 = sc.nextInt();
                        list.insertAtBeginning(data2);
                        break;
                    case 3:
                        System.out.print("Enter data: ");
                        int data3 = sc.nextInt();
                        System.out.print("Enter position: ");
                        int position3 = sc.nextInt();
                        list.insertAtPosition(data3, position3);
                        break;
                    case 4:
                        System.out.print("Enter position: ");
                        int position4 = sc.nextInt();
                        list.deleteAtPosition(position4);
                        break;
                    case 5:
                        System.out.println("Linked List:");
                        list.display();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
