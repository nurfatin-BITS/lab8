package extendThread;

public class NumThreadApp {

	public static void main(String[] args) {
		
		// Create objects of thread
		Thread numThread = new NumThread();
		Thread numThread2 = new NumThread();

		// Named the thread
		numThread.setName("Thread 1");
		numThread2.setName("Thread 2");
		
		// Execute threads
		numThread.start();
		numThread2.start();

	}

}
