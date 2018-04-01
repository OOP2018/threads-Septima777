## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |      1,000,000     |    0.01006734   |
| Using ReentrantLock     |      1,000,000     |    0.10140167   |
| Synchronized method     |      1,000,000     |    0.08985434   |
| AtomicLong for total    |      1,000,000     |    0.03181234   |

## 1. Using unsynchronized counter object

### answer the questions (1.1 - 1.3)
1.1 (and 1.3) Total should be zero and total is not always the same.Because that is 	not synchronized. For example, thread1 run and get the result from counter but  thread run parallel to each other so thread1 maybe do not know that thread2 run in the same way. Sometimes thread1 and thread2 get the same result so it make error.

1.2 average runtime is 0.01006734
	 

## 2. Implications for Multi-threaded Applications

### How might this affect real applications?  

For example, If my account has 100 baht. My friend transfer to me 100 baht but I want to withdraw 100 baht, after transaction my account should have 100 baht left but I see 0 baht. Because 0 baht is the latest update so there will be 0 baht left in my account. 

## 3. Counter with ReentrantLock

### answer questions 3.1 - 3.4

3.1 The total always be 0 because when thread1 run, thread2 was locked so thread1 complete before thread2 run.

3.2 The result is different from problem 1 because it does not run parallel to each other due to use lock.

3.3 ReentrantLock use for lock one thread that I do not want it to run parallel the other thread. It should use in the program because decreases error and get the correct result.

3.4 We have to write finally because when first thread finished it have to unlock for do second thread. 

## 4. Counter with synchronized method

### answer question 4

4.1 The total always be 0 because when you add word synchronized in method it means while first thread executing it will block other thread until first thread is done.

4.2 The result is different from problem 1 because it does not run parallel to each other due to use synchronized method.

4.3 Synchronized means when you add word synchronized in method it means while first thread executing it will block other thread until first thread is done. It should use in the program because decreases error and get the correct result.

## 5. Counter with AtomicLong

### answer question 5

5.1 AtomicLong still fixed the error in the problem 1 because getAndAdd(), it atomically add the value but return the value before the value was added so it can fix error.

5.2 We use AtomicLong because it atomically update means it will be thread safe. 
## 6. Analysis of Results

### answer question 6

6.1 Unsynchronized counter is the fastest and using ReentrantLock is the slowest.

6.2 Lock can be applied to the problem because when it is executing lock use try-finally to ensure that only one thread modifies the resource at any one time.

## 7. Using Many Threads (optional)
	-

