package adp.zj.com.adapterdesparttern.对象适配器模式;


import adp.zj.com.adapterdesparttern.类适配器模式.Adaptee220V;
import adp.zj.com.adapterdesparttern.类适配器模式.MacBook;

/**
 * Created by thinkpad on 2018/3/2.
 */

public class ObjectAdapterTest {

    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        AdapterObject adapter = new AdapterObject(new Adaptee220V());
        macBook.run(adapter.power_5v());
    }

}
