package sleep;

public class SleepDemoApp {

	public static void main(String[] args) {

		// Create object of Runnable
		Runnable statementPrinter1 = new SleepDemo();
		Runnable statementPrinter2 = new SleepDemo();
		Runnable statementPrinter3 = new SleepDemo();

		// Create object of Thread
		Thread word1 = new Thread(statementPrinter1, "word1");
		Thread word2 = new Thread(statementPrinter2, "word2");
		Thread text = new Thread(statementPrinter3, "text");

		word1.start();
	
		text.start();
		word2.start();

	}

}
