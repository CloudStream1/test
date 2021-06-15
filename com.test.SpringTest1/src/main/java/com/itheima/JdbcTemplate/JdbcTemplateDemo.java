package com.itheima.JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class JdbcTemplateDemo {
    public static void main(String[] args) throws FileNotFoundException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties =new Properties() ;
        InputStream inputStream= new FileInputStream("jdbc.properties");

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test1");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");


    }
}
