package dp.pra.validtest;

/**
 * @author mrficus
 * 静态内部类
 */
public class StaticInnerClass {
    private static  int shared =9;
    private static class StaticInner{
        public void innerMethod(){
            System.out.println("inner result "+shared);
        }
    }

    public void test(){
        StaticInner si = new StaticInnerClass.StaticInner();
//      StaticInner si = new StaticInner();  也可以

        si.innerMethod();
    }

    public static void main(String[] args) {
        StaticInnerClass sic = new StaticInnerClass();
        sic.test();
    }

}
