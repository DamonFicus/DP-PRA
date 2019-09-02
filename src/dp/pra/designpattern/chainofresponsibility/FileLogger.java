package dp.pra.designpattern.chainofresponsibility;

public class FileLogger extends AbstractLoger {

    public FileLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLog ::Logger: "+message);
    }
}
