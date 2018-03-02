package adp.zj.com.adapterdesparttern.类适配器模式;

/**
 * Created by thinkpad on 2018/3/2.
 */

public class MacBook {

    public boolean run(int power) {

        if (power != 5) {
            return false;
        }

        System.out.println("......Book is Running......");
        return true;
    }

}
