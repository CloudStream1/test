package com.itheima.JdbcTemplate;

import com.itheima.domain.account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate =applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
        jdbcTemplate.execute("insert into account(name ,money) values('ddd',3333)");
        List<account> s = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<account>(account.class), 1000f);
        for (account s1:
             s) {
            System.out.println(s1);
        }
    }


}
