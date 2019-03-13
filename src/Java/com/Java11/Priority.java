package com.Java11;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by  Tang
 * Create Time 2018/7/25 下午 10:53
 */
public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        priorityQueue.add(1000);
        for (int i = 0;i<10;i++){
            priorityQueue.offer(rand.nextInt(10));
        }
        System.out.println(priorityQueue);
    }
}
