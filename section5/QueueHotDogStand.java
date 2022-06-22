package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        Queue<Integer> qU = new LinkedList<>();

        if(list.isEmpty() || list.size() == 3  || list.size() == 2 || list.size() == 1){
            if(list.size() == 2){
                Collections.reverse(list);
            }
            return list;
        }

        int rotations = 0;

        while(rotations < 3){  // goes over list 3 times at the 0 index and adds ele[0] to the que then removes from the list
            qU.add(list.get(0));
            list.remove(0);
            rotations++;
        }

        while(rotations > 0){  //reverses previous loop by the rotation var and adds elements from que back to stack in the order they were removed
            list.add(qU.element());
            qU.remove();
            rotations--;
        }

        return list;

         */

        Queue<Integer> queue = new LinkedList<>();

        if (list.isEmpty() || list.size() == 1 || list.size() == 2 || list.size() == 3) {
            if (list.size() == 2) {
                Collections.reverse(list);
            }
            return list;
        }

        int rotations = 0;

        while(rotations < 3){  // goes over list 3 times at the 0 index and adds ele[0] to the que then removes from the list
            queue.add(list.get(0));
            list.remove(0);
            rotations++;
        }

        while(rotations > 0){  //reverses previous loop by the rotation var and adds elements from que back to stack in the order they were removed
            list.add(queue.element());
            queue.remove();
            rotations--;
        }

        return list;

















    }
}
