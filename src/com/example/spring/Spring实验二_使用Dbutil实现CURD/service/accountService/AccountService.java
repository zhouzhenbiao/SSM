package com.example.spring.Spring实验二_使用Dbutil实现CURD.service.accountService;

import com.example.spring.Spring实验二_使用Dbutil实现CURD.entity.Account;

import java.util.List;

public interface AccountService {
    boolean save(Account account);

    boolean update(Account account);

    boolean delete(long accountId);

    Account findById(long accountId);

    List<Account> findAll();
}
