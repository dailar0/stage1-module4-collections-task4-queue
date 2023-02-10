package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            Integer resultCard = result.poll();
            if (resultCard != null) {
                firstQueue.offer(resultCard);
            }
            resultCard = result.poll();
            if (resultCard != null) {
                secondQueue.offer(resultCard);
            }

            for (int i = 0; i < 2; i++) {
                if (!firstQueue.isEmpty())
                    result.offer(firstQueue.poll());
            }
            for (int i = 0; i < 2; i++) {
                if (!secondQueue.isEmpty())
                    result.offer(secondQueue.poll());
            }
        }
        return result;
    }
}
