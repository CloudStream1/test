package com.itheima.test;

import com.itheima.domain.account;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class test {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService =applicationContext.getBean("IAccountService",IAccountService.class);
       // IAccountService IAccountService = new AccountServiceImpl();
        List<account> a = accountService.findAll();
        for (account a1:a
             ) {
            System.out.println(a1);
        }
    }
}
