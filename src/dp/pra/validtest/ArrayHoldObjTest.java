package dp.pra.validtest;

import java.util.Arrays;

/**
 * @author mrficus
 * 数组可以持有基本类型，和对象
 * 只不过对于对象数组来说，是存放的对象的引用
 *
 * 而对于容器来说，是持有的对象，不能直接持有基本类型
 * 如果是基本类型，则要转为对应的包装类对象；
 */
public class ArrayHoldObjTest {
    //验证数组持有对象
    public static void main(String[] args) {
        Product [] products = new Product[3];
        products[0]=new Product("p1",100);
        products[1]=new Product("p2",108);
        products[2]=new Product("p3",300);
        System.out.println(products);
        System.out.println(Arrays.deepToString(products));
    }
}
