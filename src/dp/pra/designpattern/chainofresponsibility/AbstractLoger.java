package dp.pra.designpattern.chainofresponsibility;

public abstract class AbstractLoger {

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=2;

    protected  int level;

    /**
     *责任链中的下一个元素
     */
    protected  AbstractLoger nextLoger;

    public void setNextLoger(AbstractLoger nextLoger){
        this.nextLoger=nextLoger;
    }

    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLoger!=null){
            nextLoger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);

}
