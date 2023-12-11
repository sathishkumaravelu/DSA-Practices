package org.sdet5.linkedList;

import org.testng.annotations.Test;

public class MergeLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int key) {
            this.data = key;
            next = null;
        }

        public  Node(){

        }
    }

    public Node addNode(int data) {
        return new Node(data);
    }

    public void printAllNode(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
    }

    @Test
    public void testMergeEqualNode() {

        Node oddNode = addNode(1);
        oddNode.next = addNode(3);
        oddNode.next.next = addNode(5);

        Node evenNode = addNode(2);
        evenNode.next = addNode(4);
        evenNode.next.next = addNode(6);
        evenNode.next.next.next = addNode(8);

        printAllNode(mergeTwoNode(oddNode, evenNode));

    }

    private Node mergeTwoNode(Node oddNode, Node evenNode) {
        Node copyHead = new Node();
        Node result = copyHead, left = oddNode, right = evenNode;

        while (left != null && right != null) {

            if (left.data < right.data) {
                result.next = left;
                left = left.next;
            } else {
                result.next = right;
                right = right.next;
            }
            result = result.next;
        }

        if (right != null) {
            result.next = right;
        } else {
            result.next = left;
        }

        return copyHead.next;
    }
}
