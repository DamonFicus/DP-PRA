package dp.pra.designpattern.chainofresponsibility;

public class ErrorLogger extends AbstractLoger {

    public ErrorLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console:Logger: "+message);
    }
}
