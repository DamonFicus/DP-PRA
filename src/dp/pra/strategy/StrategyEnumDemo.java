package dp.pra.strategy;

public class StrategyEnumDemo {
    public static void main(String[] args) {
        System.out.println(StrategyEnum.ADD.exeCalc(2,3));
        System.out.println(StrategyEnum.MINS.exeCalc(8,3));
        System.out.println(StrategyEnum.MULTI.exeCalc(9,9));
    }
}
