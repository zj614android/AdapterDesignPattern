package adp.zj.com.adapterdesparttern.对象适配器模式;


import adp.zj.com.adapterdesparttern.类适配器模式.Adaptee220V;
import adp.zj.com.adapterdesparttern.类适配器模式.Target5V;

/**
 * Created by thinkpad on 2018/3/2.
 */

public class AdapterObject implements Target5V {

    Adaptee220V mAdapee220V = null;

    public AdapterObject(Adaptee220V mAdapee220V) {
        this.mAdapee220V = mAdapee220V;
    }

    @Override
    public int power_5v() {
        int i = 0;
        if (null != mAdapee220V) {
            i = mAdapee220V.power_220v();
        }
        return i / 44;
    }

    public void setmAdapee220V(Adaptee220V mAdapee220V) {
        this.mAdapee220V = mAdapee220V;
    }

}
