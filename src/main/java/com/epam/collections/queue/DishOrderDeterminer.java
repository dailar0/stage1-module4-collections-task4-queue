package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < numberOfDishes + 1; i++) {
            queue.offer(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            try {
                for (int i = 1; i < everyDishNumberToEat; i++) {
                    queue.add(queue.remove());
                }
                list.add(queue.remove());
            } catch (NoSuchElementException e) {
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        DishOrderDeterminer dishOrderDeterminer = new DishOrderDeterminer();
        dishOrderDeterminer.determineDishOrder(11, 4);
    }
}
