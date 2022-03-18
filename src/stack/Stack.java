package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {

    private Object[] space;
    private int len = 1;

    public Stack() {
        this.space = new Object[len];
    }

    public E push(E item) {
        if (len != 1)
            space = Arrays.copyOf(space, len);
        space[len - 1] = item;
        len++;
        return item;
    }

    public E pop() {
        if (len == 1)
            throw new EmptyStackException();
        len--;
        E item = (E) space[len - 1];
        return item;
    }

    public E peek() {
        if (len == 1)
            throw new EmptyStackException();
        E item = (E) space[space.length - 1];
        return item;
    }
}
