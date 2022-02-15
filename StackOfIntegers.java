import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.size = -1;
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.size = -1;
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return this.size == -1;
    }

    public int peek() {
        return this.elements[this.size];
    }

    public void push(int value) {
        this.size += 1;
        this.elements[this.size] = value;
    }

    public int pop() {
        int last = this.elements[this.size];
        if (this.size != -1){
            this.size -= 1;
            this.elements = Arrays.copyOfRange(this.elements,0,this.size + 1);
        }
        return last;
    }

    public int getSize() {
        return this.size + 1;
    }
}
