package org.sdet5.linkedList;

import org.testng.annotations.Test;

public class LinkedList {

    @Test
    public void testReverseNode() {
        Node head = addNode(10);
        head.next = addNode(15);
        head.next.next = addNode(25);
        printAll(head);
        System.out.println('\n'+"Reverse link ");
        printAll(reverseNode(head));
    }

    @Test
    public void testReverseNode1() {
        Node head = addNode(10);
        head.next = addNode(15);
        head.next.next = addNode(25);
        System.out.println('\n');
        printAll(head);
        System.out.println('\n'+"Reverse link 2");
        printAll(reverseNode2(head));
    }

    @Test
    public void testDuplicateLL(){
        Node head = addNode(10);
        head.next = addNode(15);
        head.next.next = addNode(15);
        head.next.next.next = addNode(25);
        head.next.next.next.next = addNode(25);
        duplicate(head);
    }

    private void duplicate(Node head) {
        Node currentNode = head;
        boolean duplicateFound = false;
        while (currentNode!=null){
            if(currentNode.data==currentNode.next.data){
                System.out.println("duplicate found :"+currentNode.data);
                duplicateFound = true;
                break;
            }
            currentNode = currentNode.next;
        }
        if(!duplicateFound){
            System.out.println("Duplicate not found");
        }
    }


    @Test
    public void testRemoveDuplicate(){
        Node head = addNode(10);
        head.next = addNode(15);
        head.next.next = addNode(16);
        head.next.next.next = addNode(20);
        head.next.next.next.next = addNode(25);
        head.next.next.next.next.next = addNode(25);
        printAll(removeDuplicate(head));
    }

    private Node removeDuplicate(Node head) {
        Node currentNode = head;
        boolean duplicateFound = false;
        while (currentNode!=null&&currentNode.next!=null){
            if(currentNode.data==currentNode.next.data){
                currentNode.next = currentNode.next.next;
                duplicateFound = true;
            }else {
                currentNode = currentNode.next;
            }
        }
        if(!duplicateFound){
            System.out.println("Duplicate not found");
        }
        return head;
    }


    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int key) {
            this.data = key;
            next = null;
        }
    }


    public Node addNode(int data) {
        return new Node(data);
    }

    public void printAll(Node node){
        while(node !=null){
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }

    public Node reverseNode(Node node){
        Node head = node, prev = null, next;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public Node reverseNode2(Node node){
        Node currentNode = null;
        while (node != null) {
            Node newNode = addNode(node.data);
            newNode.next = currentNode;
            currentNode = newNode;
            node = node.next;
        }
        return currentNode;
    }


}
