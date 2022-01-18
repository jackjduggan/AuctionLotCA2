package com.example.ca2auction.DataStructures;

public class linkedlistBoys<F> {

    public Node<F> head=null;

    public void addElement(F e) { //Add element to head of list
        Node<F> fn=new Node<>();
        fn.setContents(e);
        fn.next=head;
        head=fn;
    }

    public void clear() { //Empty list.
        head=null;
    }

    public void deleteList(){
        head=null;
    }

    public void updateList() {
        head=null;
    }

    public F get(int index){
        if(index==0 && head != null)
            return head.contents;
        Node<F> currentnode=head;

        int counter = 0;
        while (currentnode !=null && counter < index){
            currentnode=currentnode.next;
            counter ++;
        }
        return currentnode.contents;
    }

    //Add other insertion, deletion, access, search, etc. methods too
    //Inner class approach.
    public class Node<F> {
        public Node<F> next=null;
        private F contents; //ADT reference!
        public F getContents() { return contents; }
        public void setContents(F c) { contents=c; }
    }

    public boolean delete(int itemtodelete){
        Node<F> currentnode=head;
        if (itemtodelete == 0 && head != null){
            head = currentnode.next;
            return true;
        }
        int counter = 0;
        while (currentnode !=null && counter < itemtodelete-1){
            currentnode=currentnode.next;
            counter ++;
        }
        currentnode.next=currentnode.next.next;
        return true;
    }

}
