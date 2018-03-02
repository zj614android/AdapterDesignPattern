package adp.zj.com.adapterdesparttern.类适配器模式;

/**
 * Created by thinkpad on 2018/3/2.
 */

public class ClassAdapterTest {

    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        AdapterClass adapter = new AdapterClass();
        macBook.run(adapter.power_5v());
    }

}
