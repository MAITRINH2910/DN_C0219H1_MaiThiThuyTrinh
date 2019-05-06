import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object arrays[];
   // private E[] arrays=(E[]) new Object [DEFAULT_CAPACITY];

    public MyList() {
        arrays = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        if (size >= arrays.length) {
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(arrays, 0, newData, 0, size);
            arrays = newData;
        }
    }

    private void ensureCapa() {
        int newSize = arrays.length * 2;
        arrays = Arrays.copyOf(arrays, newSize);
    }

    public void add(int e){
        if (size ==  arrays.length){
            ensureCapacity();
        }
        arrays[size++] = e;
    }

    public void add(int index, int value) {
        ensureCapacity();

        for (int i =size - 1; i >= index; i--) {
            arrays[i + 1] = arrays[i];
        }
        arrays[index] = value;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            arrays[i] = arrays[i+1];
        }
        size--;
    }

    public void XuatMang(){
        for (int i=0; i<size; i++){
            System.out.print(arrays[i]+" ");
        }
    }

    public E get(int i) {
        checkIndex(i);
        return (E)arrays[i];
    }

    public int size() {
        return size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(arrays[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(arrays[i])) {
                return i;
            }
        }
        return -1;
    }

    public void checkIndex(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("index" + i + " out of bounds");
        }
    }

    public void clear() {
        arrays = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object clone(){
        MyList o = new MyList();
        clear();
       for (int i=0; i<DEFAULT_CAPACITY; i++){
           o.add(0);
       }

        return o;
    }
}
