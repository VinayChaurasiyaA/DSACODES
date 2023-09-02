package com.DSA.LinkedList.coustumLinkedLIst;

public class DLL {
    private Node head;
//    private Node tail;
//
//    private int size;
//
//    public DLL() {
//        this.size =0;
//    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.pre = null;
        if (head!=null){
            head.pre = node;
        }
        head = node;
    }
    public void insertatval(int after , int val){
        Node p = find(after);
        if (p == null){
            System.out.println("Node does not exits");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        node.pre = p;
        p.next = node;
        if (node.next != null) {
            node.next.pre = node;
        }
    }
    public Node find(int after){
        Node node = head;
        while (node != null){
            if (node.value == after){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAt(int index , int val){
        Node p = get(index);
        if(p.next == null){
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        node.pre = p;
        p.next = node;
        node.next.pre = node;
    }
    public Node get(int val){
        Node get = head;
        for (int i = 1; i < val -1; i++) {
            get = get.next;
        }
        return get;
    }
    public void insertlast(int val){
        Node node = new Node(val);
        node.next = null;
        Node last = head;
        if (head==null){
            node.pre = null;
            head=node;
        }
        while (last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.pre = last;


    }
    public void  display(){
        Node node = head;
        Node last = null;//which is tail
        while (node!=null){
            System.out.print(node.value + "->");
            last = node;
            node =node.next;
        }
        System.out.println("END");
        System.out.println("Reverse print");
        while (last!=null){
            System.out.print(last.value + "->" );
            last = last.pre;
        }
        System.out.println("Start");
    }

    private class Node{
        private int value;
        private Node next;
        private Node pre;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
    }
}
