package dp.pra.flyweight;

import java.util.HashMap;

/**
 * 享元模式
 * Created by mrficus on 2018/9/11.
 */
public class ShapeFactory {

    private static final HashMap<String ,Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle=(Circle)circleMap.get(color);

        if(circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Createing circle of color :"+color);

        }
        return circle;
    }
}
