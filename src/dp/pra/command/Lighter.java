package dp.pra.command;

public class Lighter implements Command {
    @Override
    public void execute() {
        LightOn();
    }

    public void LightOn() {
        System.out.println("Light on shining shining!!!");
    }

}
