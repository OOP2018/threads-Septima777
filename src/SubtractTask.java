/**
 * This class use for subtract tasks.
 * @author Noppawan Kulchol
 *
 */
public class SubtractTask implements Runnable{
	private Counter counter;
	private int limit;

	/**
	 * Initialize counter and limit number.
	 * @param counter is the number in the task.
	 * @param limit is latest number in the task.
	 */
	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * subtract the number.
	 */
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(-k);
	}

}
