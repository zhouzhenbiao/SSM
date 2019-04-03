package com.example.spring.Spring实验四_使用注解IOC改造账户CURD.service.accountService;

import com.example.spring.Spring实验四_使用注解IOC改造账户CURD.entity.Account;

import java.util.List;

public interface AccountService {
    boolean save(Account account);

    boolean update(Account account);

    boolean delete(long accountId);

    Account findById(long accountId);

    List<Account> findAll();
}
