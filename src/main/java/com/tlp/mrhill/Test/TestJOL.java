package com.tlp.mrhill.Test;

import com.tlp.mrhill.model.User;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

/**
 * @author yangzhao
 * @Description 
 * @Date 14:28 2020/3/16
 * @Param
 * @return  
 **/
public class TestJOL {
    static User user;
    public static void main(String[] args) {
        System.out.println("hahah");
        user = new User();
        System.out.println("befor lock");
        System.out.println(ClassLayout.parseInstance(user).toPrintable());
        //加锁
        sysn(user);
        System.out.println("after lock");
        System.out.println(ClassLayout.parseInstance(user).toPrintable());
    }

    /**
     * @author yangzhao
     * @Description 加锁操作
     * @Date 12:17 2020/3/16
     * @Param []
     * @return void
     **/
    public static void sysn(User user){
        synchronized (user){
            System.out.println("lock ing");
            System.out.println(ClassLayout.parseInstance(user).toPrintable());
        }
    }
}
