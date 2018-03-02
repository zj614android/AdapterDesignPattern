package adp.zj.com.adapterdesparttern.类适配器模式;

/**
 * Created by thinkpad on 2018/3/2.
 */

public class AdapterClass extends Adaptee220V implements Target5V {

    @Override
    public int power_5v() {
        return power_220v() / 44;
    }

}
