import java.util.concurrent.atomic.AtomicLong;
/**
 * This class use AtomicLong for executing 2 thread without error. 
 * @author Noppawan Kulchol
 *
 */
public class AtomicCounter extends Counter{
	private AtomicLong total;

	/**
	 * Initialize total of the number.
	 */
	public AtomicCounter() {
		total = new AtomicLong();
	}

	/** add amount to the total. */
	public void add(int amount) {
		total.getAndAdd(amount);
	}

	/** return the total as a long value. */
	public long get() {
		return total.get();
	}
}
