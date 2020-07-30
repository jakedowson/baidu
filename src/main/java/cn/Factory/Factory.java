package cn.Factory;

import cn.dao.Phone;
import cn.implement.HuaWei;
import cn.implement.Iphone;

public class Factory {
    public Phone createPhone(String phoneName){
        if ("HuaWei".equals(phoneName)){
            return new HuaWei();
        }else if ("Apple".equals(phoneName)){
            return new Iphone();
        }else {
            return null;
        }
    }
}
