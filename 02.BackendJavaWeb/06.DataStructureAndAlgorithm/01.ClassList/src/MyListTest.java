public class MyListTest {
    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(5);
        listInteger.get(0);
        listInteger.add(10);
        listInteger.add(15);
        listInteger.add(20);
        listInteger.add(25);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        //listInteger.get(6);
        //System.out.println("element 6: "+listInteger.get(6));

        //listInteger.get(-1);
        //System.out.println("element -1: " + listInteger.get(-1));
    }
}
