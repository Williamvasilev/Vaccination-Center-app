package com.example.vaccinationcenterca1;

import javafx.scene.Node;

public class GeneralList<v> {
    public Node<v> head = null;


    public void add(v v) {
        Node<v> temp = new Node<>();
        temp.setContents(v);
        temp.next = head;                                                           //the next/newest node becomes the head
        head = temp;                                                                  //sets temp to the head
    }


    public int size() {
        Node node = head;                                                         //sets node to head
        int count = 0;
        while (node != null) {
            node = node.next;                                                     //sets node to be the next node which sets it to the head
            count++;                                                              //increments by 1
        }
        return count;
    }


    public class Node<N> {
        public Node<N> next = null;
        private N contents;
        public Object items;

        public N getContents() {
            return contents;
        }

        public void setContents(N c) {
            contents = c;
        }
    }

    public void clear() {
        head = null;
    }                                            //sets head to null


    public void delete(int x) {
        Node<v> temp = head;
        int i = 0;

        while(i<x && temp!=null){                                                    // while i is less than x and temp is not equal to null
            temp = temp.next;                                                        // set temp to the next node
            i++;
        }
        if(i == 0) {
            head = head.next;

        }
            if (temp != null && temp.next != null) {                                          // if temp is not equal to null and temp.next is not equal to null
                temp.next = temp.next.next;                                              //set the 2nd node to be the 3rd node
            }

    }

    public Node<v> get(int x){
        Node<v> temp = head;
        int i = 0;

        while(i<x && temp!=null){                                                     // while i is less than x and temp is not equal to null
            temp = temp.next;                                                         // set temp equal to the next node
            i++;
        }

     return temp;


    }


}



