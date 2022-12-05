import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
	
	Queue<Integer> q;
	Random ranInt;
	public CarQueue() {
		ranInt = new Random();
		q = new LinkedList<Integer>();
		q.add(23);
		q.add(33);
		q.add(10);
		q.add(2);
		q.add(90);
		
	}
	
	public int deleteQueue() {
		
		return 0;
	}

	public void addToQueue() {
		class added implements Runnable{

			@Override
			public void run() {
				
				for (int i = 0; i<1000;i++) {
					q.add(ranInt.nextInt());
				}
				
			}
			
			
			
		}
		
	}

}
