import java.util.Arrays;

public class MyList<T> {
    T[] array;
    int size;
    int capacity;


    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        size = 0;
    }

    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[10];
        size = 0;
    }

    public void add(T data) {
        if (size() >= capacity) {
            this.capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size(); i++) {
                newArray[i] = array[i];
            }
            this.array = newArray;
        }
        this.array[size()] = data;
        size++;

    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }


    public T get(int index) {
        if (index > 0 && index < size()) {
            return array[index];
        }
        return null;
    }

    public T remove(int index) {
        if (index > 0 && index < size()) {
            T removed = array[index];
            for (int i = index + 1; i < size() - 1; i++) {
                array[i - 1] = array[i];
            }
            size--;
            return removed;
        }
        return null;
    }

    public T set(int index, T data) {
        if (index > 0 && index < size()) {
            array[index] = data;
            return data;
        }
        return null;
    }

    @Override
    public String toString() {
        String string = "[";
        for (int i = 0; i < size(); i++) {
            string += array[i];
            if (i != size() - 1) {
                string += ",";
            }
        }
        string += "]";
        return string;
    }

    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return index;
    }

    public int lastIndexOf(T data) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (array[i] == data) {
                index = i;
            }
        }
        return index;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public T[] toArray() {
return array;
    }

    public void clear() {

        Arrays.fill(array,0,capacity-1,null);
        size=0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subList=new MyList<>(finish-start+1);
        for(int i=0;start<=finish;i++,start++)
        {
            subList.add(array[start]);
        }
        return subList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == data) {
                return true;
            }
        }
return false;
    }


}
