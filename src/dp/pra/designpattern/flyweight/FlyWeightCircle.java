package dp.pra.designpattern.flyweight;

/**
 * Created by mrficus on 2018/9/11.
 */
public class FlyWeightCircle implements FlyWeightShape {

    private String color;
    private int x;
    private int y;
    private int radius;


    public FlyWeightCircle(String color){
        this.color=color;

    }

    @Override
    public void draw() {
        System.out.println("FlyWeightCircle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
