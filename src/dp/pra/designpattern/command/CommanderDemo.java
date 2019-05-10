package dp.pra.designpattern.command;

public class CommanderDemo {

    private Command cod;

    public CommanderDemo(Command cod) {
        this.cod = cod;
    }

    public void doCommand(){
        cod.execute();
    }

}
