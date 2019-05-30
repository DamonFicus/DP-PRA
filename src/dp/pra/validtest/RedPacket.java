package dp.pra.validtest;

import java.util.Random;

/**
 * @author mrficus
 * 红包算法
 */
public class RedPacket {
    private int leftMoney;
    private int leftNum;
    private Random rnd;

    public RedPacket(int leftMoney, int leftNum) {
        this.leftMoney = leftMoney;
        this.leftNum = leftNum;
        this.rnd = new Random();
    }

    public synchronized int nextMoney(){
        if(this.leftNum<=0){
            throw new IllegalStateException("抢光了");
        }
        if(this.leftNum==1){
            return this.leftMoney;
        }

        double max = this.leftMoney/this.leftNum*2d;
        int money =(int)(rnd.nextDouble()*max);
        money=Math.max(1,money);
        this.leftMoney-=money;
        this.leftNum--;
        return money;
    }

    public static void main(String[] args) {
        RedPacket rp = new RedPacket(100,10);
        for(int i=0;i<10;i++){
            System.out.println(rp.nextMoney());
        }
    }
}
