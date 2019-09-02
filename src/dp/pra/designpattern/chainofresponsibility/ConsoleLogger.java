package dp.pra.designpattern.chainofresponsibility;

public class ConsoleLogger extends AbstractLoger
{

    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: "+message);
    }
}
