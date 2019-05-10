package dp.pra.designpattern.factory;

/**
 *简单工厂模式
 */
public class ShapeFactory {

   public  Shape getShape(String shapeType){
       if(shapeType==null||shapeType.length()<1){
           return null;
       }
       else if(shapeType.equalsIgnoreCase("circle")){
           return new Circle();
       }
       else if(shapeType.equalsIgnoreCase("rectangle")){
           return new Rectangle();
       }
       else if(shapeType.equalsIgnoreCase("square")){
           return new Square();
       }
       else{
           return null;
       }
   }
}
