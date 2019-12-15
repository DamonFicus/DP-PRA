package dp.pra.designpattern.factory;

/**
 *简单工厂模式
 * @author DamonFicus
 */
public class ShapeFactory {

    private static final String CIRCLE="circle";
    private static final String RECTANGLE="rectangle";
    private static final String SQUARE="square";

   public  Shape getShape(String shapeType){
       if(shapeType==null||shapeType.length()<1){
           return null;
       }
       else if(CIRCLE.equalsIgnoreCase(shapeType)){
           return new Circle();
       }
       else if(RECTANGLE.equalsIgnoreCase(shapeType)){
           return new Rectangle();
       }
       else if(SQUARE .equalsIgnoreCase(shapeType)){
           return new Square();
       }
       else{
           return null;
       }
   }
}
