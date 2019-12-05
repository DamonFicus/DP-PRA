package dp.pra.validtest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 不确定的细节或效果
 * 写demo验证；
 */
public class ValidTest {

    public void dbParaToStringPrint(){
        //验证DB中取出来的内容，如果是Object存放的时候，取出进行toString解密的时候，会不会得到的是一个地址串
        //结论，oracle中存放的格式string number 以及日期类型，出来后，自己本身的toString 方法已经被底层重写
        //所以toString 后得到的仍是可读的显示串儿，并不会是原始的对象地址，所以可以拿这个去进行加解密处理；
        String s="validtest";
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("valid",s);
        map.put("no",new Integer(1));
        map.put("double",1.00);
        map.put("date",new Date());

        System.out.println(map.get("valid").toString());
        System.out.println(map.get("no").toString());
        System.out.println(map.get("double").toString());
        System.out.println(map.get("date").toString());

    }



    public static void main(String[] args) {

        ValidTest validTest = new ValidTest();
        validTest.dbParaToStringPrint();


    }
}
