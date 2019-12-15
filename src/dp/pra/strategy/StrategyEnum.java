package dp.pra.strategy;


/**
 * 策略模式的最佳实践
 * 策略枚举
 * @author mrficus
 */
public enum StrategyEnum {


    ADD{
        @Override
        public Integer exeCalc(int a , int b){
            return a+b;
        }

    },
    MINS{

        @Override
        public Integer exeCalc(int a , int b){
            return a-b;
        }
    },
    MULTI{
        @Override
        public Integer exeCalc(int a, int b){
            return a*b;
        }
    };
    abstract Integer exeCalc(int a,int b);
}
