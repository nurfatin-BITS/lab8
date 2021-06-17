package implementRunnable;

public class PrintStatementApp {

	public static void main(String[] args) {
		
		// Create object of Runnable
		Runnable statementPrinter1 = new PrintStatement ();
		Runnable statementPrinter2 = new PrintStatement ();
		Runnable statementPrinter3 = new PrintStatement ();
		
		// Create object of Thread
		Thread word1 = new Thread (statementPrinter1, "word1");
		Thread word2 = new Thread (statementPrinter2, "word2");		
		Thread text  = new Thread (statementPrinter3, "text");		
		
		word1.start();
		word2.start();
		text.start();
		
		

	}

}
