package com.yuejinfu.test;


import com.yuejinfu.domain.User;
import org.junit.Test;
import com.yuejinfu.util.toWebUtil;

public class SpringTest {


    @Test
    public  void test01(){
        User user=new User();
        user.setName("张三");
        user.setAge(18);

        String s = toWebUtil.successJson(user);
        System.out.println(s);


    }
}
