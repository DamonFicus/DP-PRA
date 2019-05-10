package dp.pra.designpattern.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside FlyWeightCircle::draw() method.");
    }
}
