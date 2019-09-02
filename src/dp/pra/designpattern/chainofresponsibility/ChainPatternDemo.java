package dp.pra.designpattern.chainofresponsibility;

/**
 * 责任链模式
 */
public class ChainPatternDemo {

    private static AbstractLoger getChainOfLoggers(){
        AbstractLoger errorLogger= new ErrorLogger(AbstractLoger.ERROR);
        AbstractLoger fileLoger= new FileLogger(AbstractLoger.DEBUG);
        AbstractLoger consoleLogger= new FileLogger(AbstractLoger.INFO);
        errorLogger.setNextLoger(fileLoger);
        fileLoger.setNextLoger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLoger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLoger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLoger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLoger.ERROR,
                "This is an error information.");
    }


}
