package com.DSA.LinkedList.coustumLinkedLIst;

import java.lang.ref.Cleaner;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertionFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail=head;
        }
        size++;
    }
    public int deleteatfirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public void insert(int val , int index){
        if(index == 0) {
            insertionFirst(val);
            return;
        }
        else if(index == size){
            insertionatlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp =temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;
    }
    //Insert with recursion
    public void Insertrec(int val , int index){
        head = Insertrec(val , index , head);

    }
    private Node Insertrec(int val , int index , Node node){
       //base case
        if (index==0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }

        node.next = Insertrec(val , index-1 , node.next);
        return node;
    }

    public void insertionatlast(int val){
        if (tail==null){
            insertionFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteatlast(){
        if (size<=1){
            return deleteatfirst();
        }
        int val = tail.value;
        Node node = get(size-2);
        tail = node;
        tail.next = null;
        return val;
    }
    public int delete(int index){
        if (index == 0){
            return deleteatfirst();
        }
        else if(index == size - 1){
            return deleteatlast();
        }
        Node previous = get(index -1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if (node.value ==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    //recursion reverese
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
        return prev;
    }
    //reverse 2
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        //Skip the first left-1 nodes and get at the node
        ListNode prev = null;
        ListNode current = head;
        for (int i = 0;current != null && i <left -1 ; i++) {
            prev = current;
            current= current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        // now reverse the node
        ListNode next = current.next;
        for (int i = 0; current != null && i <right - left + 1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    // palindrome or not
    public boolean isPalindrome(ListNode head) {
        // fistly find the middle
        ListNode middleNode = middle(head);
        ListNode secondhead = reverse(middleNode);
        ListNode rereverse = secondhead;
        // compare both the half
        while (head != null && secondhead != null){
            if(head.val != secondhead.val){
                break;
            }
            head = head.next;
            secondhead = secondhead.next;
        }
        reverse(rereverse);

        return head == null || secondhead == null;
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        else if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode temp = head;
        ListNode mid = middleList(head);
        while(temp.next != null){
            temp = temp.next;
            if(temp.next == mid){
                temp.next = mid.next;
            }
        }
        return head;
    }
    static ListNode middleList(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    // this one is wrong
    public ListNode rotateRight1(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head; // tail
        ListNode next = current.next;
        while (current.next !=  null ){
            prev = current;
            current = next;
            if(next.next!=null){
                next = next.next;
            }
        }
        for (int i = 0; i < k; i++) {
            current.next = head;
            head = current.next;
            current = prev.next;
            current.next = null;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }
       ListNode last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;
        int rotaions = k%length;
        int skip =length - rotaions;
        ListNode newLast = head;
        for (int i = 0; i <skip -1 ; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
//    public ListNode getP(ListNode head){
//
//    }

    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }





}
