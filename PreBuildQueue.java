import java.util.Queue;
import java.util.LinkedList;
public class PreBuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(100);
        queue.add(300);
        queue.offer(500);
         queue.poll();
         queue.size();
         queue.isEmpty();
    }
}
