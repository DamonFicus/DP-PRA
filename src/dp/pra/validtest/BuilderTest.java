package dp.pra.validtest;

/**
 * 构建器实现
 * 简化多参数实例化的情况
 * 避免使用参数爆炸的构造函数来创建对象；
 */
public class BuilderTest {

    public static void main(String[] args) {
        Product prd = new Product("IncasePack",1500);
//        prd.setCode("001");
//        prd.setDesc("incase");
//        prd.setWeight(3);

        prd.setWeight(3).setDesc("incase").setCode("002");

        System.out.println(prd);

    }


}
