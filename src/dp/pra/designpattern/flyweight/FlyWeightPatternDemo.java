package dp.pra.designpattern.flyweight;

/**
 *享元模式
 * 对对象进行重用，减少资源的耗占
 * 对于大量的对象，或大量的大对象时，使用时会起到优化的效果
 *
 * 常用构成的条件元素：
 * 1.产生对象的工厂
 * 2.hashMap之类的一个容器，用来存放和判断是否已经存在可以重用的对象；
 * @author mrficus
 * @date 2018/9/11
 */
public class FlyWeightPatternDemo {

    private static final String COLORS[] ={"Red","Green","Blue","Yellow","White","Black"};



    public static void main(String[] args) {

        for(int i=0;i<20;i++){
           FlyWeightCircle flyWeightCircle = (FlyWeightCircle) FlyWeightShapeFactory.getCircle(getRandomColor());
           flyWeightCircle.setX(getRandomX());
           flyWeightCircle.setY(getRandomY());
           flyWeightCircle.setRadius(100);
           flyWeightCircle.draw();

        }
    }

    private static String  getRandomColor(){
        return COLORS[(int)(Math.random()*COLORS.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
