import  java.util.LinkedList;
public class MyLinkedList {
    private int numNodes;
    private Node pHead;
    private Node pTail;

    public MyLinkedList(Object data) {
        pHead = new Node(data);
        pTail = pHead;
    }

    private class Node<E> {
        Object data;
        Node<E> pNext;

        public Object getData() {
            return this.data;
        }
        public Node(Object data) {
            this.data = data;
        }


    }

    public void addFirst(Object data) {
        Node temp = new Node(data);
        temp.pNext = pHead;
        pHead = temp;
        numNodes++;
    }

    public void addLast(Object data){
        Node temp = pHead;
        Node holder;
        for(int i=0; temp.pNext != null; i++) {
            temp = temp.pNext;
        }
        holder = temp.pNext;
        temp.pNext = new Node(data);
        temp.pNext.pNext = holder;
        numNodes++;
    }

    public void addLast1(Object data){
        Node tem = pTail;
        Node temp = new Node(data);
        tem.pNext = temp;
        pTail = temp;

//        pTail.pNext=temp;
//        pTail=temp;
        numNodes++;
    }

    public void add(int index, Object data){
        Node temp = pHead;
        Node holder;

        for(int i=0; i < index-1 && temp.pNext != null; i++) {
            temp = temp.pNext;
        }
        holder = temp.pNext;
        temp.pNext = new Node(data);
        temp.pNext.pNext = holder;
        numNodes++;
    }

    public Object removeFirst(){
        if (numNodes==0){
            return null;
        } else {
            Node temp = pHead;
            pHead=pHead.pNext;
            numNodes--;
            if (pHead==null){
                pTail=null;
            }
            return temp.data;
        }
    }
    public Object removeLast(){
        if (numNodes==0) {return null;
        }
        else if(numNodes==1){
            Node temp = pHead;
            pHead=pTail=null;
            numNodes=0;
            return temp.data;
        } else {
            Node current = pHead;
            for (int i=0; i<numNodes-2; i++){
                current=current.pNext;
            }
            Node temp = pTail;
            pTail=current;
            pTail.pNext=null;
            numNodes--;
            return temp.data;
        }
    }
    public Object remove(int index){
       if (index<0||index>=numNodes){
           return null;
       } else if (index==0){
           return removeFirst();
       } else if(index==numNodes-1){
           return removeLast();
       } else {
           Node previous = pHead;
           for  (int i=1; i<index;i++){
               previous=previous.pNext;
           }
           Node current =previous.pNext;
           previous.pNext=current.pNext;
           numNodes--;
           return current.data;
       }
    }

    public boolean remove(Object data){
        return true;
    }

    public int size(){
        return numNodes;
    }

    public boolean contains(Object data){
        for (Node index=pHead; index!=null; index=index.pNext){
            if (index.data==data){
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object data){
        int dem=0;
        for (Node index = pHead; index!=null; index=index.pNext){
            if (index.data == data){
                dem++;
                break;
            }
            dem++;
        } return dem;
    }


    public Object clone(){
        MyLinkedList o =  new MyLinkedList(0);
        o.pHead=o.pTail=null;
        numNodes=0;
        for (Node x=pHead; x!=null; x=x.pNext){
            o.addFirst(x.data);
        }
       return o;
    }


    public void ensureCapacity(int minCapacity){

    }


    public Object get(int index){
        Node temp= pHead;
        for(int i=0; i<index; i++) {
            temp = temp.pNext;
        }
        return temp.data;
    }

    public Object getFirst(){
        return pHead.data;
    }

    public Object getLast(){
        return pTail.data;
    }

    public void clear(){
        pHead = pTail=null;
        numNodes=0;
    }

    public void printList() {
        for(Node index = pHead; index != null; index = index.pNext ) {
            System.out.print(index.data + " ");

        }
    }
}