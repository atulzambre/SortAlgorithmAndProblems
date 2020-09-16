package com.sort.problems;

import java.util.Objects;

/*
Given a linked list of 0s, 1s and 2s, sort it.

Examples:

Input: 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1 -> NULL
Output: 0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2 -> NULL

Input: 1 -> 1 -> 2 -> 1 -> 0 -> NULL
Output: 0 -> 1 -> 1 -> 1 -> 2 -> NULL
*/
public class SortLinkedListProblem {
   static Node head=new Node();

    public static void main(String[] args) {
        pushNode(0);
        pushNode(1);
        pushNode(0);
        pushNode(2);
        pushNode(1);
        pushNode(1);
        pushNode(2);
        pushNode(1);

//        printLinkedList(head);
        sortLinkedList(head);


    }

    private static void sortLinkedList(Node head) {
        int c0 = -1,c1=-1,c2=-1;
        Node countNode=new Node();
        countNode = head;
        while(Objects.nonNull(countNode)){
            if(countNode.val==0)
                c0++;
            if (countNode.val==1)
                c1++;
           if (countNode.val==2)
               c2++;
            countNode=countNode.next;
        }

        countNode=head;
        int i=0;
        while (i<c0){
            countNode.val=0;
            countNode=countNode.next;
            i++;
        }
        while (i<c1){
            countNode.val=1;
            countNode=countNode.next;
            i++;
        }
        while (i<c2){
            countNode.val=2;
            countNode=countNode.next;
            i++;
        }
        printLinkedList(countNode);


    }

    private static void printLinkedList(Node print) {
        Node printNode=new Node();
        printNode=print;
        while(Objects.nonNull(printNode.next)){
            System.out.print(printNode.val+"->");
            printNode=printNode.next;
        }
    }

    private static void pushNode(int val) {
       if (Objects.isNull(head)){
            head.val=val;
            head.next=null;
       }
       else{
           Node newNode=new Node(val);
           newNode.next=head;
           head=newNode;
       }

    }
}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        next=null;
    }

    Node(){

    }


}
