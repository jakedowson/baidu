package cn;

import cn.Factory.Factory;
import cn.dao.Phone;

public class Test {
    public static void main(String[] args) {
        Factory factory =new Factory();

        Phone huaWei = factory.createPhone("HuaWei");
        Phone apple = factory.createPhone("Apple");
        System.out.println(huaWei.brand());
        System.out.println(apple.brand());
    }

}
