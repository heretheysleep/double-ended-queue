public class Main {
    public void clearQueue(Queue queue) {
        String output = "";

        for (int currentIndex = 0; !queue.isEmpty(); currentIndex++) {
            if (currentIndex == 0) {
                output += "[ ";
            }

            output += queue.removeElement();

            if (!queue.isEmpty()) {
                output += ", ";
            } else {
                output += " ]";
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Queue simpleQueue = new Queue(5);

        simpleQueue.addElement(11);
        simpleQueue.addElement(17);
        simpleQueue.addElement(6);
        simpleQueue.addElement(7);
        simpleQueue.addElement(81);

        DoubleEndedQueue doubleEndedQueue = Queue.convertCircularQueueInDoubleEnded(simpleQueue);

        doubleEndedQueue.removeElementAtEnd();
        doubleEndedQueue.addElementAtHead(14);

        main.clearQueue(doubleEndedQueue);
    }
}
