import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> listInteger = new MyList<Integer>();

        //Check size of Array

        listInteger.add(5);
        Object a=listInteger.get(0);
        System.out.println(a);
        listInteger.add(10);
        listInteger.add(15);
        listInteger.add(20);
        listInteger.add(25);
        listInteger.XuatMang();

        listInteger.add(1,100);
        listInteger.add(1,50);
        System.out.println();
        listInteger.XuatMang();

        listInteger.remove(3);
        System.out.println("\nMang sau khi them la: ");
        listInteger.XuatMang();
        int size = listInteger.size();
        System.out.println("\nSize of Array after inserting: "+size);

        boolean o=listInteger.contains(3);
        System.out.println(o);

        int check = listInteger.indexOf(100);
        System.out.println(check);

        /*listInteger.clear();
        size = listInteger.size();
        System.out.println("\nSize of Array after clearing: "+size);*/

       MyList o1 = (MyList) listInteger.clone();
        o1.XuatMang();
       // listInteger.clone();
      //  System.out.println("Elements in cloneList are:");
       // System.out.println();

    }
}
