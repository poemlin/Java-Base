package QueueU;

import java.util.Queue;
import java.util.LinkedList;

public class Qu {

    public static void main(String[] args) {
            Queue<Person> queue = new LinkedList<>();

            // add或offer添加元素到队尾
            queue.offer(new Person("Ming", 12));
            queue.offer(new Person("Hong", 15));
            queue.offer(new Person("Jun", 17));
            // remove或poll从队首获取元素并删除
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());  // null

            System.out.println(queue.remove()); // exception

            // 使用判断避免exception
            if(!queue.isEmpty()){
                System.out.println(queue.remove());
            }

    }
}