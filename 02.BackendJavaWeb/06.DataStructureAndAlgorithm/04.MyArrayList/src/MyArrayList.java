public class MyArrayList<E> {
    public static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }



    public void add(E value, int index) {
        int size = data.length;
        for (int i = data.length - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }


}
