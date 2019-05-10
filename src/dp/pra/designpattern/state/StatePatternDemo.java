package dp.pra.designpattern.state;

/**
 * 状态模式:
 * 类的行为基于其状态进行改变
 * 是一种行为模式
 * 需要一个行为随着状态改变而改变的context对象
 *
 * 使用场景，当代码中需要大量的根据状态条件来判断并执行不同逻辑时
 * 使用状态模式进行处理；
 *
 * 通过将具体的状态类抽取出来；
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        Context ctx = new Context();
        State sdt = new StartState();
        sdt.doAction(ctx);
        State std1= new StopState();
        std1.doAction(ctx);

    }

}
