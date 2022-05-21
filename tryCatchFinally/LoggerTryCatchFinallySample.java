package tryCatchFinally;

import java.util.logging.*;

public class LoggerTryCatchFinallySample {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggerTryCatchFinallySample.class.getName());
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.INFO);
		logger.addHandler(consoleHandler);
		try {
			logger.warning("WARNING");
			int num = Integer.parseInt(args[0]);
		} catch (Exception e) {
			logger.severe("SEVERE");
		} finally {
			logger.info("INFO");
		}
	}
}
