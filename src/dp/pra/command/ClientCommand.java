package dp.pra.command;

/**
 * @author mrficus
 */
public class ClientCommand {

    public static void main(String[] args) {
        Lighter lighter = new Lighter();
        CommanderDemo cd = new CommanderDemo(lighter);
        cd.doCommand();
    }
}