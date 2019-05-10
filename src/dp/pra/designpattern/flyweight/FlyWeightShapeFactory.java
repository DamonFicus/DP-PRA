package dp.pra.designpattern.flyweight;

import java.util.HashMap;

/**
 * 享元模式
 *
 * @author mrficus
 * @date 2018/9/11
 * git subversions
 */
public class FlyWeightShapeFactory {

    private static final HashMap<String ,FlyWeightShape> circleMap = new HashMap<String,FlyWeightShape>();

    public static FlyWeightShape getCircle(String color){

        FlyWeightCircle flyWeightCircle =(FlyWeightCircle)circleMap.get(color);

        if(flyWeightCircle ==null){
            flyWeightCircle =new FlyWeightCircle(color);
            circleMap.put(color, flyWeightCircle);
            System.out.println("Createing flyWeightCircle of color :"+color);

        }

        return flyWeightCircle;
    }
}
