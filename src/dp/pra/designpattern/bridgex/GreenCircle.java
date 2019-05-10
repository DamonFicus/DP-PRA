package dp.pra.designpattern.bridgex;

/**
 * Created by DamonFicus on 2018/11/2.
 * @author DamonFicus
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing FlyWeightCircle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
