package com.DSA.LinkedList.coustumLinkedLIst;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertionFirst(3);
        list.insertionFirst(4);
        list.insertionFirst(121);
        list.insertionFirst(2222);
        list.insertionFirst(231114);

        list.insert(141 , 2);
        list.insertionatlast(23241);


        list.display();

        System.out.println(list.deleteatfirst());
        list.display();
        System.out.println(list.deleteatlast());

        list.Insertrec(88 , 1);
        list.display();

//        DLL list = new DLL();
//        list.insertfirst(12);
//        list.insertlast(1211);
//        list.insertfirst(112);
//        list.insertfirst(12222);
//        list.display();
//        list.insertatval(112 , 45);
//        list.insertAt(2 , 122);
//        list.display();


//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(33);
//        list.insert(43);
//        list.display();
//        list.delete(43);
//        list.display();

    }
}
