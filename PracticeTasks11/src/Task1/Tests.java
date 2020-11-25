package Task1;

import java.util.Arrays;
public class Tests {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(11);
        ArrayQueueModule.enqueue(55);
        ArrayQueueModule.enqueue(58);
        ArrayQueueModule.enqueue(116);
        ArrayQueueModule.enqueue(126);
        ArrayQueueModule.enqueue(365);
        System.out.println("\n\tTesting Task1.ArrayQueueModule");
        System.out.println("elements: " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("element(): " + ArrayQueueModule.element());
        System.out.println("elements after element(): " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("dequeue(): " + ArrayQueueModule.dequeue());
        System.out.println("elements after dequeue(): " + Arrays.toString(ArrayQueueModule.elements));
        System.out.println("getSize(): " + ArrayQueueModule.getSize());
        if (ArrayQueueModule.isEmpty()) {
            System.out.println("Empty: "  + ArrayQueueModule.getSize());
        }
        else {
            System.out.println("Not empty: "  + ArrayQueueModule.getSize());
        }
        ArrayQueueModule.clear();
        System.out.println("elements after clear(): " + Arrays.toString(ArrayQueueModule.elements));
        if (ArrayQueueModule.isEmpty()) {
            System.out.println("Empty: " + ArrayQueueModule.getSize());
        }
        else {
            System.out.println("Not empty: "+ ArrayQueueModule.getSize());
        }

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueADT.push(arrayQueueADT, 3);
        ArrayQueueADT.push(arrayQueueADT, 5);
        ArrayQueueADT.push(arrayQueueADT, 8);
        ArrayQueueADT.push(arrayQueueADT, 11);
        System.out.println("\n\tTesting Task1.ArrayQueueADT");
        System.out.println(arrayQueueADT);
        System.out.println("element(): " + ArrayQueueADT.element(arrayQueueADT));
        System.out.println("dequeue(): " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("dequeue(): " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("after dequeue(): " + arrayQueueADT);
        if (ArrayQueueADT.isEmpty(arrayQueueADT)) {
            System.out.println("Empty: " + ArrayQueueADT.getSize(arrayQueueADT));
        }
        else {
            System.out.println("Not empty: "+ ArrayQueueADT.getSize(arrayQueueADT));
        }
        ArrayQueueADT.clear(arrayQueueADT);
        if (ArrayQueueADT.isEmpty(arrayQueueADT)) {
            System.out.println("Empty " + ArrayQueueADT.getSize(arrayQueueADT));
        }
        else {
            System.out.println("Not empty "+ ArrayQueueADT.getSize(arrayQueueADT));
        }

        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(62);
        arrayQueue.enqueue(108);
        arrayQueue.enqueue(400);
        System.out.println("\n\tTesting Task1.ArrayQueue");
        System.out.println(arrayQueue);
        System.out.println("element(): " + arrayQueue.element());
        System.out.println("dequeue(): " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        if (arrayQueue.isEmpty()) {
            System.out.println("Empty:" + arrayQueue.getSize());
        }
        else {
            System.out.println("Not empty: "+ arrayQueue.getSize());
        }
        arrayQueue.clear();
        if (arrayQueue.isEmpty()) {
            System.out.println("Empty: " + arrayQueue.getSize());
        }
        else {
            System.out.println("Not empty: "+ arrayQueue.getSize());
        }
    }
}