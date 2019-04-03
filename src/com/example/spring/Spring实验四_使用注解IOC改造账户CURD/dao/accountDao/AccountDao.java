package com.example.spring.Spring实验四_使用注解IOC改造账户CURD.dao.accountDao;

import com.example.spring.Spring实验四_使用注解IOC改造账户CURD.entity.Account;

import java.util.List;

public interface AccountDao {
    boolean save(Account account);
    boolean update(Account account);
    boolean delete(long accountId);
    Account findById(long accountId);
    List<Account> findAll();
}
