public class MyLinkedList {
    private int numNodes;

    private class Node<E> {
        private Object data;
        private Node pNext;

        public Object getData() {
            return this.data;
        }
        public Node(Object data) {
            this.data = data;
        }

    }

    private Node pHead;
    private Node pTail;


    public MyLinkedList(Object data) {
        pHead = null;
        pTail = null;
    }


    public void addFirst(Object data) {
       /*Node temp = pHead;
        pHead = new Node(data);
        pHead.pNext = temp;
        numNodes++;*/

        Node temp = new Node(data);
        temp.pNext = pHead;
        pHead = temp;
        numNodes++;
    }
    //-------------Xem lại vì chưa chạy chương trình được------------------
    public void addLast(Object data) {
        Node temp = new Node(data);
        pTail.pNext = temp;
        pTail = temp;
        numNodes++;

    }
    //-------------------------------
    public void addLast1(Object data){
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

    public Node get(int index){
        Node temp= pHead;
        for(int i=0; i<index; i++) {
            temp = temp.pNext;
        }
        return temp;
    }

    public void printList() {
       for(Node index = pHead; index != null; index = index.pNext ) {
            System.out.print(index.data + " ");

        }
    }
}