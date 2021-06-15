package com.itheima.service;

import com.itheima.domain.account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 模拟保存账户
     */
   void saveAccount();

    /**
     * 模拟更新账户
     * @param i
     */
   void updateAccount(Integer id,String name ,Float money);

    /**
     * 删除账户
     * @return
     */
   int  deleteAccount();
   List<account> findAll();
}
