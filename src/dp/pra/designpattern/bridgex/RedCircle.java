package dp.pra.designpattern.bridgex;

/**
 * Created by DamonFicus on 2018/11/2.
 * @author DamonFicus
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing FlyWeightCircle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
