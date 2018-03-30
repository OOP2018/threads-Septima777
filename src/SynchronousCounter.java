
/**
 * This class use synchronized method for executing 2 thread without error. 
 * @author Noppawan Kulchol
 *
 */
public class SynchronousCounter extends Counter{
	
	/**
	 * add the number in the first thread. When the first thread is done, the other
	 * thread start.
	 */
	@Override
	 public synchronized void add(int amount) {
		super.add(amount);
	 
	 }


}
