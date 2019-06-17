package dp.pra.validtest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mrficus
 */
public class ContainerTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("key1",1);
        map.put("key2",2);
        System.out.println(map);
        map.keySet().clear();//清除所有的键值映射
        System.out.println(map);
    }
}
