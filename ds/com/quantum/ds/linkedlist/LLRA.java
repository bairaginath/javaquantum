package com.quantum.ds.linkedlist;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAIRAGI
 */
class LinkedList {

    private int data;
    private LinkedList next = null;

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public LinkedList getNext() {
        return next;
    }

    LinkedList(int data) {
        this.data = data;
    }

    static LinkedList createLL(int data) {
        return new LinkedList(data);

    }

    void insert(LinkedList list, int data) {
        if (list.getNext() == null) {
            list.setNext(new LinkedList(data));
            return;
        }
        insert(list.getNext(), data);
    }

    void display(LinkedList list) {
        if (list == null) {
            return;
        }
        System.out.println(list.getData());
        display(list.getNext());
    }

    public void reverseNodes(LinkedList start, int k) {
        
        LinkedList temp, temp2;
        if (start == null || k <= 1) {

            return ;
        }
        temp = start.getNext();
        //start.setNext(null);
        while (temp != null && k > 1) {

            temp2 = temp.getNext();
            temp.setNext(start);
            start = temp;
            temp = temp2;
            k--;
        }
    }

    public LinkedList getNode(LinkedList start, int k) {
        while (start != null && k > 1) {
            start = start.getNext();
            k--;
        }
        return start;
    }

    public LinkedList reverseBlockOfNodes(LinkedList head, int k) {
        LinkedList kth, kthNext, current;
        if (head == null || k <= 1) {

            return head;
        }
        kth = getNode(head, k);
        if (kth == null) {
            return head;
        }
        current = head;
        head = kth;
        while (kth != null) {
            
            kthNext = kth.getNext();
            reverseNodes(current, k);
            current.setNext(kthNext);
            kth = getNode(kthNext, k);
            if (kth != null) {
                
                current.setNext(kth);
            }
            current = kthNext;
        }
        return head;
    }
}

class LLRA {

    public static void main(String[] args) {

        LinkedList list = LinkedList.createLL(1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.display(list);

        //LinkedList reversedList=list.reverseNodes(list, 5);
        //reversedList.display(reversedList);

        LinkedList reversedBlock = list.reverseBlockOfNodes(list, -1);
        reversedBlock.display(reversedBlock);
    }
}