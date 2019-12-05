package dp.pra.designpattern.factory;

/**
 * @author DamonFicus
 */
public class SquareFactory extends ShapeFactoryMethod {
    @Override
    public Shape createShape() {
        reserveOptions();
        return new Square();
    }
    @Override
    public void reserveOptions(){
        System.out.println("SquareFactory will create Square");
    }
}
