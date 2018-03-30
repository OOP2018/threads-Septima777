/**
 * This class use for add tasks.
 * @author Noppawan KUlchol
 *
 */
public class AddTask implements Runnable {
	private Counter counter;
	private int limit;

	/**
	 * Initialize counter and limit number.
	 * @param counter is the number in the task.
	 * @param limit is latest number in the task.
	 */
	public AddTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * add the number
	 */
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(k);
	}
}
