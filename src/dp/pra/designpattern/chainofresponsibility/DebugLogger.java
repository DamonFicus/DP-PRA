package dp.pra.designpattern.chainofresponsibility;

public class DebugLogger extends AbstractLoger {

    public DebugLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Debug Console::Logger: "+message);
    }
}
