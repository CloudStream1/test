package com.itheima.service.impl;

import com.itheima.domain.account;
import com.itheima.service.IAccountService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    @Override
    public void updateAccount(Integer id,String name ,Float money) {
        System.out.println("执行了更新");

    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }

    @Override
    public List<account> findAll() {
        List<account> s = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<account>(account.class), 1000f);
        return s;
    }
}
