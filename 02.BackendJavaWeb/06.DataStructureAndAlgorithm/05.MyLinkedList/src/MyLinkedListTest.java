public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(0);
        linkedList.addFirst(6);
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast1(10);
        System.out.println("\nDanh sach ban dau: ");
        linkedList.printList();
        System.out.println("\nDanh sach sau khi xoa dau: ");
        linkedList.removeFirst();
        linkedList.printList();
        System.out.println("\nDanh sach sau khi xoa cuoi: ");
        linkedList.removeLast();
        linkedList.printList();

        System.out.println("\nDanh sach sau khi xoa: ");
        linkedList.remove(1); //danh sách chạy từ 0
        linkedList.printList();

        int size=linkedList.size();
        System.out.println("\nSo luong phan tu trong danh sach: "+size);

        System.out.println("\nLay phan tu thu 2 trong danh sach: "+linkedList.get(2));
        System.out.println("\nLay phan tu dau tien trong danh sach: "+linkedList.getFirst());
        System.out.println("\nLay phan tu cuoi cung trong danh sach: "+linkedList.getLast());

/*
        linkedList.clear();
        System.out.println("\nDanh sach sau khi xoa toan bo va them lai la: ");
        linkedList.addFirst(10);
        linkedList.printList();
*/
        System.out.println("\nDanh sach la: ");
        linkedList.printList();
        MyLinkedList o = (MyLinkedList)linkedList.clone();
        System.out.println("\nDanh sach sau khi clone la: ");
        o.printList();
    }
}
