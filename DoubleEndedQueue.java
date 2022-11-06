public class DoubleEndedQueue extends Queue {
    public DoubleEndedQueue(int length) {
        super(length);
    }

    public boolean addElementAtHead(int element) {
        int previousElementIndex = (nextElementIndex - 1 + length) % length;

        if (isFull()) {
            return false;
        }

        elements[previousElementIndex] = element;
        nextElementIndex = previousElementIndex;
        numberOfElements++;

        return true;
    }

    public int removeElementAtEnd() {
        int element = Integer.MIN_VALUE;
        int lastElementIndex = (nextElementIndex + numberOfElements - 1) % length;

        if (isEmpty()) {
            return 0;
        }
        
        element = elements[lastElementIndex];
        numberOfElements--;

        return element;
    }
}
